# Usa una imagen base con Java 21
FROM eclipse-temurin:21-jdk

# Establece el directorio de trabajo en el contenedor
WORKDIR /app

# Copia el archivo JAR desde tu máquina local al contenedor
COPY p3-0.0.1-SNAPSHOT.jar app.jar

# Copia las plantillas y recursos
COPY src/main/resources /app/src/main/resources

EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]
