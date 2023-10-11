package com.WebApp.WebApp.dao;

import com.WebApp.WebApp.models.Huella;
import com.WebApp.WebApp.models.Salida;

import java.util.List;

public interface HuellaDao {

    List<Huella> getLista();

    void eliminar(int id);



}
