
package com.argprog.portfolioweb.service;

import com.argprog.portfolioweb.model.Estudio;
import java.util.List;

public interface IEstudioService {
    
    public List<Estudio> verEstudios();
    
    public void crearEstudio (Estudio est);
    
    public void borrarEstudio (Long id);
    
    public Estudio buscarEstudio (Long id);
    
    public Estudio editarEstudio (Long id);
    
}
