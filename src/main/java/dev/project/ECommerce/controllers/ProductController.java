package dev.project.ECommerce.controllers;

import dev.project.ECommerce.entities.Product;
import dev.project.ECommerce.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductServices productServices;

    @GetMapping("/getAllProducts")
    public ResponseEntity<List<Product>> getAllProducts() {
        return ResponseEntity.ok(productServices.getAllProducts());
    }

    @GetMapping("/getProductById/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        Product product = productServices.getProductById(id);
        return product != null ? ResponseEntity.ok(product) : ResponseEntity.notFound().build();
    }

    @PostMapping("/addProduct")
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        return ResponseEntity.ok(productServices.addProduct(product));
    }

    @PutMapping("/updateProduct/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product updatedProduct) {
        Product product = productServices.updateProduct(id, updatedProduct);
        return product != null ? ResponseEntity.ok(product) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/deleteProduct/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        productServices.deleteProduct(id);
        return ResponseEntity.noContent().build();
    }
}
