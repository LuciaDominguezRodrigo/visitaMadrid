# Imagen base con Java 21
FROM eclipse-temurin:21-jdk

# Establece el directorio de trabajo
WORKDIR /app

# Copia el jar compilado al contenedor
COPY target/*.jar app.jar

# Expone el puerto (Render usará la variable PORT)
EXPOSE 8080

# Usa la variable $PORT si está disponible, sino 8080 por defecto
ENV PORT=8080

# Ejecuta la aplicación Spring Boot
ENTRYPOINT ["sh", "-c", "java -jar app.jar --server.port=$PORT"]
