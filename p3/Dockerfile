# Usa una imagen base de Java 21
FROM eclipse-temurin:21-jdk

# Establece el directorio de trabajo en el contenedor
WORKDIR /app

# Copia el archivo .jar desde la ruta correcta en tu sistema local al contenedor
COPY target/p3-0.0.1-SNAPSHOT.jar app.jar

# Expone el puerto (Render usará la variable PORT)
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]
