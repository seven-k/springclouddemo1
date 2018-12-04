package com.ycl.discovery.hiserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cl.yin
 * @since 2018/12/4 17:10
 */
@RestController
@RequestMapping("/hi")
public class HiController {

    @RequestMapping("/sayhi")
    public String sayHi() {
        return "spring cloud";
    }
}
