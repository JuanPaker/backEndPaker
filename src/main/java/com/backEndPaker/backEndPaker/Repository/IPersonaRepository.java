package com.backEndPaker.backEndPaker.Repository;

import com.backEndPaker.backEndPaker.Model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {
    
}
