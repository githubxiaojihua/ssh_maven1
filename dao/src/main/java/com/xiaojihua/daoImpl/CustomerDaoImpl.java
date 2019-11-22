package com.xiaojihua.daoImpl;

import com.xiaojihua.dao.CustomerDao;
import com.xiaojihua.entity.Customer;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

/**
 * 使用hibernatedaosupport操作数据库
 */
public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {

    public List<Customer> findAll() {
        return (List<Customer>)getHibernateTemplate().find("from Customer");
    }
}
