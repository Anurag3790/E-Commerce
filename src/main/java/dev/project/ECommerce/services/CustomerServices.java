package dev.project.ECommerce.services;

import dev.project.ECommerce.entities.Customer;
import dev.project.ECommerce.repositories.CustomerRepository;
import dev.project.ECommerce.dao.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServices implements CustomerRepository {

    @Autowired
    private CustomerDao customerDao;

    @Override
    public List<Customer> getAllCustomers() {
        return customerDao.findAll();
    }

    @Override
    public Customer getCustomerById(Long id) {
        return customerDao.findById(id).orElse(null);
    }

    @Override
    public Customer addCustomer(Customer customer) {
        return customerDao.save(customer);
    }

    @Override
    public Customer updateCustomer(Long id, Customer updatedCustomer) {
        if (customerDao.existsById(id)) {
            updatedCustomer.setId(id);
            return customerDao.save(updatedCustomer);
        }
        return null;
    }

    @Override
    public void deleteCustomer(Long id) {
        if (customerDao.existsById(id)) {
            customerDao.deleteById(id);
        }
    }
}
