package com.hzc.boot.controller;

import com.hzc.boot.service.ProxyService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 测试代理
 *
 * @author hanzhichao7
 * @date 2023/5/18 19:21
 */
@RestController
@RequestMapping("/proxy")
public class ProxyController {

    /**
     * 代理测试Service
     */
    @Resource
    ProxyService proxyService;

    @RequestMapping("public")
    public String publicMethod(){
        System.out.println("public method ——> proxyService=" + proxyService);
        proxyService.publicMethod();
        return "public method";
    }

    @RequestMapping("private")
    private String privateMethod(){
        System.out.println("private method ——> proxyService=" + proxyService);
        proxyService.privateMethod();
        return "private method";
    }

}
