package com.hph.nacosconfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 10499
 */
@RestController
// 配置动态刷新
@RefreshScope
class SampleController {

    @Value("${user.name}")
    String userName;

    @Value("${user.age}")
    int age;

    @GetMapping("/user")
    public String getUser() {
        return userName + "      " + age;
    }
}