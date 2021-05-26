package com.vueadmin.controller;

import com.vueadmin.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {


    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/list")
    public Object nihao() {
        System.out.println("111");
        return sysUserService.list();
    }
}
