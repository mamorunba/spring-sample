package com.example.springsample.service;

import com.example.springsample.entity.Customer;

public interface CustomerService {

    /**
     * 顧客を全件検索する
     */
    Iterable<Customer> findAll();

    /**
     * 1件の顧客をDBに追加する
     * @param customer 追加する顧客
     */
    void save(Customer customer);
}
