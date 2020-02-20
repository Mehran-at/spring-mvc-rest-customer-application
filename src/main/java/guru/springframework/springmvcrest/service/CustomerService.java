package guru.springframework.springmvcrest.service;

import guru.springframework.springmvcrest.domain.Customer;

import java.util.List;

public interface CustomerService {
    Customer findCustomerById(Long id);
    List<Customer> findAllCustomer();
    Customer saveCustomer(Customer customer);
}
