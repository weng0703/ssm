package com.weng.ssm.mapper;

import com.weng.ssm.entity.GoodsDetail;

import java.util.List;

public interface GoodsDetailMapper {

    public GoodsDetail findByGoodsId(Integer id);

    public List<GoodsDetail> selectManyToOne();
}
