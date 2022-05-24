package com.backEndPaker.backEndPaker.Interface;

import java.util.List;
import com.backEndPaker.backEndPaker.Model.Persona;

public interface IPersonaService {

    public List<Persona> getPersona();

    public void savePersona(Persona persona);

    public void deletePersona(Long id);

    public Persona findPersona(Long id);

}
