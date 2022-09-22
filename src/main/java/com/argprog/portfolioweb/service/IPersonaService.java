
package com.argprog.portfolioweb.service;

import com.argprog.portfolioweb.model.Persona;
import java.util.List;

public interface IPersonaService {
    
    public List<Persona> verPersonas ();
    
    public void crearPersona (Persona pers);
    
    public void borrarPersona (Long id);
    
    public Persona buscarPersona (Long id);
    
    public Persona editarPersona (Long id);
    
}
