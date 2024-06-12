package com.claudio.RedSocialMyPets.models;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="mascotas")



public class Mascota  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String tipo;
    private String edad;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;


    public Mascota(Long id, String nombre, String tipo, String edad, Usuario usuario) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
        this.usuario = usuario;
    }

    public Mascota() {

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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}





