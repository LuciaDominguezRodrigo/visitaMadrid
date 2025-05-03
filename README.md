
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


## 💼 Cumplimiento con las pautas WCAG 2.2 Nivel AA

Este sitio web cumple con las **pautas de accesibilidad WCAG 2.2 nivel AA** por las siguientes razones:

### 1. Uso correcto de la semántica HTML
- **Encabezados apropiados**: El uso de los elementos HTML semánticos como `<h1>`, `<h2>` para títulos y subtítulos asegura una estructura jerárquica adecuada.

### 2. Atributos ARIA
- Se utilizan los atributos **ARIA** correctamente, como `aria-label`, `aria-labelledby`, y `role`, para proporcionar contexto adicional a los elementos interactivos y mejorar la experiencia de usuarios con tecnologías asistivas.

### 3. Texto alternativo en imágenes y videos
- Todas las imágenes y videos tienen **atributos `alt` y `title`** que permiten que los usuarios con discapacidad visual comprendan el contenido de los medios.

### 4. Contrastes de color y opciones de personalización
- Se implementaron botones para cambiar a una **fuente disléxica** y activar un **modo de alto contraste**, lo que mejora la legibilidad y accesibilidad para los usuarios con dificultades visuales.

### 5. Formularios accesibles
- Los formularios incluyen **etiquetas `label`** y atributos como **`aria-required`**, lo que facilita su uso para usuarios con tecnologías de asistencia.

### 6. Validación de HTML
- El código HTML fue validado con el **validador W3C** para asegurar que sigue los estándares de la web.

### 7. Certificación de accesibilidad
- Se ha agregado un ícono de validación en el pie de página que indica que el sitio cumple con el **nivel AA** de accesibilidad según WCAG 2.2.

### 8. Validación con herramientas externas
- El sitio debe ser validado usando herramientas como **WAVE**, **Pa11y**, **axe DevTools**, y otros, para garantizar su accesibilidad completa. El proceso de validación debe completarse externamente.

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
