package com.app.PorfotlioWalterRossi.services;

import com.app.PorfotlioWalterRossi.exception.UserNotFoundException;
import com.app.PorfotlioWalterRossi.repository.AcercaRespository;
import com.app.PorfotlioWalterRossi.models.Acerca;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AcercaService {

    private final AcercaRespository acercaRepository;

    public AcercaService(AcercaRespository acercaRepository) {
        this.acercaRepository = acercaRepository;
    }


    public Acerca addAcerca(Acerca acerca){
        return acercaRepository.save(acerca);
    }
    public Acerca updateAcerca(Acerca acerca){
        return acercaRepository.save(acerca);
    }
    public List<Acerca> findAllAcerca(){//findAllAcerca
        return acercaRepository.findAll();
    }
    public void deleteAcerca(Long id){
        acercaRepository.deleteById(id);
    }
    
    
    public Acerca findAcercaById(Long id){
        return acercaRepository.findById(id).orElseThrow(()-> new UserNotFoundException("Usuario no Encontrado"));
    }
 

     
}
  
 
     
