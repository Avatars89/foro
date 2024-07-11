package com.alura.foroHub.domain.respuesta;

import java.time.LocalDateTime;

public record ListarRespuestasDTO(Long id,
                                String solucion,
                                String mensaje,
                                Long usuario_Id,
                                Long topico_Id,
                                LocalDateTime fechaCreacion) {
    public ListarRespuestasDTO(Respuesta respuesta){
        this(respuesta.getId(),
                respuesta.getSolucion(),
                respuesta.getMensaje(),
                respuesta.getAutor().getId(),
                respuesta.getTopico().getId(),
                respuesta.getFechaCreacion());
    }
}
