package com.alura.foroHub.domain.respuesta;

import java.time.LocalDateTime;

public record RespuestaCreadaDTO(
        Long id,
        String solution,
        String mensaje,
        Long usuario_Id,
        Long topico_Id,
        LocalDateTime creationDate
) {
    public RespuestaCreadaDTO(Respuesta rVerified) {
        this(rVerified.getId(),rVerified.getSolucion(), rVerified.getMensaje(), rVerified.getAutor().getId(),rVerified.getTopico().getId(),rVerified.getFechaCreacion());
    }
}