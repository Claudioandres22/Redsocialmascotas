package com.claudio.RedSocialMyPets.models;


import jakarta.persistence.*;
import org.springframework.web.bind.annotation.GetMapping;

@Entity
public class Publicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String contenido;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "mascota_id")
    private Mascota mascota;


    public Publicacion(int id, Mascota mascota, String contenido, Usuario usuario) {
        this.id = id;
        this.mascota = mascota;
        this.contenido = contenido;
        this.usuario = usuario;
    }

    public Publicacion() {}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
