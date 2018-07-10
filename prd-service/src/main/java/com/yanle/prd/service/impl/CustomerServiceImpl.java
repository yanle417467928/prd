package com.yanle.prd.service.impl;

import com.yanle.prd.dao.CustomerDao;
import com.yanle.prd.domain.Customer;
import com.yanle.prd.service.CustomerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description: java类作用描述
 * @Author: Le Yan
 * @CreateDate: 2018/7/10 16:58
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Resource
    private CustomerDao customerDao;

    public Customer getCustomerInfoById(Long id) {
        if (null != id) {
            return customerDao.getCustomerInfoById(id);
        }
        return null;
    }
}
