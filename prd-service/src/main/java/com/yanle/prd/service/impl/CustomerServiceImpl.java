package com.yanle.prd.service.impl;

import com.yanle.prd.dao.cluster.StoreDao;
import com.yanle.prd.dao.master.CustomerDao;
import com.yanle.prd.domain.Customer;
import com.yanle.prd.domain.CustomerVo;
import com.yanle.prd.domain.Store;
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

    @Resource
    private StoreDao storeDao;

    public CustomerVo getCustomerInfoById(Long id) {
        if (null != id) {
            Customer customer = customerDao.getCustomerInfoById(id);
            CustomerVo customerVo = new CustomerVo(customer.getId(), customer.getName(),
                    customer.getAge(), customer.getStoreId(), null, null);
            Store store = storeDao.getStoreInfoById(customer.getStoreId());
            customerVo.setStoreName(store.getStoreName());
            customerVo.setStoreAddress(store.getAddress());
            return customerVo;
        }
        return null;
    }
}
