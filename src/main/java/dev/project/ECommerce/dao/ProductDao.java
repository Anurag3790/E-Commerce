package dev.project.ECommerce.dao;

import dev.project.ECommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product, Long> {
}
