
package com.app.PorfotlioWalterRossi.controller;



import com.app.PorfotlioWalterRossi.models.Hard;
import com.app.PorfotlioWalterRossi.services.HardService;
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
@RequestMapping("/HardSoft")
public class HardController {
    @Autowired
    private final HardService hardService;

    public HardController(HardService hardService) {
        this.hardService = hardService;
    }

   //@CrossOrigin(origins = "https://portfoliowalterossi.web.app", allowedHeaders = "*")
    //@CrossOrigin(origins = "https://portfoliowalterossi.herokuapp.com/", allowedHeaders = "*")
   
   @CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
    @GetMapping ("/leer")
    public ResponseEntity<List<Hard>> getAllHard(){
        List<Hard> hard=hardService.findAllHard();
        return new ResponseEntity<>(hard, HttpStatus.OK);
    }
    
    
   // @CrossOrigin(origins = "https://portfoliowalterossi.web.app", allowedHeaders = "*")
 //@CrossOrigin(origins = "https://portfoliowalterossi.herokuapp.com/", allowedHeaders = "*")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
    @PostMapping("/add")
    public ResponseEntity<Hard> addHard(@RequestBody Hard project){
        Hard newHard=hardService.addHard(project);
        return new ResponseEntity<>(newHard,HttpStatus.CREATED);
    }
    
//   @CrossOrigin(origins = "https://portfoliowalterossi.web.app", allowedHeaders = "*") 
   // @CrossOrigin(origins = "https://portfoliowalterossi.herokuapp.com/", allowedHeaders = "*")
  @CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
    @PutMapping ("/update")
    public ResponseEntity<Hard> updateHard(@RequestBody Hard hard){
        Hard updateHard=hardService.updateHard(hard);
        return new ResponseEntity<>(updateHard,HttpStatus.OK);
    }
  
    
  //  @CrossOrigin(origins = "https://portfoliowalterossi.web.app", allowedHeaders = "*")
    //@CrossOrigin(origins = "https://portfoliowalterossi.herokuapp.com/", allowedHeaders = "*")
    @CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteHard(@PathVariable("id") Long id){
        hardService.deleteHard(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
  



}
