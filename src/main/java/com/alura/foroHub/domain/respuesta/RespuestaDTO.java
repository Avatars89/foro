package com.alura.foroHub.domain.respuesta;

import com.alura.foroHub.domain.topico.Topico;
import com.alura.foroHub.domain.usuario.Usuario;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record RespuestaDTO(
        @NotBlank
        String solucion,
        @NotBlank
        String mensaje,
        @NotNull
        @Valid
        Long usuario_Id,
        @NotNull
        @Valid
        Long topico_Id,
        LocalDateTime fechaCreacion) {
}