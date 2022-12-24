package com.app.PorfotlioWalterRossi.services;

import com.app.PorfotlioWalterRossi.exception.UserNotFoundException;
import com.app.PorfotlioWalterRossi.repository.ProyectoRespository;
import com.app.PorfotlioWalterRossi.models.Proyecto;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProyectoService {

    private final ProyectoRespository proyectoRepository;

    public ProyectoService(ProyectoRespository proyectoRepository) {
        this.proyectoRepository = proyectoRepository;
    }


    public Proyecto addProyecto(Proyecto proyecto){
        return proyectoRepository.save(proyecto);
    }
    public Proyecto updateProyecto(Proyecto proyecto){
        return proyectoRepository.save(proyecto);
    }
    public List<Proyecto> findAllProyecto(){//findAllProyecto
        return proyectoRepository.findAll();
    }
    public void deleteProyecto(Long id){
        proyectoRepository.deleteById(id);
    }
    
    
    public Proyecto findProyectoById(Long id){
        return proyectoRepository.findById(id).orElseThrow(()-> new UserNotFoundException("Usuario no Encontrado"));
    }
 

     
}
  
 
     
