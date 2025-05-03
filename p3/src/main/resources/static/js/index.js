function toggleDyslexicFont() {
    document.body.classList.toggle("dyslexic");
}

function toggleContrast() {
    document.body.classList.toggle("high-contrast");
}

document.getElementById("postalForm").addEventListener("submit", async function(event) {
    event.preventDefault();

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