package com.xiaojihua.web;

import com.opensymphony.xwork2.ActionSupport;
import com.xiaojihua.entity.Customer;
import com.xiaojihua.service.CustomerService;
import org.apache.struts2.ServletActionContext;

import java.util.List;

public class CustomerAction extends ActionSupport {

    private CustomerService customerService;

    public void setCustomerService(CustomerService service) {
        this.customerService = service;
    }

    public String findAll() throws Exception{
        List<Customer> all = customerService.findAll();
        //放入值栈
        ServletActionContext.getContext().put("customerList",all);
        return SUCCESS;
    }
}
