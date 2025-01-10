package dev.project.ECommerce.repositories;

import dev.project.ECommerce.entities.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> getAllCustomers();

    Customer getCustomerById(Long id);

    Customer addCustomer(Customer customer);

    Customer updateCustomer(Long id, Customer updatedCustomer);

    void deleteCustomer(Long id);
}
