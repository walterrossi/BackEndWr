
package com.app.PorfotlioWalterRossi.controller;



import com.app.PorfotlioWalterRossi.models.Proyecto;
import com.app.PorfotlioWalterRossi.services.ProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import static org.hibernate.criterion.Projections.id;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/Proyecto")
public class ProyectoController {
    @Autowired
    private final ProyectoService proyectoService;

    public ProyectoController(ProyectoService proyectoService) {
        this.proyectoService = proyectoService;
    }

//   @CrossOrigin(origins = "https://portfoliowalterossi.web.app", allowedHeaders = "*")
  // @CrossOrigin(origins = "https://portfoliowalterossi.herokuapp.com/", allowedHeaders = "*")
   @CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
    @GetMapping ("/leer")
    public ResponseEntity<List<Proyecto>> getAllProyecto(){
        List<Proyecto> proyecto=proyectoService.findAllProyecto();
        return new ResponseEntity<>(proyecto, HttpStatus.OK);
    }

    
//    @CrossOrigin(origins = "https://portfoliowalterossi.web.app", allowedHeaders = "*")
 //@CrossOrigin(origins = "https://portfoliowalterossi.herokuapp.com/", allowedHeaders = "*")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
    @PostMapping("/add")
    public ResponseEntity<Proyecto> addProyecto(@RequestBody Proyecto project){
        Proyecto newProyecto=proyectoService.addProyecto(project);
        return new ResponseEntity<>(newProyecto,HttpStatus.CREATED);
    }
    
  // @CrossOrigin(origins = "https://portfoliowalterossi.web.app", allowedHeaders = "*") 
   // @CrossOrigin(origins = "https://portfoliowalterossi.herokuapp.com/", allowedHeaders = "*")
    @CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
    @PutMapping ("/update")
    public ResponseEntity<Proyecto> updateProyecto(@RequestBody Proyecto proyecto){
        Proyecto updateProyecto=proyectoService.updateProyecto(proyecto);
        return new ResponseEntity<>(updateProyecto,HttpStatus.OK);
    }
  
    
  //  @CrossOrigin(origins = "https://portfoliowalterossi.web.app", allowedHeaders = "*")
    //@CrossOrigin(origins = "https://portfoliowalterossi.herokuapp.com/", allowedHeaders = "*")
    @CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteProyecto(@PathVariable("id") Long id){
        proyectoService.deleteProyecto(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
  



}
