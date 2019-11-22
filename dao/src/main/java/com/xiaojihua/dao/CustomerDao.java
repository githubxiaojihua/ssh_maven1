package com.xiaojihua.dao;

import com.xiaojihua.entity.Customer;

import java.util.List;

public interface CustomerDao {
    List<Customer> findAll();
}
