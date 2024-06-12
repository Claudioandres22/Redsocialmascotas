package com.claudio.RedSocialMyPets.repositorio;

import com.claudio.RedSocialMyPets.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
