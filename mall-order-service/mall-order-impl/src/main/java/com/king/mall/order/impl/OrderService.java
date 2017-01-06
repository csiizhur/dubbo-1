package com.king.mall.order.impl;

import com.king.mall.order.api.IOrderService;
import com.king.mall.order.api.Order;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * Created by King on 2017/1/6.
 */

@Repository
public class OrderService implements IOrderService {

    public Order get(String id) {
        Order order = new Order();
        order.setId(id);
        order.setItemName("苹果");
        order.setCreatTime(new Date());
        return order;
    }


}
