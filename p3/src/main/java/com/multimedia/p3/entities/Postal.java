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
    private Blob photo;

    public Postal() {
    }

    public Postal(Long id, Blob photo, LocalDate date, String description, String location) {
        this.id = id;
        this.photo = photo;
        this.date = date;
        this.description = description;
        this.location = location;
    }
}
