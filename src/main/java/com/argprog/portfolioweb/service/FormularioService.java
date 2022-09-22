
package com.argprog.portfolioweb.service;

import com.argprog.portfolioweb.model.FormularioContacto;
import com.argprog.portfolioweb.repository.FormularioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormularioService implements IFormularioService{

    @Autowired
    public FormularioRepository formRepo;
    
    @Override
    public List<FormularioContacto> verMensajes() {
        return formRepo.findAll();
    }

    @Override
    public void crearMensaje(FormularioContacto formCon) {
        formRepo.save(formCon);
    }

    @Override
    public void borrarMensaje(Long id) {
        formRepo.deleteById(id);
    }

    @Override
    public FormularioContacto buscarMensaje(Long id) {
        return formRepo.findById(id).orElse(null);
    }

    @Override
    public FormularioContacto editarMensaje(Long id) {
        FormularioContacto formCon = formRepo.findById(id).orElse(null);
        return formCon;
    }
    
}
