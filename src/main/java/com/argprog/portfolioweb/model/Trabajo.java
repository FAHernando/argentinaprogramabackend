
package com.argprog.portfolioweb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Trabajo {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String empresa;
    private String puesto;
    private String descripcion;
    private String comienzo;
    private String fin;
    private String web;
    private String imagen;

    public Trabajo() {
    }

    public Trabajo(Long id, String empresa, String puesto, String descripcion, String comienzo, String fin, String web, String imagen) {
        this.id = id;
        this.empresa = empresa;
        this.puesto = puesto;
        this.descripcion = descripcion;
        this.comienzo = comienzo;
        this.fin = fin;
        this.web = web;
        this.imagen = imagen;
    }
    
    
    
}
