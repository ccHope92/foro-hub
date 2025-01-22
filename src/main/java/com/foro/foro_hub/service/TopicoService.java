package com.foro.foro_hub.service;

import com.foro.foro_hub.entity.Topico;
import com.foro.foro_hub.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicoService {

    @Autowired
    private TopicoRepository topicoRepository;

    public Topico crearTopico(Topico topico) {
        return topicoRepository.save(topico);
    }

    public List<Topico> obtenerTopicos() {
        return topicoRepository.findAll();
    }
}
