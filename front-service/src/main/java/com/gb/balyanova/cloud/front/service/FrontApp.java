package com.gb.balyanova.cloud.front.service;

import com.gb.balyanova.cloud.common.ProductDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@SpringBootApplication
@EnableEurekaClient
@RestController
public class FrontApp {
    FrontService frontService;

    public FrontApp(FrontService frontService) {
        this.frontService = frontService;
    }

    @GetMapping("/api/v1/products")
    public List<ProductDto> getAllProducts(){
        return frontService.getAllProducts();
    }

    public static void main(String[] args) {
        SpringApplication.run(FrontApp.class, args);
    }

}
