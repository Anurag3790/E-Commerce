package dev.project.ECommerce.dao;

import dev.project.ECommerce.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDao extends JpaRepository<Order, Long> {
}
