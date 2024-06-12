package com.claudio.RedSocialMyPets.servicios;

import com.claudio.RedSocialMyPets.models.Mascota;
import com.claudio.RedSocialMyPets.models.Publicacion;
import com.claudio.RedSocialMyPets.models.Usuario;
import com.claudio.RedSocialMyPets.repositorio.MascotaRepository;
import com.claudio.RedSocialMyPets.repositorio.PublicacionRepository;
import com.claudio.RedSocialMyPets.repositorio.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicacionService {

    @Autowired
    private PublicacionRepository postRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private MascotaRepository mascotaRepository;

    public List<Publicacion> obtenerTodosLosPosts() {
        return postRepository.findAll();
    }

        public Publicacion guardarPost(Publicacion post, Long usuarioId, Long mascotaId) {
        Usuario usuario = usuarioRepository.findById(usuarioId).orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
        Mascota mascota = mascotaRepository.findById(mascotaId).orElseThrow(() -> new RuntimeException("Mascota no encontrada"));
        post.setUsuario(usuario);
        post.setMascota(mascota);
        return postRepository.save(post);
    }

    public Publicacion obtenerPostPorId(Long id) {
        return postRepository.findById(id).orElse(null);
    }

    public void eliminarPost(Long id) {
        postRepository.deleteById(id);
    }
}