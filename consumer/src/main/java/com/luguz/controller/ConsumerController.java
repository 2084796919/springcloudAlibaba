package com.luguz.controller;

import com.luguz.Client.ProvideController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;

/**
 * @author Guz
 * @create 2022-09--18 19:51
 */
@RestController
@RequestMapping("/order")
public class ConsumerController {
    @Autowired
    private ProvideController ProvideController;

    @RequestMapping("/add")
    public String add(){
        System.out.println("下单成功");
//        调用
        return "订单下单成功 -- " + ProvideController.add();

    }

}
