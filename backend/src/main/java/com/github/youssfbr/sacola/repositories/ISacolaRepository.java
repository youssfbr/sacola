package com.github.youssfbr.sacola.repositories;

import com.github.youssfbr.sacola.entities.Sacola;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISacolaRepository extends JpaRepository<Sacola, Long> {
}
