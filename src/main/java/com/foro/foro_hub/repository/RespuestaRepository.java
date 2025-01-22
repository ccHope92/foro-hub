package com.foro.foro_hub.repository;

import com.foro.foro_hub.entity.Respuesta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RespuestaRepository extends JpaRepository<Respuesta, Long> {
    // No es necesario definir el método save, JpaRepository lo proporciona por defecto.
}
