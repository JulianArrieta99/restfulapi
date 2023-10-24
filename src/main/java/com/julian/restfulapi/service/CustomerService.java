package com.julian.restfulapi.service;


import com.julian.restfulapi.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAllCustomers();
    Customer saveCustomer(Customer customer);
    Customer updateCustomer(Long id, Customer local);
    Customer findCustomerById(Long id);
    void deleteCustomer(Long id);

}