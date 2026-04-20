package com.SpringCloud.StudentService.FeignClientInterface;

import feign.Feign;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.context.annotation.Bean;

@LoadBalancerClient(value="AddressService")
public class AddressServiceLoadBalConfig {
    @LoadBalanced
    @Bean
    public Feign.Builder feignBuilder(){
        return Feign.builder();
    }
}
