package com.app.PorfotlioWalterRossi.controller;



import com.app.PorfotlioWalterRossi.models.Educacion;
import com.app.PorfotlioWalterRossi.services.EducacionService;
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


//@CrossOrigin(origins = "https://portfoliowalterossi.web.app", allowedHeaders = "*")

//@CrossOrigin(origins = "https://portfoliowalterossi.herokuapp.com/", allowedHeaders = "*")
  @CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@RestController
@RequestMapping("/educacion")
public class EducacionController {
    @Autowired
    private final EducacionService educacionService;

    public EducacionController(EducacionService educacionService) {
        this.educacionService = educacionService;
    }

  // @CrossOrigin(origins = "https://portfoliowalterossi.web.app", allowedHeaders = "*")
  // @CrossOrigin(origins = "https://portfoliowalterossi.herokuapp.com/", allowedHeaders = "*")
   @CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
    @GetMapping ("/leer")
    public ResponseEntity<List<Educacion>> getAllEducacion(){
        List<Educacion> educacion=educacionService.findAllEducacion();
        return new ResponseEntity<>(educacion, HttpStatus.OK);
    }
    
// @CrossOrigin(origins = "https://portfoliowalterossi.web.app", allowedHeaders = "*")
  //  @CrossOrigin(origins = "https://portfoliowalterossi.herokuapp.com/", allowedHeaders = "*")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
    @PostMapping("/add")
    public ResponseEntity<Educacion> addHard(@RequestBody Educacion project){
        Educacion newEducacion=educacionService.addEducacion(project);
        return new ResponseEntity<>(newEducacion,HttpStatus.CREATED);
    }
    
  //  @CrossOrigin(origins = "https://portfoliowalterossi.web.app", allowedHeaders = "*")
   // @CrossOrigin(origins = "https://portfoliowalterossi.herokuapp.com/", allowedHeaders = "*")
    @CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
    @PutMapping ("/update")
    public ResponseEntity<Educacion> updateEducacion(@RequestBody Educacion educacion){
        Educacion updateEducacion=educacionService.updateEducacion(educacion);
        return new ResponseEntity<>(updateEducacion,HttpStatus.OK);
    }
  
    
    //@CrossOrigin(origins = "https://portfoliowalterossi.web.app", allowedHeaders = "*")
    //@CrossOrigin(origins = "https://portfoliowalterossi.herokuapp.com/", allowedHeaders = "*")
    @CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEducacion(@PathVariable("id") Long id){
        educacionService.deleteEducacion(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
  
//@CrossOrigin(origins = "https://portfoliowalterossi.web.app", allowedHeaders = "*")
 //   @CrossOrigin(origins = "https://portfoliowalterossi.herokuapp.com/", allowedHeaders = "*")
 @CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
    @GetMapping ("/buscar/{id}")
    public ResponseEntity<Educacion> buscarEducacionPorId(@PathVariable("id")Long id){
        Educacion educacion=educacionService.buscarEducacionPorId(id);
                return new ResponseEntity<>(educacion, HttpStatus.OK);
}

}
