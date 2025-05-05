function toggleDyslexicFont() {
    document.body.classList.toggle("dyslexic");
}

function toggleContrast() {
    document.body.classList.toggle("high-contrast");
}
// Copia el valor del radio seleccionado en el campo oculto antes de enviar
document.getElementById("postalForm").addEventListener("submit", function () {
    const selected = document.querySelector('input[name="imgChoice"]:checked');
    if (selected) {
        document.getElementById("imagenSeleccionada").value = selected.value;
    }
});

document.querySelectorAll('.selectable-image').forEach((img) => {
    img.addEventListener('click', () => {
        // Desmarcar todas
        document.querySelectorAll('.selectable-image').forEach((i) => {
            i.classList.remove('selected');
        });

        // Marcar actual
        img.classList.add('selected');

        // Activar el input radio correspondiente
        const radio = img.previousElementSibling;
        if (radio) {
            radio.checked = true;
        }
    });
});

document.getElementById("postalForm").addEventListener("submit", async function (event) {
    event.preventDefault();

    // Copiar el valor del radio seleccionado al campo oculto
    const selected = document.querySelector('input[name="imgChoice"]:checked');
    if (selected) {
        document.getElementById("imagenSeleccionada").value = selected.value;
    }

    const form = event.target;
    const formData = new FormData(form);

    const response = await fetch("/enviar", {
        method: "POST",
        body: formData
    });

    const status = document.getElementById("statusMessage");

    if (response.redirected) {
        alert("¡Postal enviada con éxito!");
        window.location.href = response.url;
    } else {
        status.textContent = "Hubo un error al enviar la postal.";
    }
});



