package com.alura.foroHub.domain.usuario.validaciones;


import com.alura.foroHub.domain.usuario.RegistroUsuarioDTO;

public interface ValidadorDeUsuario {

    public void validate(RegistroUsuarioDTO RegistroUsuarioDTO);
}