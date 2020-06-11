package com.weng.ssm.service;


import com.weng.ssm.entity.Goods;
import com.weng.ssm.mapper.GoodsMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;


@Service
public class GoodsService {
    @Resource
    private GoodsMapper goodsMapper;

    /*
    @Transactional 当方法执行成功时自动提交,抛出RuntimeException及其子类时自动回滚
    利用rollbackFor = Exception.class遇到所有类型异常都会滚
    */
/*    @Transactional(rollbackFor = Exception.class)
    public void initGoods() throws ParseException {
        for (int i = 1; i <= 10; i++) {
            if(i==3){

//                throw new ParseException("",1);
//                throw new RuntimeException("Fail");
            }
            Goods goods = new Goods();
            goods.setTitle("批量导入测试" + i);
            goods.setSubTitle("");
            goods.setOriginalCost(0f);
            goods.setCurrentPrice(0f);
            goods.setDiscount(0f);
            goods.setIsFreeDelivery(1);
            goods.setCategoryId(44);
            goodsMapper.insert(goods);
        }
    }
    *//*不使用事务,方法注解优先级比类注解高*//*
    @Transactional(propagation = Propagation.NOT_SUPPORTED , readOnly = true)
    public Goods findById(Integer goodsId) {
        return  goodsMapper.findById(goodsId);
    }*/

    public Goods FindGoodByID(){
        Goods g = goodsMapper.findById(1000);
        return g;
    }
}
