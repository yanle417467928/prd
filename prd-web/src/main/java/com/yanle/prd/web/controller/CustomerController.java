package com.yanle.prd.web.controller;

import com.yanle.prd.domain.Customer;
import com.yanle.prd.domain.CustomerVo;
import com.yanle.prd.domain.rpc.ResultDTO;
import com.yanle.prd.domain.rpc.RpcCommonCode;
import com.yanle.prd.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Description: java类作用描述
 * @Author: Le Yan
 * @CreateDate: 2018/7/10 15:07
 */
@RestController
@RequestMapping(value = "/prd/customer")
@Slf4j
public class CustomerController {

    @Resource
    private CustomerService customerService;

    @GetMapping(value = "/{id}")
    public ResultDTO<CustomerVo> getCustomerInfoById(@PathVariable(value = "id") Long id) {
        CustomerVo customerVo = customerService.getCustomerInfoById(id);
        return new ResultDTO<CustomerVo>(RpcCommonCode.SUCCESS, null, customerVo);
    }

}
