package com.hph.nacosdiscoveryconsumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * FeignClient 自身集成了 ribbon 负载均衡组件
 *
 * @author 10499
 */
@FeignClient(name = "service-provider")
public interface EchoService {

    @GetMapping(value = "/echo/{str}")
    String echo(@PathVariable("str") String str);
}
