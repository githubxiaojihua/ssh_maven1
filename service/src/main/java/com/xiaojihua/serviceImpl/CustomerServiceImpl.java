package com.xiaojihua.serviceImpl;

import com.xiaojihua.dao.CustomerDao;
import com.xiaojihua.entity.Customer;
import com.xiaojihua.service.CustomerService;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private CustomerDao customerDao;

    public void setCustomerDao(CustomerDao dao) {
        this.customerDao = dao;
    }

    public List<Customer> findAll() {
        return customerDao.findAll();
    }
}
