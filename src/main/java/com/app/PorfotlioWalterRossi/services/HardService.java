package com.app.PorfotlioWalterRossi.services;

import com.app.PorfotlioWalterRossi.exception.UserNotFoundException;
import com.app.PorfotlioWalterRossi.repository.HardRespository;
import com.app.PorfotlioWalterRossi.models.Hard;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class HardService {

    private final HardRespository hardRepository;

    public HardService(HardRespository hardRepository) {
        this.hardRepository = hardRepository;
    }


    public Hard addHard(Hard hard){
        return hardRepository.save(hard);
    }
    public Hard updateHard(Hard hard){
        return hardRepository.save(hard);
    }
    public List<Hard> findAllHard(){//findAllHard
        return hardRepository.findAll();
    }
    public void deleteHard(Long id){
        hardRepository.deleteById(id);
    }
    
    
    public Hard findAcercadeById(Long id){
        return hardRepository.findById(id).orElseThrow(()-> new UserNotFoundException("Usuario no Encontrado"));
    }
 

     
}
  
 
     
