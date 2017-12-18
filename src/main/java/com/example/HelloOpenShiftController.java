package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class HelloOpenShiftController {
    @RequestMapping("hello")
    public String sayHello() throws UnknownHostException {
        String hostName = InetAddress.getLocalHost().getHostName();
        return ("Hello version: 3; from host: " + hostName);
    }
}