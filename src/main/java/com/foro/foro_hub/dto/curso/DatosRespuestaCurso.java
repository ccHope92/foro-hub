package com.foro.foro_hub.dto.curso;

import com.foro.foro_hub.entity.Topico; // Asegúrate de que la clase Curso esté en este paquete

public record DatosRespuestaCurso(String nombre, String categoria) {

    public DatosRespuestaCurso(Curso curso) {
        this(curso.getNombre(), curso.getCategoria());
    }
}
