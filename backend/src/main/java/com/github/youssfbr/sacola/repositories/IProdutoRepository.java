package com.github.youssfbr.sacola.repositories;

import com.github.youssfbr.sacola.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProdutoRepository extends JpaRepository<Produto, Long> {
}
