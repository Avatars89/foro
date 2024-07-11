package com.alura.foroHub.domain.usuario;

import jakarta.validation.constraints.NotNull;

public record ActualizacionUsuarioDTO(
        @NotNull Long id,
        String nombre,
        String email
) {
}