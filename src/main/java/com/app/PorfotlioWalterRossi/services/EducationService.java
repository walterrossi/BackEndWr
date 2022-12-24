package com.app.PorfotlioWalterRossi.services;

import com.app.PorfotlioWalterRossi.exception.UserNotFoundException;
import com.app.PorfotlioWalterRossi.repository.EducationRespository;
import com.app.PorfotlioWalterRossi.models.Education;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EducationService {

    private final EducationRespository educationRepository;

    public EducationService(EducationRespository educationRepository) {
        this.educationRepository = educationRepository;
    }


    public Education addEducation(Education education){
        return educationRepository.save(education);
    }
    public Education updateEducation(Education education){
        return educationRepository.save(education);
    }
    public List<Education> findAllEducation(){
        return educationRepository.findAll();
    }
    public void deleteEducation(Long id){
        educationRepository.deleteById(id);
    }
    
    public Education buscarEducacionPorId (Long id){
        return educationRepository.findById(id).orElseThrow(()->new UserNotFoundException("Usuario No Encontrado"));
    
}
}