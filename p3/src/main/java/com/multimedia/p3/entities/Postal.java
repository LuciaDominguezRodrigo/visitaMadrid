package com.multimedia.p3.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Postal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String titulo;
    private String email;
    private String mensaje;

    @Transient
    private byte[] imagen;
    private LocalDate fechaEnvio;

    public Postal(Long id, String nombre, String titulo, String email, String mensaje, byte[] imagen, LocalDate fechaEnvio) {
        this.id = id;
        this.nombre = nombre;
        this.titulo = titulo;
        this.email = email;
        this.mensaje = mensaje;
        this.imagen = imagen;
        this.fechaEnvio = fechaEnvio;
    }

    public Postal() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String ciudad) {
        this.titulo = ciudad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public LocalDate getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(LocalDate fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public void setDestinatario(String destinatario) {
        this.email = destinatario;
    }

    public void setRemitente(String remitente) {
        this.nombre = remitente;
    }
}
