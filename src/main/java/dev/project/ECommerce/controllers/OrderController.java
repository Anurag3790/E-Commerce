package dev.project.ECommerce.controllers;

import dev.project.ECommerce.entities.Order;
import dev.project.ECommerce.services.OrderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderServices orderServices;

    @GetMapping("/getAllOrders")
    public ResponseEntity<List<Order>> getAllOrders() {
        return ResponseEntity.ok(orderServices.getAllOrders());
    }

    @GetMapping("/getOrderById/{id}")
    public ResponseEntity<Order> getOrderById(@PathVariable Long id) {
        Order order = orderServices.getOrderById(id);
        return order != null ? ResponseEntity.ok(order) : ResponseEntity.notFound().build();
    }

    @PostMapping("/placeOrder")
    public ResponseEntity<Order> placeOrder(@RequestBody Order order) {
        return ResponseEntity.ok(orderServices.placeOrder(order));
    }
}
