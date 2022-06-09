package com.backEndPaker.backEndPaker.Controller;

import com.backEndPaker.backEndPaker.Interface.IPersonaService;
import com.backEndPaker.backEndPaker.Model.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class controller {
    
    
    @Autowired IPersonaService ipersonaservice;
    
    @GetMapping("/personas/traer")
    public List<Persona> getPersona(){
        return ipersonaservice.getPersona();
    }
    
    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody Persona persona){
        ipersonaservice.savePersona(persona);
        return "Persona creada correctamente";
    }
    
    @DeleteMapping("/personas/eliminar/{id}")
    public String deletePersona(@PathVariable Long id){
        ipersonaservice.deletePersona(id);
        return "Persona eliminada correctamente";
    }
    
    @PutMapping("/personas/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
                               @RequestParam("usuario") String nuevoUsuario,
                               @RequestParam("password") String nuevoPassword/*,
                               @RequestParam("ocupacion") String nuevaOcupacion,
                               @RequestParam("acerca_de") String nuevoAcercaDe,
                               @RequestParam("fecha_nac") String nuevaFechaNac,
                               @RequestParam ("nacionalidad") String nuevaNacionalidad,
                               @RequestParam ("mail") String nuevoMail,
                               @RequestParam ("sobre_mi") String nuevoSobreMi,
                               @RequestParam ("url_img_background") String nuevaUrlImgBackground,
                               @RequestParam ("url_img_perfil") String nuevaUrlImgPerfil*/){
        
        Persona persona = ipersonaservice.findPersona(id);
        
        persona.setUsuario (nuevoUsuario);
        persona.setPassword (nuevoPassword);
        /*persona.setOcupacion (nuevaOcupacion);
        persona.setAcercaDe (nuevoAcercaDe);
        persona.setFechaNac (nuevaFechaNac);
        persona.setNacionalidad (nuevaNacionalidad);
        persona.setMail (nuevoMail);
        persona.setSobreMi (nuevoSobreMi);
        persona.setUrlImgBackground (nuevaUrlImgBackground);
        persona.setUrlImgPerfil (nuevaUrlImgPerfil);
        */
        
        ipersonaservice.savePersona(persona);
        return persona;
    }
    
    @GetMapping("personas/traer/perfil")
    public Persona findPersona(){
        return ipersonaservice.findPersona((long)1);
    }
    
}
