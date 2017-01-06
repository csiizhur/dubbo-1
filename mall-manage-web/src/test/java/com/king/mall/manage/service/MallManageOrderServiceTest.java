package com.king.mall.manage.service;

import com.king.mall.order.api.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by King on 2017/1/6.
 */

@ContextConfiguration(locations = "classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class MallManageOrderServiceTest {

    @Resource
    private MallManageOrderService manageOrderService;

    @Test
    public void get() throws Exception {
        String id = "1";
        Order order = manageOrderService.get(id);
        System.out.println(order.getId());
        System.out.println(order.getItemName());
        System.out.println(order.getCreatTime());
    }

}