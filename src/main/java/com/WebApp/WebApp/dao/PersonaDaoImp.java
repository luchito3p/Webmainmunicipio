package com.WebApp.WebApp.dao;

import com.WebApp.WebApp.models.Personas;
import com.WebApp.WebApp.models.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
@Transactional
public class PersonaDaoImp {


    @PersistenceContext
    private EntityManager entityManager;

    public List<Personas> getLista() {
        String query = "FROM Personas";  // OJO!!! Acá va la CLASE del modelo, NO la tabla
        return entityManager.createQuery(query).getResultList();
    }

}
