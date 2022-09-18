package com.luguz.Client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.UUID;

/**
 * @author Guz
 * @create 2022-09--18 19:58
 */

@FeignClient("provide-8081") //  nacos注册的名字 方法跟类名需要与对应的需要服务注入的服务匹配
public interface  ProvideController {
    @GetMapping("/order/add")
    public String add();
}
