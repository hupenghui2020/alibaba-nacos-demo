package com.hph.nacosdiscoveryconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Nacos 服务的注册与发现
 * 服务的发现方（消费者）
 *
 * @author 10499
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class NacosDiscoveryConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosDiscoveryConsumerApplication.class, args);
    }

    // ------------------------ 下面是两种服务 RPC 调用方式 -------------------------------

    /**
     * @return
     * @LoadBalanced 注解为使得 RestTemplate 接入 Ribbon（因为 RestTemplate 是没有集成负载均衡组件的）
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
