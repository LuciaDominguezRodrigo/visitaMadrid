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


    if (response.redirected) {
        alert("¡Postal enviada con éxito!");
        window.location.href = response.url;
    } else {
        alert("¡Postal enviada con éxito!");
        window.location.href = "/";
    }

});

function leerTexto(id) {
    const elemento = document.getElementById(id);
    if (elemento) {
        const texto = elemento.innerText;
        const mensaje = new SpeechSynthesisUtterance(texto);
        mensaje.lang = 'es-ES';
        mensaje.rate = 1;
        window.speechSynthesis.speak(mensaje);
    }
}

function leerFormulario() {
    const texto = `
        Estás en el formulario para enviar una postal virtual.
        Primero, escribe tu nombre.
        Luego, introduce el correo electrónico del destinatario.
        A continuación, pon un título para tu postal.
        Escribe tu mensaje.
        Por último, selecciona una imagen y pulsa en enviar postal.
    `;

    const mensaje = new SpeechSynthesisUtterance(texto);
    mensaje.lang = 'es-ES'; // Español
    window.speechSynthesis.speak(mensaje);
}



