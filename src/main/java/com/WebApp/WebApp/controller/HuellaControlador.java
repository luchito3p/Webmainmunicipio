package com.WebApp.WebApp.controller;

import com.WebApp.WebApp.dao.HuellaDaoImp;
import com.WebApp.WebApp.dao.PersonaDaoImp;
import com.WebApp.WebApp.dao.UsuarioDaoImp;
import com.WebApp.WebApp.models.Huella;
import com.WebApp.WebApp.models.Personas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class HuellaControlador {

    @Autowired  //Inyección de dependencias
    private HuellaDaoImp huella;


    // Para obtener lista total de usuarios
    @RequestMapping(value = "api/Huella", method = RequestMethod.GET)
    public List<Huella> listaHUellas() {
        return huella.getLista();
    }

    @RequestMapping(value = "api/Huella/eliminar/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable int id) {
        huella.eliminar(id);
    }


}


