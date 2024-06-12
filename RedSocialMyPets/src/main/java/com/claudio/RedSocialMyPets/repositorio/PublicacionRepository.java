package com.claudio.RedSocialMyPets.repositorio;


import com.claudio.RedSocialMyPets.models.Publicacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PublicacionRepository extends JpaRepository<Publicacion, Long> {
}




