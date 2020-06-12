package com.weng.ssm.mapper;

import com.weng.ssm.entity.Goods;

import java.util.List;

public interface GoodsMapper {

    public Goods findById(Integer id);

    public List<Goods> selectOneToMany();
}
