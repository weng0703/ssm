package com.weng.ssm.entity;

/*@@请加Q群：369531466,与几百名工程师共同学习,遇到难题可随时@老齐,多一点真诚，少一点套路@@*/
public class GoodsDetail {
    private Integer gdId;
    private Integer goodsId;
    private String gdPicUrl;
    private String gdOrder;
//    多一对关联,在多的一方只有一的实体
    private Goods goods;

    public Integer getGdId() {
        return gdId;
    }

    public void setGdId(Integer gdId) {
        this.gdId = gdId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGdPicUrl() {
        return gdPicUrl;
    }

    public void setGdPicUrl(String gdPicUrl) {
        this.gdPicUrl = gdPicUrl;
    }

    public String getGdOrder() {
        return gdOrder;
    }

    public void setGdOrder(String gdOrder) {
        this.gdOrder = gdOrder;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }
}
