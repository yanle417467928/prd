package com.yanle.prd.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yanle.customer.api.CustomerApi;
import com.yanle.prd.dao.master.StoreDao;
import com.yanle.prd.dao.cluster.CustomerDao;
import com.yanle.prd.domain.Customer;
import com.yanle.prd.domain.CustomerVo;
import com.yanle.prd.domain.Store;
import com.yanle.prd.domain.rpc.ResultDTO;
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

    @Reference
    private CustomerApi customerApi;

    public CustomerVo getCustomerInfoById(Long id) {
        if (null != id) {
            ResultDTO<Customer> resultDTO = customerApi.get(id);
            Customer customer = resultDTO.getResult();
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
