function toggleDyslexicFont() {
    document.body.classList.toggle("dyslexic");
}

function toggleContrast() {
    document.body.classList.toggle("high-contrast");
}

document.getElementById("postal-form").addEventListener("submit", function(event) {
    event.preventDefault();

    const nombre = document.getElementById("nombre").value;
    const email = document.getElementById("email").value;
    const mensaje = document.getElementById("mensaje").value;

    // Validación básica (aún sin un servicio de envío real)
    if (nombre && email && mensaje) {
        alert("¡Postal enviada con éxito!");
    } else {
        alert("Por favor, completa todos los campos.");
    }
});
