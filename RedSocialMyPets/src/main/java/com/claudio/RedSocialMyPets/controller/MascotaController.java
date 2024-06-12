package com.claudio.RedSocialMyPets.controller;

import com.claudio.RedSocialMyPets.models.Mascota;
import com.claudio.RedSocialMyPets.servicios.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/Mascotas")


public class MascotaController {


    @Autowired
    private MascotaService mascotaService;

    @GetMapping("/{id}")
    public List<Mascota> obtenerTodasLasMascotas(){
      return mascotaService.obtenerTodasLasMascotas();

    }

    @PostMapping("/{id]")
    public void  guardarMascota(@RequestBody Mascota mascota, @RequestParam Long usuarioId){

            mascotaService.guardarMascota(mascota, usuarioId);
    }

   @GetMapping("/{id}")
   public Mascota obtenerMascotaPorId(@PathVariable Long id){
        return mascotaService.obtenerMascotaPorId(id);

   }

   @DeleteMapping("/{id}/delete")
   public void eliminarMascota(@PathVariable Long id){

        mascotaService.eliminarMascota(id);

   }




}
