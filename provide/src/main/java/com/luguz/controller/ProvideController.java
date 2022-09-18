package com.luguz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author Guz
 * @create 2022-09--18 16:50
 */

@RestController
@RequestMapping("/order")
public class ProvideController {

    @GetMapping("/add")
    public String add(){

        System.out.println("库存减少");
        return "订单库存减少成功 订单编号:" + UUID.randomUUID().toString().replace("-", "");
    }
}
