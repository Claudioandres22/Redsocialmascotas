package com.claudio.RedSocialMyPets.servicios;

import com.claudio.RedSocialMyPets.models.Mascota;
import com.claudio.RedSocialMyPets.models.Usuario;
import com.claudio.RedSocialMyPets.repositorio.MascotaRepository;
import com.claudio.RedSocialMyPets.repositorio.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaService {

    @Autowired
    private MascotaRepository mascotaRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Mascota> obtenerTodasLasMascotas() {
        return mascotaRepository.findAll();
    }

    public Mascota guardarMascota(Mascota mascota, Long usuarioId) {
        Usuario usuario = usuarioRepository.findById(usuarioId).orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
        mascota.setUsuario(usuario);
        return mascotaRepository.save(mascota);
    }

    public Mascota obtenerMascotaPorId(Long id) {
        return mascotaRepository.findById(id).orElse(null);
    }

    public void eliminarMascota(Long id) {
        mascotaRepository.deleteById(id);
    }
}