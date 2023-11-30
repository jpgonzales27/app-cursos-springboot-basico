package com.juanpi.gestioncursos.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="cursos")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /*
    *   @Column nos permite agregar algunas restricciones a esa columna
    *   en especifico
     */
    @Column(length = 128,nullable = false) //permitira 128 caracteres y no permitira nulos
    private String titulo;

    @Column(length = 256)
    private String description;

    @Column(nullable = false)
    private int nivel;

    @Column(name = "estado_publicacion") //cambiara el nombre de esa columna en la BD por lo que agregamos en name
    private boolean isPublicado;
}
