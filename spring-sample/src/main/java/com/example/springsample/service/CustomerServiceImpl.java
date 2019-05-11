package com.example.springsample.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

//import org.springframework.transaction.annotation.Propagation;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.example.persistence.repository.CustomerRepository;
import com.example.springsample.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

//    private final CustomerRepository customerRepository;

//    public CustomerServiceImpl(CustomerRepository customerRepository) {
//        this.customerRepository = customerRepository;
//    }
	public CustomerServiceImpl() {
	}

//    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
//    @Override
    public Iterable<Customer> findAll() {
//        return customerRepository.findAll();
    	List retList = new ArrayList<Customer>();
    	Customer c1 = new Customer();
    	c1.setId(1);
    	c1.setFirstName("Mamoru");
    	c1.setLastName("Asano");
    	c1.setEmail("xxxx@gmail.com");
//    	c1.setBirthday(new LocalDate());
    	retList.add(c1);

    	Customer c2 = new Customer();
    	c2.setId(1);
    	c2.setFirstName("Mamoru");
    	c2.setLastName("Asano");
    	c2.setEmail("xxxx@gmail.com");
    	retList.add(c2);
    	return retList;
    }

//    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
//    @Override
    public void save(Customer customer) {
//        customerRepository.save(customer);
    }
}
