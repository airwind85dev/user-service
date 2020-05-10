package com.home.user.user;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
@LoadBalancerClient(name = "say-hello", configuration = SayHelloConfiguration.class)
public class UserConfig {

    @LoadBalanced
    @Bean
    WebClient.Builder webClientBuilder() {
        System.out.println("Inside the web client builder config");
        return WebClient.builder();
    }

}
