package com.github.youssfbr.sacola.repositories;

import com.github.youssfbr.sacola.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IItemRepository extends JpaRepository<Item, Long> {
}
