package com.foro.foro_hub.entity;

import jakarta.persistence.*;

public class Respuesta {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String contenido;

    @ManyToOne
    @JoinColumn(name = "topico_id")
    private Topico topico;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public void setId(Long id) {
    }

    // Getters y setters
}

