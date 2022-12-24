package com.app.PorfotlioWalterRossi.services;

import com.app.PorfotlioWalterRossi.exception.UserNotFoundException;
import com.app.PorfotlioWalterRossi.repository.EducacionRespository;
import com.app.PorfotlioWalterRossi.models.Educacion;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EducacionService {

    private final EducacionRespository educacionRepository;

    public EducacionService(EducacionRespository educacionRepository) {
        this.educacionRepository = educacionRepository;
    }


    public Educacion addEducacion(Educacion educacion){
        return educacionRepository.save(educacion);
    }
    public Educacion updateEducacion(Educacion educacion){
        return educacionRepository.save(educacion);
    }
    public List<Educacion> findAllEducacion(){
        return educacionRepository.findAll();
    }
    public void deleteEducacion(Long id){
        educacionRepository.deleteById(id);
    }
    
    public Educacion buscarEducacionPorId (Long id){
        return educacionRepository.findById(id).orElseThrow(()->new UserNotFoundException("Usuario No Encontrado"));
    
}
}