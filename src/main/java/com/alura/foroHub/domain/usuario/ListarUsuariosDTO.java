package com.alura.foroHub.domain.usuario;

public record ListarUsuariosDTO (
        Long id,
        String nombre,
        String email
){
    public ListarUsuariosDTO(Usuario usuario){

        this(usuario.getId(),usuario.getNombre(),usuario.getEmail());
    }
}