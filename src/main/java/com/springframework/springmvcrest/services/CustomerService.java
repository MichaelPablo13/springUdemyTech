package com.springframework.springmvcrest.services;

import com.springframework.springmvcrest.domain.Customer;

import java.util.List;

public interface CustomerService {

    Customer findCustomerById(Long id);

    List<Customer> findALlCustomers();

    Customer saveCustomer(Customer customer);
}
