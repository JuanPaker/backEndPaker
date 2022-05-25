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
@CrossOrigin(origins = "http://localhost:4200/inicio-sesion")

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
                               @RequestParam("nombre") String nuevoNombre,
                               @RequestParam("apellido") String nuevoApellido,
                               @RequestParam ("img") String nuevaImg,
                               @RequestParam ("email") String nuevoEmail,
                               @RequestParam ("contraseña") String nuevaContraseña){
        
        Persona persona = ipersonaservice.findPersona(id);
        
        persona.setNombre (nuevoNombre);
        persona.setApellido (nuevoApellido);
        persona.setImg (nuevaImg);
        persona.setEmail (nuevoEmail);
        persona.setContraseña (nuevaContraseña);
        
        ipersonaservice.savePersona(persona);
        return persona;
    }
    
    @GetMapping("Personas/traer/perfil")
    public Persona findPersona(){
        return ipersonaservice.findPersona((long)1);
    }
    
}
