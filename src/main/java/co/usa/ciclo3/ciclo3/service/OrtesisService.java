package co.usa.ciclo3.ciclo3.service;


import co.usa.ciclo3.ciclo3.model.Ortesis;
import co.usa.ciclo3.ciclo3.repository.OrtesisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrtesisService {

    @Autowired
    private OrtesisRepository ortesisRepository;

    public List<Ortesis> getAll(){
        return ortesisRepository.getAll();
    }

    public Optional<Ortesis> getOrtesis(int id){
        return ortesisRepository.getOrtesis(id);
    }

    public Ortesis save(Ortesis p){
        if(p.getId()==null){
            return ortesisRepository.save(p);
        }else{
            Optional<Ortesis> paux=ortesisRepository.getOrtesis(p.getId());
            if (paux.isEmpty()){
                return ortesisRepository.save(p);
            }else{
                return p;
            }
        }
    }
}
