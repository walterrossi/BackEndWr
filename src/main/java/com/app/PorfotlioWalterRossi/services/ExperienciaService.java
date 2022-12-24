package com.app.PorfotlioWalterRossi.services;

import com.app.PorfotlioWalterRossi.exception.UserNotFoundException;
import com.app.PorfotlioWalterRossi.repository.ExperienciaRespository;
import com.app.PorfotlioWalterRossi.models.Experiencia;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ExperienciaService {

    private final ExperienciaRespository experienciaRepository;

    public ExperienciaService(ExperienciaRespository experienciaRepository) {
        this.experienciaRepository = experienciaRepository;
    }


    public Experiencia addExperiencia(Experiencia experiencia){
        return experienciaRepository.save(experiencia);
    }
    public Experiencia updateExperiencia(Experiencia experiencia){
        return experienciaRepository.save(experiencia);
    }
    public List<Experiencia> findAllExperiencia(){
        return experienciaRepository.findAll();
    }
    public void deleteExperiencia(Long id){
        experienciaRepository.deleteById(id);
    }
    
    public Experiencia buscarExperienciaPorId (Long id){
        return experienciaRepository.findById(id).orElseThrow(()->new UserNotFoundException("Usuario No Encontrado"));
    
}}