package dev.project.ECommerce.repositories;

import dev.project.ECommerce.entities.Order;

import java.util.List;

public interface OrderRepository {
    List<Order> getAllOrders();

    Order getOrderById(Long id);

    Order placeOrder(Order order);
}
