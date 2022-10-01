package co.usa.ciclo3.ciclo3.web;


import co.usa.ciclo3.ciclo3.model.Ortesis;
import co.usa.ciclo3.ciclo3.service.OrtesisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Ortesis")
@CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class OrtesisController {

    @Autowired
    private OrtesisService ortesisService;

    @GetMapping("/all")
    public List<Ortesis> getOrtesis(){
        return ortesisService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Ortesis> getOrtesis(@PathVariable("id")int id){
        return ortesisService.getOrtesis(id);
    }



    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Ortesis save(@RequestBody Ortesis p){
        return ortesisService.save(p);
    }


}
