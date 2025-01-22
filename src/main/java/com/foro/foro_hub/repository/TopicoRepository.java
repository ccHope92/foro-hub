package com.foro.foro_hub.repository;

import com.foro.foro_hub.entity.Topico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicoRepository extends JpaRepository<Topico, Long> {
    // Métodos personalizados si es necesario
}
