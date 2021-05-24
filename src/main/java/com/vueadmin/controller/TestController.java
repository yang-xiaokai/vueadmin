package com.vueadmin.controller;

import com.vueadmin.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @Autowired
    private SysUserService sysUserService;

    @GetMapping("/list")
    public Object nihao() {
        return sysUserService.list();
    }
}
