package dev.project.ECommerce.repositories;

import dev.project.ECommerce.entities.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> getAllProducts();

    Product getProductById(Long id);

    Product addProduct(Product product);

    Product updateProduct(Long id, Product updatedProduct);

    void deleteProduct(Long id);
}
