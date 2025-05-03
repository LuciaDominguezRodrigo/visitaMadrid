
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

### Nivel A

El nivel **A** cubre las necesidades más básicas de accesibilidad. Si un sitio no cumple con los requisitos de nivel A, se considera inaceptable para muchos usuarios con discapacidades.

### Cumplimiento en Nivel A:

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

### Nivel AA

El nivel **AA** es un nivel intermedio que aborda problemas de accesibilidad que afectan a una gran parte de los usuarios, como aquellos con dificultades visuales o cognitivas.

#### Cumplimiento en Nivel AA:

1.  **Contraste de colores (Normativa WCAG 2.2)**:
    * Se han implementado medidas para garantizar un adecuado contraste entre los colores del texto y el fondo.
    * Se recomienda verificar el contraste de los colores específicos en el archivo CSS utilizando herramientas como el [Contrast Checker](https://webaim.org/resources/contrastchecker/).

2.  **Mejoras en la navegación con teclado**:
    * Se han añadido elementos que son completamente navegables usando el teclado, lo cual es esencial para usuarios con discapacidad motora. Los botones de accesibilidad (Fuente Disléxica, Alto Contraste) están correctamente etiquetados con `aria-label` para facilitar su uso con teclados y lectores de pantalla.

    ```html
    <button onclick="toggleDyslexicFont()" aria-label="Activar fuente disléxica">Fuente Disléxica</button>
    <button onclick="toggleContrast()" aria-label="Activar alto contraste">Alto Contraste</button>
    ```

3.  **Certificación de accesibilidad**:
    * Se ha incluido el ícono que certifica que el sitio cumple con el nivel de accesibilidad AA de WCAG 2.2.

    ```html
    <div class="accessibility-certification">
        <img src="[https://www.w3.org/WAI/wcag2AA](https://www.w3.org/WAI/wcag2AA)" alt="Accesibilidad nivel AA conforme a WCAG 2.2" style="width: 50px;">
        <p>Sitio validado con cumplimiento AA de accesibilidad</p>
    </div>
    ```

4.  **Contenido multimedia accesible**:
    * Los videos embebidos en el sitio cuentan con descripciones de los contenidos mediante el atributo `aria-label`, lo que mejora la accesibilidad para personas con discapacidad visual. Se recomienda agregar subtítulos en los videos para cumplir con los requisitos de accesibilidad de nivel AA.

    ```html
    <iframe
        src="[https://www.youtube.com/embed/JyNcxQftlIk](https://www.youtube.com/embed/JyNcxQftlIk)"
        allowfullscreen
        title="Video panorámico de los Jardines del Campo del Moro"
        aria-label="Reproducción de video panorámico sobre los Jardines del Campo del Moro">
    </iframe>
    ```

5.  **Validación del código HTML**:
    * El sitio está validado utilizando el validador de HTML W3C, lo que garantiza que el código sigue las mejores prácticas de accesibilidad y no contiene errores que puedan afectar su rendimiento o accesibilidad.

    ```html
    <a href="[https://validator.w3.org/](https://validator.w3.org/)" target="_blank" rel="noopener">
        <img src="[https://www.w3.org/Icons/valid-html401](https://www.w3.org/Icons/valid-html401)" alt="HTML válido por W3C" style="width: 50px; height: auto;"/>
    </a>
    ```

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
