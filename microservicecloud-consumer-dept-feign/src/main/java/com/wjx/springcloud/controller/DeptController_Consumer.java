package com.wjx.springcloud.controller;

import com.wjx.springcloud.entities.Dept;
import com.wjx.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController_Consumer {

    @Autowired
    private DeptClientService service;

    @GetMapping("/consumer/dept/get/{id}")
    Dept get(@PathVariable("id")long id){
        return this.service.get(id);
    }

    @GetMapping("/consumer/dept/list")
    List<Dept> list(){
        return this.service.list();
    }

    @PostMapping("/consumer/dept/add")
    boolean add(Dept dept){
        return this.service.add(dept);
    }


}
