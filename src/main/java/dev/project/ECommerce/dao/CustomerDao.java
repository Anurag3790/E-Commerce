package dev.project.ECommerce.dao;

import dev.project.ECommerce.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDao extends JpaRepository<Customer, Long> {
}
