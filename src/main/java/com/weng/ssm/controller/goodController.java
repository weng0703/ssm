package com.weng.ssm.controller;

import com.weng.ssm.entity.Goods;
import com.weng.ssm.service.GoodsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class goodController {
    @Resource
    private GoodsService service;
    @GetMapping("/good/id")
    public Goods Find(){
        Goods goods = service.FindGoodByID();
        return goods;
    }

}
