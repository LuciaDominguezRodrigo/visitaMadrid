package com.multimedia.p3.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Blob;
import java.time.LocalDate;

@Entity
@Table (name ="Postal")
@Getter @Setter
public class Postal {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String title;

    private String message;

    private LocalDate date;

    @Lob
    private byte[] photo;

    public Postal() {
    }

    public Postal(Long id, String name, String title, String description, LocalDate date, byte[] photo) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.message = description;
        this.date = date;
        this.photo = photo;
    }
}
