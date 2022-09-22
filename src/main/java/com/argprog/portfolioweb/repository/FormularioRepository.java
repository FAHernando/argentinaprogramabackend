
package com.argprog.portfolioweb.repository;

import com.argprog.portfolioweb.model.FormularioContacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormularioRepository extends JpaRepository <FormularioContacto, Long> {
    
}
