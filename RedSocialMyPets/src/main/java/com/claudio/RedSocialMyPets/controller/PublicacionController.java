package com.claudio.RedSocialMyPets.controller;


import com.claudio.RedSocialMyPets.models.Publicacion;
import com.claudio.RedSocialMyPets.servicios.PublicacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/publicacion")

public class PublicacionController {

    @Autowired
    private PublicacionService publicacionService;

    @GetMapping
    public List<Publicacion> obtenerTodosLosPosts(){

        return PublicacionService.obtenerTodosLosPosts();


    }
    @PostMapping("/{id}")
    public  Publicacion guardarPost(@RequestBody Publicacion publicacion, @RequestParam long usuario_id, @RequestParam long mascota_id ){

         return  publicacionService.guardarPost(publicacion, usuario_id, mascota_id);


    }

    @GetMapping("/{id}")
    public Publicacion obtenerPUblicacionPorId(@PathVariable long id){

        return PublicacionService.obtenerPUblicacionPorId(id);

    }

    @DeleteMapping("/{id}/delete")
    public void eliminarPUblicacionPorId(@PathVariable long id){
        PublicacionService.eliminarPUblicacionPorId(id);
    }



}



