
package com.argprog.portfolioweb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    private int edad;
    private String email;
    private String direccion;
    private String sobremi;
    private String sub;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, int edad, String email, String direccion, String sobremi, String sub) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.email = email;
        this.direccion = direccion;
        this.sobremi = sobremi;
        this.sub = sub;
    }
    
    
}
