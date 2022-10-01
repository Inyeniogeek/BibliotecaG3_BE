package co.usa.ciclo3.ciclo3.repository;

import co.usa.ciclo3.ciclo3.model.Ortesis;
import co.usa.ciclo3.ciclo3.repository.crud.OrtesisCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class OrtesisRepository {

    @Autowired
    private OrtesisCrudRepository ortesisCrudRepository;

    public List<Ortesis> getAll(){
        return (List<Ortesis>) ortesisCrudRepository.findAll();
    }

    public Optional<Ortesis> getOrtesis(int id){
        return ortesisCrudRepository.findById(id);
    }
    
    public Ortesis save(Ortesis p){
        return ortesisCrudRepository.save(p);
    }

}
