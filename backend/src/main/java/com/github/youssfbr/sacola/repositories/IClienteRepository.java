package com.github.youssfbr.sacola.repositories;

import com.github.youssfbr.sacola.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteRepository extends JpaRepository<Cliente, Long> {
}
