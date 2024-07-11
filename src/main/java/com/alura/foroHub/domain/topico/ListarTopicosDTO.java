package com.alura.foroHub.domain.topico;

import java.time.LocalDateTime;

public record ListarTopicosDTO(
        Long id,
        String titulo,
        String mensaje,
        Status status,
        Long usuario_Id,
        String curso,
        LocalDateTime fechaCreacion
) {
    public ListarTopicosDTO (Topico topico){
        this(
                topico.getId(),
                topico.getTitulo(),
                topico.getMensaje(),
                topico.getStatus(),
                topico.getAutor().getId(),
                topico.getCurso(),
                topico.getFecha());

    }
}