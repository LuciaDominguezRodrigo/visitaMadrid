
# 🌿 Jardines de Sabatini y Campo del Moro – Página Web Interactiva

## 👥 Autores
- **Marcos Jiménez Pulido**
- **Lucía Domínguez Rodrigo**

## 📚 Práctica 3 – Multimedia (Grado en Ingeniería)

Este proyecto es parte de la **Práctica 3** de la asignatura de **Multimedia**, donde desarrollamos una página web accesible y atractiva para promocionar los **Jardines de Sabatini y el Campo del Moro**, dos espacios históricos y naturales ubicados junto al Palacio Real de Madrid.

---

## 🌐 ¿Qué ofrece la web?

✨ **Contenido principal:**
- Información histórica y visual de los jardines.
- Galería con imágenes y video panorámico.
- Estilo accesible con opciones de:
  - Fuente disléxica.
  - Modo de alto contraste.

📬 **Funcionalidad destacada:**
- **Envío de postales virtuales**: los usuarios pueden simular el envío de una imagen o foto tomada en los jardines a un amigo mediante un sencillo formulario.

---

## 🧱 Tecnologías usadas

- HTML5, CSS3, JavaScript
- Spring Boot + Mustache
- Estándares de accesibilidad (WAI-ARIA)
- Fuentes de Google (`Open Dyslexic`)
- Responsive Design

---

## 📂 Estructura del proyecto

```
src/
├── main/
│   ├── java/com/multimedia/p3/...       # Backend en Java (Spring Boot)
│   ├── resources/
│   │   ├── static/                       # Archivos estáticos: CSS, JS, imágenes
│   │   └── templates/                    # Plantillas Mustache
└── ...
```

---

## 🚀 Cómo ejecutar el proyecto

1. Clona el repositorio:
   ```bash
   git clone https://github.com/LuciaDominguezRodrigo/visitaMadrid.git
   ```
2. Abre el proyecto con tu IDE de preferencia (IntelliJ, Eclipse...).
3. Ejecuta la aplicación Spring Boot.
4. Abre tu navegador y accede a:
   ```
   http://localhost:8080/
   ```

---
## 💼 Accesibilidad WCAG 2.2 - Jardines del Campo del Moro

Este documento describe cómo el sitio web **Jardines del Campo del Moro** cumple con las pautas de accesibilidad WCAG 2.2 en los niveles **A** y **AA**.

### Niveles de Conformidad

El sitio web ha sido diseñado y validado para cumplir con los estándares de accesibilidad definidos en la normativa **WCAG 2.2**. Estas pautas son aplicables para hacer el contenido web accesible a personas con discapacidades, lo que incluye usuarios con discapacidades visuales, auditivas, motoras y cognitivas.

#### Nivel A

El nivel **A** cubre las necesidades más básicas de accesibilidad. Si un sitio no cumple con los requisitos de nivel A, se considera inaceptable para muchos usuarios con discapacidades.

##### Cumplimiento en Nivel A:

1.  **Contenido accesible para los lectores de pantalla (atributos ARIA)**:
    * Se han implementado atributos **ARIA** como `aria-labelledby`, `aria-required`, `aria-label`, y `aria-describedby` para proporcionar información adicional a los usuarios de lectores de pantalla.
    * **Ejemplo:** El formulario tiene etiquetas claras y relacionadas con los campos de entrada como `aria-required="true"` y `aria-describedby="form-desc"`.

    ```html
    <label for="nombre">Tu nombre</label>
    <input type="text" id="nombre" name="nombre" required aria-required="true" />
    ```

2.  **Etiquetas claras y accesibles para formularios**:
    * Los campos del formulario están claramente etiquetados con `<label>` asociados a los campos de entrada mediante el atributo `for`, lo que mejora la accesibilidad para los usuarios de lectores de pantalla.

    ```html
    <label for="nombre">Tu nombre</label>
    <input type="text" id="nombre" name="nombre" required aria-required="true" />
    ```

3.  **Texto alternativo en imágenes:**
    * Las imágenes contienen atributos `alt` con descripciones adecuadas para los usuarios con discapacidades visuales.

    ```html
    <img src="[https://www.nochemad.com/photos/jardines-de-sabatini_img:v2931.jpg](https://www.nochemad.com/photos/jardines-de-sabatini_img:v2931.jpg)" alt="Vista de los Jardines del Campo del Moro con el Palacio Real al fondo" />
    ```

## Nivel AA

El nivel **AA** es un nivel intermedio que aborda problemas de accesibilidad que afectan a una gran parte de los usuarios, como aquellos con dificultades visuales o cognitivas.

### Cumplimiento en Nivel AA:

1.  **Modos de accesibilidad**:
    * Se han implementado modos de accesibilidad que los usuarios pueden activar para personalizar su experiencia:
        * `.dyslexic`: Activa la fuente Open Dyslexic para mejorar la legibilidad para usuarios con dislexia.
        * `.high-contrast`: Aplica un modo de alto contraste, invirtiendo el fondo y el texto, y estilizando elementos de formulario para mejorar la visibilidad.

2.  **Contrastes adecuados**:
    * Los colores definidos en la hoja de estilos (`:root`) presentan buenos contrastes, asegurando la legibilidad del texto sobre el fondo.
    * **Ejemplos:**
        * Texto negro (`#2e2e2e`) sobre fondo claro (`#f5f5f5`).
        * Texto blanco (`#fff`) sobre botones y cabeceras de color intenso (`#009e73` / `#0072b2`).

3.  **Enfoque visual claro**:
    * Se ha definido un estilo claro para el enfoque de los elementos interactivos (inputs, textareas, botones) cuando se navega con el teclado, utilizando la propiedad `outline`.

    ```css
    input:focus, textarea:focus, button:focus {
        outline: 3px solid #8ecae6;
        outline-offset: 2px;
    }
    ```
    Esto asegura que el indicador de enfoque sea claramente visible para la navegación por teclado.

4.  **Transiciones reducidas**:
    * El sitio respeta la preferencia del usuario por reducir las animaciones, desactivando las transiciones para aquellos que lo necesiten.

    ```css
    @media (prefers-reduced-motion: reduce) {
        * {
            transition: none !important;
        }
    }
    ```
    Esto mejora la experiencia para usuarios que pueden ser sensibles a las animaciones.

5.  **Botones de accesibilidad accesibles**:
    * Se utilizan botones con atributos `aria-label` para asegurar que su función sea correctamente interpretada por los lectores de pantalla.

    ```html
    <button onclick="toggleDyslexicFont()" aria-label="Activar fuente disléxica" aria-pressed="false">Fuente Disléxica</button>
    ```

6.  **Certificación de accesibilidad**:
    * Se ha incluido el ícono que certifica que el sitio cumple con el nivel de accesibilidad AA de WCAG 2.2.

    ```html
    <div class="accessibility-certification">
        <img src="[https://www.w3.org/WAI/wcag2AA](https://www.w3.org/WAI/wcag2AA)" alt="Accesibilidad nivel AA conforme a WCAG 2.2" style="width: 50px;">
        <p>Sitio validado con cumplimiento AA de accesibilidad</p>
    </div>
    ```

7.  **Contenido multimedia accesible**:
    * Los videos embebidos en el sitio cuentan con descripciones de los contenidos mediante el atributo `aria-label`, lo que mejora la accesibilidad para personas con discapacidad visual. Se recomienda agregar subtítulos en los videos para cumplir con los requisitos de accesibilidad de nivel AA.

    ```html
    <iframe
        src="[https://www.youtube.com/embed/JyNcxQftlIk](https://www.youtube.com/embed/JyNcxQftlIk)"
        allowfullscreen
        title="Video panorámico de los Jardines del Campo del Moro"
        aria-label="Reproducción de video panorámico sobre los Jardines del Campo del Moro">
    </iframe>
    ```

8.  **Validación del código HTML**:
    * El sitio está validado utilizando el validador de HTML W3C, lo que garantiza que el código sigue las mejores prácticas de accesibilidad y no contiene errores que puedan afectar su rendimiento o accesibilidad.

    ```html
    <a href="[https://validator.w3.org/](https://validator.w3.org/)" target="_blank" rel="noopener">
        <img src="[https://www.w3.org/Icons/valid-html401](https://www.w3.org/Icons/valid-html401)" alt="HTML válido por W3C" style="width: 50px; height: auto;"/>
    </a>
    ```

9.  **Funciones de accesibilidad:**

    ```javascript
    function toggleDyslexicFont() {
        document.body.classList.toggle("dyslexic");
        const button = document.querySelector('button[aria-label="Alternar fuente disléxica"]');
        if (button) {
            button.setAttribute('aria-pressed', document.body.classList.contains('dyslexic'));
        }
    }

    function toggleContrast() {
        document.body.classList.toggle("high-contrast");
        const button = document.querySelector('button[aria-label="Alternar modo de alto contraste"]');
        if (button) {
            button.setAttribute('aria-pressed', document.body.classList.contains('high-contrast'));
        }
    }
    ```

    Estas funciones permiten cambiar entre:

    * Modo fuente disléxica (`.dyslexic`)
    * Modo alto contraste (`.high-contrast`)

    Ambos modos están correctamente definidos en tu CSS, lo que los hace completamente funcionales y cumplen con los criterios de accesibilidad adaptativa del nivel AA de WCAG 2.2.

    **🔒 Accesibilidad extra:** Se han añadido actualizaciones a los atributos `aria-pressed` de los botones para indicar su estado (activado/desactivado) a los lectores de pantalla.

10.  **Manejo accesible del formulario de postales:**

    ```javascript
    document.getElementById("postalForm").addEventListener("submit", async function(event) {
        event.preventDefault();
        // ... (lo del alert ya esta implementado)
    });
    ```

    El manejo del formulario se realiza de manera asíncrona, lo cual es una buena práctica para evitar bloqueos en la interfaz de usuario. A

---

## 📸 Video del funcionamiento

🎥 [Ver video en Google Drive](https://drive.google.com/file/d/1KAWdTpUlafLYf4CQmh--xnx3wKqIxURA/view?usp=sharing)


---

## ⌨️ Acciones con Teclado para Navegar en la Página

### 🔗 Navegar por enlaces de la barra de navegación:
- **Tab**: Navegar entre los enlaces en el encabezado (Descripción, Galería, Enviar postal).
- **Enter**: Seleccionar un enlace para ir a la sección correspondiente.

### ♿ Botones de accesibilidad:
- **Tab**: Navegar hacia los botones de accesibilidad (Fuente Disléxica, Alto Contraste).
- **Enter**: Activar el botón seleccionado (cambiar la fuente o el contraste de la página).

### 📝 Formulario:
- **Tab**: Navegar entre los campos del formulario.
- **Shift + Tab**: Volver a los campos anteriores en el formulario.
- **Enter**: Enviar el formulario cuando se selecciona el botón de "Enviar postal".

### 📅 Interacción con el campo de fecha (si se agrega):
- **Tab**: Navegar hasta el campo de fecha y luego utilizar el selector de fecha si el navegador lo soporta.
- **Shift + Tab**: Volver al campo anterior.
- **Enter**: Seleccionar una fecha si se utiliza un calendario o el campo de texto para fecha.

### 🖼️ Navegación en los elementos multimedia:
- **Tab**: Navegar hasta las imágenes o el video en la sección "Galería".
- **Enter**: Si el video es interactivo, reproducirlo; si la imagen es interactiva, abrirla en una vista más grande.

### 📬 Botón "Enviar postal":
- **Tab**: Navegar hasta el botón "Enviar postal".
- **Enter**: Activar el botón para enviar el formulario con los datos proporcionados.

### 🌐 Interacción con el contenido de la página:
- **Tab**: Navegar por todo el contenido interactivo (enlaces, botones, formularios).
- **Shift + Tab**: Volver hacia atrás a través de los elementos interactivos.

### ⚙️ Menú de opciones de accesibilidad:
- **Tab**: Navegar entre los botones de accesibilidad (Fuente Disléxica, Alto Contraste).
- **Enter**: Activar los botones de accesibilidad.

---
## 📝 Licencia

Proyecto académico sin fines comerciales.

---
