package com.foro.foro_hub.Controller;

import com.foro.foro_hub.entity.Topico;
import com.foro.foro_hub.service.TopicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoService topicoService;

    @PostMapping
    public Topico crearTopico(@RequestBody Topico topico) {
        return topicoService.crearTopico(topico);
    }

    @GetMapping
    public List<Topico> obtenerTopicos() {
        return topicoService.obtenerTopicos();
    }
}