package me.ghisiluizgustavo.fchexagonal.adapters.out.db.repository;

import me.ghisiluizgustavo.fchexagonal.adapters.out.db.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, String> { }
