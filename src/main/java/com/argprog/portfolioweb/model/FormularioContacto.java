
package com.argprog.portfolioweb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class FormularioContacto {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String email;
    private int telefono;
    private String mensaje;

    public FormularioContacto() {
    }

    public FormularioContacto(Long id, String nombre, String email, int telefono, String mensaje) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.mensaje = mensaje;
    }
    
    
    
}
