
package com.app.PorfotlioWalterRossi.controller;



import com.app.PorfotlioWalterRossi.models.Acerca;
import com.app.PorfotlioWalterRossi.services.AcercaService;
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
 
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
//@CrossOrigin(origins = "https://portfoliowalterossi.herokuapp.com/", allowedHeaders = "*")
@RestController
@RequestMapping("/acerca")
public class AcercaController {
    @Autowired
    private final AcercaService acercaService;

    public AcercaController(AcercaService acercaService) {
        this.acercaService = acercaService;
    }

   
      
    
   
    @GetMapping ("/leer")
    public ResponseEntity<List<Acerca>> getAllAcerca(){
        List<Acerca> acerca=acercaService.findAllAcerca();
        return new ResponseEntity<>(acerca, HttpStatus.OK);
    }
 
//    @CrossOrigin(origins = "https://portfoliowalterossi.web.app", allowedHeaders = "*")
 //@CrossOrigin(origins = "https://portfoliowalterossi.herokuapp.com/", allowedHeaders = "*")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
    @PostMapping("/add")
    public ResponseEntity<Acerca> addAcerca(@RequestBody Acerca project){
        Acerca newAcercade=acercaService.addAcerca(project);
        return new ResponseEntity<>(newAcercade,HttpStatus.CREATED);
    }
    
  //  @CrossOrigin(origins = "https://portfoliowalterossi.web.app", allowedHeaders = "*")
    @CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
    //@CrossOrigin(origins = "https://portfoliowalterossi.herokuapp.com/", allowedHeaders = "*")
    @PutMapping ("/update")
    public ResponseEntity<Acerca> updateAcerca(@RequestBody Acerca  acerca){
        Acerca updateAcerca=acercaService.updateAcerca(acerca);
        return new ResponseEntity<>(updateAcerca,HttpStatus.OK);
    }
    
    
    //@CrossOrigin(origins = "https://portfoliowalterossi.web.app", allowedHeaders = "*")
    //@CrossOrigin(origins = "https://portfoliowalterossi.herokuapp.com/", allowedHeaders = "*")
    @CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteAcerca(@PathVariable("id") Long id){
        acercaService.deleteAcerca(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
  



}
