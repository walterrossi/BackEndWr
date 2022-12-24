package com.app.PorfotlioWalterRossi.controller;

import com.app.PorfotlioWalterRossi.models.Experiencia;
import com.app.PorfotlioWalterRossi.services.ExperienciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin(origins = "https://portfoliowalterossi.web.app", allowedHeaders = "*")
//@CrossOrigin(origins = "https://portfoliowalterossi.herokuapp.com/", allowedHeaders = "*")
 @CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")

@RestController
@RequestMapping("/experiencia")
public class ExperienciaController {
    @Autowired
    private final ExperienciaService experienciaService;

     public ExperienciaController(ExperienciaService experienciaService) {
        this.experienciaService = experienciaService;
    }
    
 // @CrossOrigin(origins = "https://portfoliowalterossi.web.app", allowedHeaders = "*")
   //  @CrossOrigin(origins = "https://portfoliowalterossi.herokuapp.com/", allowedHeaders = "*")
   @CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
   
    @GetMapping ("/leer")
    public ResponseEntity<List<Experiencia>> getAllExperiencia(){
        List<Experiencia> experiencias=experienciaService.findAllExperiencia();
        return new ResponseEntity<>(experiencias, HttpStatus.OK);
    }
                
                
  // @CrossOrigin(origins = "https://portfoliowalterossi.web.app", allowedHeaders = "*")             
   //@CrossOrigin(origins = "https://portfoliowalterossi.herokuapp.com/", allowedHeaders = "*")
     @CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
    @PostMapping("/add")
    public ResponseEntity<Experiencia> addExperiencia(@RequestBody Experiencia project){
        Experiencia newExperiencia=experienciaService.addExperiencia(project);
        return new ResponseEntity<>(newExperiencia,HttpStatus.CREATED);
    }
    
    //@CrossOrigin(origins = "https://portfoliowalterossi.web.app", allowedHeaders = "*")
   // @CrossOrigin(origins = "https://portfoliowalterossi.herokuapp.com/", allowedHeaders = "*")
    @CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
    @PutMapping ("/update")
    public ResponseEntity<Experiencia> updateExperiencia(@RequestBody Experiencia experiencia){
        Experiencia updateExperiencia=experienciaService.updateExperiencia(experiencia);
        return new ResponseEntity<>(updateExperiencia,HttpStatus.OK);
    }
    
    
    //@CrossOrigin(origins = "https://portfoliowalterossi.web.app", allowedHeaders = "*")
    //@CrossOrigin(origins = "https://portfoliowalterossi.herokuapp.com/", allowedHeaders = "*")
     @CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteExperiencia(@PathVariable("id") Long id){
        experienciaService.deleteExperiencia(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    //@CrossOrigin(origins = "https://portfoliowalterossi.web.app", allowedHeaders = "*")
   // @CrossOrigin(origins = "https://portfoliowalterossi.herokuapp.com/", allowedHeaders = "*")
 @CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
    @GetMapping ("/buscar/{id}")
    public ResponseEntity<Experiencia> buscarExperienciaPorId(@PathVariable("id")Long id){
        Experiencia experiencia=experienciaService.buscarExperienciaPorId(id);
                return new ResponseEntity<>(experiencia, HttpStatus.OK);
}
}