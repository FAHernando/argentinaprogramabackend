
package com.argprog.portfolioweb.model;

import java.util.Optional;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Estudio {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String instituto;
    private String carrera;
    private String grado;
    private int comienzo;
    private int fin;
    private String web;
    private String imagen;

    public Estudio() {
    }

    public Estudio(Long id, String instituto, String carrera, String grado, int comienzo, int fin, String web, String imagen) {
        this.id = id;
        this.instituto = instituto;
        this.carrera = carrera;
        this.grado = grado;
        this.comienzo = comienzo;
        this.fin = fin;
        this.web = web;
        this.imagen = imagen;
    }    
}
