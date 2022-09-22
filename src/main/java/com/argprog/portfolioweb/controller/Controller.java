
package com.argprog.portfolioweb.controller;

import com.argprog.portfolioweb.model.Persona;
import com.argprog.portfolioweb.service.IPersonaService;
import java.util.List;
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
public class Controller {
    
    @Autowired
    private IPersonaService personaServ;
    
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping ("/new/persona")
    public void agregarPersona (@RequestBody Persona pers){//cuerpo de la solicitud
        personaServ.crearPersona(pers);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping ("/ver/persona/{id}")
    @ResponseBody
    public Persona buscarPersona(@PathVariable Long id){
        return personaServ.buscarPersona(id);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping ("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas(){
        return personaServ.verPersonas();
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/delete/persona/{id}")
    public void borrarPersona(@PathVariable Long id){
       personaServ.borrarPersona(id);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/modificar/persona/{id}")
    public Persona editarPersona (@PathVariable Long id,
                                  @RequestParam ("nombre") String nuevoNombre,
                                  @RequestParam ("apellido") String nuevoApellido,
                                  @RequestParam ("edad") int nuevoEdad,
                                  @RequestParam ("email") String nuevoEmail,
                                  @RequestParam ("direccion") String nuevoDireccion,
                                  @RequestParam ("sobremi") String nuevoSobremi,
                                  @RequestParam ("sub") String nuevoSub){
      Persona pers = personaServ.editarPersona(id);
      
      pers.setNombre(nuevoNombre);
      pers.setApellido(nuevoApellido);
      pers.setEdad(nuevoEdad);
      pers.setEmail(nuevoEmail);
      pers.setDireccion(nuevoDireccion);
      pers.setSobremi(nuevoSobremi);
      pers.setSub (nuevoSub);
      
      personaServ.crearPersona(pers);
      
      return pers;
    }
}
