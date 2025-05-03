package com.multimedia.p3.services;

import com.multimedia.p3.entities.Postal;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;

@Service
public class DatabaseInitializer {

    @Autowired
    private PostalService postalService;

    @PostConstruct
    public void init() throws IOException {
        // Cargar imagen de recurso
        ClassPathResource imageFile = new ClassPathResource("/static/images/img.png");
        InputStream inputStream = imageFile.getInputStream();
        byte[] imageBytes = inputStream.readAllBytes();

        // Crear postales con los campos correctos
        Postal p1 = new Postal(null, "Postal de la Sagrada Familia", "Barcelona",
                "destinatario1@example.com", "Saludos desde la Sagrada Familia!",
                imageBytes, LocalDate.of(2023, 1, 10));
        Postal p2 = new Postal(null, "Postal del Retiro", "Madrid",
                "destinatario2@example.com", "Un día precioso en el Retiro!",
                imageBytes, LocalDate.of(2022, 12, 5));
        Postal p3 = new Postal(null, "Postal de la Giralda", "Sevilla",
                "destinatario3@example.com", "¡Qué maravilla la Giralda!",
                imageBytes, LocalDate.of(2024, 5, 1));

        // Guardar en base de datos
        postalService.save(p1);
        postalService.save(p2);
        postalService.save(p3);

        System.out.println("Base de datos inicializada con postales de prueba.");
    }
}
