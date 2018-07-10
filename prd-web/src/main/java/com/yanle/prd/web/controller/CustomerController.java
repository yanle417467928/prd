package com.yanle.prd.web.controller;

import com.yanle.prd.domain.Customer;
import com.yanle.prd.domain.rpc.ResultDTO;
import com.yanle.prd.domain.rpc.RpcCommonCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @Description: java类作用描述
 * @Author: Le Yan
 * @CreateDate: 2018/7/10 15:07
 */
@RestController
@RequestMapping(value = "/prd/customer")
@Slf4j
public class CustomerController {

    @GetMapping(value = "/{id}")
    public ResultDTO<Customer> getCustomerInfoById(@PathVariable(value = "id") Long id) {
        Customer customer = new Customer();
        customer.setId(id);
        customer.setAge(20);
        customer.setName("张无忌");
        return new ResultDTO<Customer>(RpcCommonCode.SUCCESS, null, customer);
    }

}
