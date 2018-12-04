package com.ycl.discovery.hicosumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author cl.yin
 * @since 2018/12/4 17:27
 */
@RestController
@RequestMapping("/hi")
public class HiConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/say")
    public String sayHi() {
        ResponseEntity<String> response = restTemplate.exchange("http://HISERVICE/hi/sayhi", HttpMethod.GET, null,
                new ParameterizedTypeReference<String>() {
                });
        return response.getBody();
    }
}
