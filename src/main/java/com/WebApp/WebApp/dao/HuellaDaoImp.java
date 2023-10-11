package com.WebApp.WebApp.dao;

import com.WebApp.WebApp.models.Huella;
import com.WebApp.WebApp.models.Salida;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class HuellaDaoImp {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Huella> getLista() {
        String query = "FROM Huella";  // OJO!!! Acá va la CLASE del modelo, NO la tabla
        return entityManager.createQuery(query).getResultList();
    }

    public void eliminar(int id) {
        Huella huellas = entityManager.find(Huella.class, id);
        entityManager.remove(huellas);
    }


}
