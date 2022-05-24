package com.backEndPaker.backEndPaker.Repository;

import org.springframework.stereotype.Repository;
import com.backEndPaker.backEndPaker.Model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
 
@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {
    
}
