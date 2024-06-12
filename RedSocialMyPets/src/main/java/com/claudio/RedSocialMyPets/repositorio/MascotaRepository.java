package com.claudio.RedSocialMyPets.repositorio;

import com.claudio.RedSocialMyPets.models.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MascotaRepository extends JpaRepository<Mascota, Long> {
}



