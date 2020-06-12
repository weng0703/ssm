package com.weng.ssm.mapper;

import com.weng.ssm.entity.GoodsDetail;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class GoodsDetailMapperTest extends TestCase {
    @Resource
    private GoodsDetailMapper mapper;
    @Test
    public void testSelectManyToOne() {
        List<GoodsDetail> goodsDetails = mapper.selectManyToOne();
        for (GoodsDetail g:
             goodsDetails) {
            System.out.println(g);
        }
    }
}