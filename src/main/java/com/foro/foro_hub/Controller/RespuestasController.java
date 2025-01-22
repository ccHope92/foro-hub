package com.foro.foro_hub.Controller;


import com.foro.foro_hub.service.RespuestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/respuestas")
public class RespuestasController {

    @Autowired
    private RespuestaService respuestaService;

    @PostMapping
    public ResponseEntity<?> crearRespuesta(@RequestBody RespuestaDTO respuestaDTO) {
        return ResponseEntity.ok(RespuestaService.createRespuesta(respuestaDTO));
    }

    @GetMapping
    public ResponseEntity<?> obtenerRespuestas() {
        return ResponseEntity.ok(respuestaService.getAllRespuestas());
    }
}
