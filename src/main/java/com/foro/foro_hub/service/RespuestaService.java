package com.foro.foro_hub.service;

import com.foro.foro_hub.Controller.RespuestaDTO;
import com.foro.foro_hub.entity.Respuesta;
import com.foro.foro_hub.repository.RespuestaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RespuestaService {

    @Autowired
    private RespuestaRepository respuestaRepository;

    public static Object createRespuesta(RespuestaDTO respuestaDTO) {
        return null;
    }


    // Método para obtener todas las respuestas
    public List<Respuesta> getAllRespuestas() {
        return respuestaRepository.findAll(); // Obtener todas las respuestas desde el repositorio
    }

    // Método para guardar una nueva respuesta
    public Respuesta respuesta(Respuesta respuesta) {
        if (respuesta != null) {
            return respuestaRepository.save(respuesta); // Guardar la respuesta en la base de datos
        }
        return null; // Si la respuesta es null, retornamos null
    }

    // Método para eliminar una respuesta por id
    public void deleteRespuesta(Long id) {
        respuestaRepository.deleteById(id); // Eliminar la respuesta por su id
    }
}
