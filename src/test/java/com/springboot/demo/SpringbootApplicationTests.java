package com.springboot.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    RedisUtil redisUtil;

    @Test
    public void testRedis(){
        String id = "0753c996-4a52-45fd-af80-4e4a954542b2";
        Boolean hasKey = redisUtil.hasKey(id);

        if(!hasKey){
            System.out.println("从数据库读取");
            GoodsInfoJy g = goodsInfoJyMapper.selectByPrimaryKey(id);
            redisUtil.set(id, g);
            System.out.println(g);
        } else {
            System.out.println("从缓存读取");
            GoodsInfoJy g = (GoodsInfoJy)redisUtil.get(id);
            System.out.println(g);
        }

    }

}
