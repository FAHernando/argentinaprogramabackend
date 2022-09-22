
package com.argprog.portfolioweb.service;

import com.argprog.portfolioweb.model.Estudio;
import com.argprog.portfolioweb.repository.EstudioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudioService implements IEstudioService {

    @Autowired
    public EstudioRepository estudioRepo;
    
    @Override
    public List<Estudio> verEstudios() {
        return estudioRepo.findAll();
    }

    @Override
    public void crearEstudio(Estudio est) {
        estudioRepo.save(est);
    }

    @Override
    public void borrarEstudio(Long id) {
        estudioRepo.deleteById(id);
    }

    @Override
    public Estudio buscarEstudio(Long id) {
        return estudioRepo.findById(id).orElse(null);
    }

    /*@Override
    public Estudio editarEstudio(Long id) {
        Estudio est = estudioRepo.findById(id).orElse(null);
        return est;
    }*/
    @Override
    public Estudio editarEstudio(Long id) {
        Estudio est = estudioRepo.findById(id).orElse(null);
        estudioRepo.save(est);
        return est;
    }
    
}
