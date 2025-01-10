package dev.project.ECommerce.services;

import dev.project.ECommerce.entities.Product;
import dev.project.ECommerce.repositories.ProductRepository;
import dev.project.ECommerce.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServices implements ProductRepository {

    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> getAllProducts() {
        return productDao.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        return productDao.findById(id).orElse(null);
    }

    @Override
    public Product addProduct(Product product) {
        return productDao.save(product);
    }

    @Override
    public Product updateProduct(Long id, Product updatedProduct) {
        if (productDao.existsById(id)) {
            updatedProduct.setId(id);
            return productDao.save(updatedProduct);
        }
        return null;
    }

    @Override
    public void deleteProduct(Long id) {
        if (productDao.existsById(id)) {
            productDao.deleteById(id);
        }
    }
}
