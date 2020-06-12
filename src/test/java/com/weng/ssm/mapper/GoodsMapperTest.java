package com.weng.ssm.mapper;

import com.weng.ssm.entity.Goods;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class GoodsMapperTest extends TestCase {
    @Resource
    private GoodsMapper mapper;
        @Test
    public void testSelectOneToMany() {
        List<Goods> goods = mapper.selectOneToMany();
        for (Goods g :
                goods) {
            System.out.println(g);
        }
    }
}