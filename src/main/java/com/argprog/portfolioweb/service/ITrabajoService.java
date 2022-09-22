
package com.argprog.portfolioweb.service;

import com.argprog.portfolioweb.model.Trabajo;
import java.util.List;

public interface ITrabajoService {
    
    public List<Trabajo> verTrabajos();
    
    public void crearTrabajo (Trabajo trab);
    
    public void borrarTrabajo(Long id);
    
    public Trabajo buscarTrabajo (Long id);
    
    public Trabajo editarTrabajo (Long id);
}
