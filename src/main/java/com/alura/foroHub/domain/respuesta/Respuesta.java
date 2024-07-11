package com.alura.foroHub.domain.respuesta;

import com.alura.foroHub.domain.topico.Topico;
import com.alura.foroHub.domain.usuario.Usuario;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@Entity(name="Respuesta")
@Table(name = "respuestas")
@Getter
@Setter
@NoArgsConstructor
public class Respuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime fechaCreacion;
    private String solucion;
    private String mensaje;
    @OneToOne
    @JoinColumn(name="autor", referencedColumnName="id")
    private Usuario autor;
    @OneToOne
    @JoinColumn(name="topico", referencedColumnName="id")
    private Topico topico;
    private boolean active;

    public Respuesta(Long id, String solution, String mensaje, Usuario usuario, Topico topico, LocalDateTime creationDate) {
        this.id=id;
        this.solucion=solution;
        this.mensaje=mensaje;
        this.autor=usuario;
        this.topico=topico;
        this.fechaCreacion=LocalDateTime.now();
    }

    public void respuestaActualizada(RespuestaActualizadaDTO respuestaActualizadaDTO) {
        if (respuestaActualizadaDTO.solucion() != null){
            this.solucion=respuestaActualizadaDTO.solucion();
        }
    }
    public void diactivateResponse(){

        this.active=false;
    }
}