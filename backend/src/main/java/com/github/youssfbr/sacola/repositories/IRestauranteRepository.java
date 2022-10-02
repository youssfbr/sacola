package com.github.youssfbr.sacola.repositories;

import com.github.youssfbr.sacola.entities.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRestauranteRepository extends JpaRepository<Restaurante, Long> {
}
