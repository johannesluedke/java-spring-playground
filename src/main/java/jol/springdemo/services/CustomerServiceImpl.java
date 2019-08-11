package jol.springdemo.services;

import jol.springdemo.domain.Customer;
import jol.springdemo.repositories.CustomerRepository;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer findCustomerById(Long id) {
        return customerRepository.getOne(id);
    }

    @Override
    public List<Customer> finAllCustomers() {
        return customerRepository.findAll();
    }
}
