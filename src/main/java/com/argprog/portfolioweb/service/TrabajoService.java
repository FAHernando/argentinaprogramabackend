
package com.argprog.portfolioweb.service;


import com.argprog.portfolioweb.model.Trabajo;
import com.argprog.portfolioweb.repository.TrabajoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TrabajoService implements ITrabajoService {

    @Autowired
    public TrabajoRepository trabajoRepo;
    
    @Override
    public List<Trabajo> verTrabajos() {
        return trabajoRepo.findAll();
    }

    @Override
    public void crearTrabajo(Trabajo trab) {
        trabajoRepo.save(trab);
    }

    @Override
    public void borrarTrabajo(Long id) {
        trabajoRepo.deleteById(id);
    }

    @Override
    public Trabajo buscarTrabajo(Long id) {
       return trabajoRepo.findById(id).orElse(null);
    }

    @Override
    public Trabajo editarTrabajo(Long id) {
         Trabajo trab = trabajoRepo.findById(id).orElse(null);
        trabajoRepo.save(trab);
        return trab;
    }
    
    
}
