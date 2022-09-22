
package com.argprog.portfolioweb.controller;

import com.argprog.portfolioweb.model.Estudio;
import com.argprog.portfolioweb.service.IEstudioService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EstudioController {
    
    @Autowired
    private IEstudioService estudioServ;
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping ("/new/estudio")
    public void agregarEstudio (@RequestBody Estudio est){//cuerpo de la solicitud
        estudioServ.crearEstudio(est);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping ("/ver/estudio/{id}")
    @ResponseBody
    public Estudio buscarEstudio(@PathVariable Long id){
        return estudioServ.buscarEstudio(id);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping ("/ver/estudios")
    @ResponseBody
    public List<Estudio> verEstudios(){
        return estudioServ.verEstudios();
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/delete/estudio/{id}")
    public void borrarEstudio(@PathVariable Long id){
       estudioServ.borrarEstudio(id);
    }
   
    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/modificar/estudio/{id}")
    public Estudio editarEstudio (@PathVariable Long id,
                                  @RequestBody Estudio est){
      estudioServ.editarEstudio(id);
      estudioServ.crearEstudio(est);
      return est;
    }
    /*@PutMapping("/modificar/estudio/{id}")
    
    public Estudio editarEstudio (@PathVariable Long id,
                                  @RequestParam ("instituto") String nuevoInstituto,
                                  @RequestParam ("carrera") String nuevoCarrera,
                                  @RequestParam ("grado") String nuevoGrado,
                                  @RequestParam ("comienzo") int nuevoComienzo,
                                  @RequestParam ("fin") int nuevoFin,
                                  @RequestParam ("web") String nuevoWeb,
                                  @RequestParam ("imagen") String nuevoImagen){
      Estudio est = estudioServ.editarEstudio(id);
      
      est.setInstituto(nuevoInstituto);
      est.setCarrera(nuevoCarrera);
      est.setGrado(nuevoGrado);
      est.setComienzo(nuevoComienzo);
      est.setFin(nuevoFin);
      est.setWeb(nuevoWeb);
      est.setImagen(nuevoImagen);
      
      estudioServ.crearEstudio(est);
      
      return est;
    }*/
    
}
