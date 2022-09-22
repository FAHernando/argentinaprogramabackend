
package com.argprog.portfolioweb.service;

import com.argprog.portfolioweb.model.FormularioContacto;
import java.util.List;

public interface IFormularioService {
    
    public List<FormularioContacto> verMensajes();
    
    public void crearMensaje (FormularioContacto formCon);
    
    public void borrarMensaje (Long id);
    
    public FormularioContacto buscarMensaje (Long id);
    
    public FormularioContacto editarMensaje (Long id);
    
}
