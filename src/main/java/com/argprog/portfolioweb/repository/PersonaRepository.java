
package com.argprog.portfolioweb.repository;

import com.argprog.portfolioweb.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository <Persona, Long> {
    
}
