package com.luguz.Config;

import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Guz
 * @create 2022-09--18 22:09
 */
@RestController
@Reference // 动态刷新配置信息
public class NacosConfig {
    @Value("${config.version}")
    private String configVersion;

    @RequestMapping("/get")
    public String get() {
        return configVersion;
    }
}

