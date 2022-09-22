
package com.argprog.portfolioweb.controller;

import com.argprog.portfolioweb.model.Trabajo;
import com.argprog.portfolioweb.service.ITrabajoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TrabajoController {
    
    @Autowired
    private ITrabajoService trabajoRepo;
    @CrossOrigin(origins = "https://portfolioweb-frontend.web.app")
    @PostMapping ("/crear/trabajo")
    public void agregarTrabajo (@RequestBody Trabajo trab){//cuerpo de la solicitud
        trabajoRepo.crearTrabajo(trab);
    }
    @CrossOrigin(origins = "https://portfolioweb-frontend.web.app")
    @GetMapping ("/ver/trabajo/{id}")
    @ResponseBody
    public Trabajo buscarTrabajo(@PathVariable Long id){
        return trabajoRepo.buscarTrabajo(id);
    }
    @CrossOrigin(origins = "https://portfolioweb-frontend.web.app")
    @GetMapping ("/ver/trabajos")
    @ResponseBody
    public List<Trabajo> verTrabajos(){
        return trabajoRepo.verTrabajos();
    }
    @CrossOrigin(origins = "https://portfolioweb-frontend.web.app")
    @DeleteMapping("/delete/trabajo/{id}")
    public void borrarTrabajo(@PathVariable Long id){
       trabajoRepo.borrarTrabajo(id);
    }
   
    @CrossOrigin(origins = "https://portfolioweb-frontend.web.app")
    @PutMapping("/modificar/trabajo/{id}")
    public Trabajo editarTrabajo (@PathVariable Long id,
                                  @RequestBody Trabajo trab){
      trabajoRepo.editarTrabajo(id);
      trabajoRepo.crearTrabajo(trab);
      return trab;
    }
}
