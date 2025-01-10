package dev.project.ECommerce.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "Orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private long customerId;

    @Column(nullable = false)
    private long productId;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private Date orderDate = new Date();
}
