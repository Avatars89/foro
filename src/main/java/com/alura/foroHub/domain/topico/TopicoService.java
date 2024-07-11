package com.alura.foroHub.domain.topico;

import com.alura.foroHub.domain.usuario.UsuarioRepository;
import com.alura.foroHub.infra.errors.ValidacionDeIntegridad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicoService {
    @Autowired
    private TopicoRepository topicoRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;

    public RespuestaTopicoDTO topicoCreado(TopicoDTO topicoDTO){
        if (!usuarioRepository.findById(topicoDTO.usuario_Id()).isPresent()){
            throw new ValidacionDeIntegridad("Este ID de usuario no está registrado en la base de datos.");
        }
        var titulo= topicoDTO.titulo();
        if (titulo != null && topicoRepository.existsByTituloIgnoreCase(titulo)){
            throw new ValidacionDeIntegridad("Este título ya está presente en la base de datos. Por favor revise el tópico existente.");
        }
        String mensaje = topicoDTO.mensaje();
        if (mensaje != null && topicoRepository.existsByMensajeIgnoreCase(mensaje)){
            throw new ValidacionDeIntegridad("Este mensaje ya está presente en la base de datos. Por favor revise el tópico existente.");
        }
        var usuario = usuarioRepository.findById(topicoDTO.usuario_Id()).get();
        var topicoId= new Topico(null,titulo,mensaje,topicoDTO.fecha(),topicoDTO.status(),usuario,topicoDTO.curso());
        topicoRepository.save(topicoId);
        return new RespuestaTopicoDTO(topicoId);
    }
}