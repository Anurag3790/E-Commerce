package dev.project.ECommerce.services;

import dev.project.ECommerce.entities.Order;
import dev.project.ECommerce.repositories.OrderRepository;
import dev.project.ECommerce.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServices implements OrderRepository {

    @Autowired
    private OrderDao orderDao;

    @Override
    public List<Order> getAllOrders() {
        return orderDao.findAll();
    }

    @Override
    public Order getOrderById(Long id) {
        return orderDao.findById(id).orElse(null);
    }

    @Override
    public Order placeOrder(Order order) {
        return orderDao.save(order);
    }
}
