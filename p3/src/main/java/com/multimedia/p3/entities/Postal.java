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

    private String location;

    private String title;

    private String description;

    private LocalDate date;

    @Lob
    private byte[] photo;

    public Postal() {
    }

    public Postal(Long id, byte[] photo, LocalDate date, String description, String location) {
        this.id = id;
        this.photo = photo;
        this.date = date;
        this.description = description;
        this.location = location;
    }
}
