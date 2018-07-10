package com.yanle.prd.service;

import com.yanle.prd.domain.Customer;
import com.yanle.prd.domain.CustomerVo;

/**
 * @Description: java类作用描述
 * @Author: Le Yan
 * @CreateDate: 2018/7/10 16:57
 */
public interface CustomerService {

    public CustomerVo getCustomerInfoById(Long id);
}
