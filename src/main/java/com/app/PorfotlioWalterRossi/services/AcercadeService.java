package com.app.PorfotlioWalterRossi.services;

import com.app.PorfotlioWalterRossi.exception.UserNotFoundException;
import com.app.PorfotlioWalterRossi.repository.AcercadeRespository;
import com.app.PorfotlioWalterRossi.models.Acercade;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AcercadeService {

    private final AcercadeRespository acercadeRepository;

    public AcercadeService(AcercadeRespository acercadeRepository) {
        this.acercadeRepository = acercadeRepository;
    }


    public Acercade addAcercade(Acercade acercade){
        return acercadeRepository.save(acercade);
    }
    public Acercade updateAcercade(Acercade acercade){
        return acercadeRepository.save(acercade);
    }
    public List<Acercade> findAllAcercade(){//findAllAcercade
        return acercadeRepository.findAll();
    }
    public void deleteAcercade(Long id){
        acercadeRepository.deleteById(id);
    }
    
    
    public Acercade findAcercadeById(Long id){
        return acercadeRepository.findById(id).orElseThrow(()-> new UserNotFoundException("Usuario no Encontrado"));
    }
 

     
}
  
 
     
