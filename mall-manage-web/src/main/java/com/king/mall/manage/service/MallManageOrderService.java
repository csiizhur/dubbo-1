package com.king.mall.manage.service;

import com.king.mall.order.api.IOrderService;
import com.king.mall.order.api.Order;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by King on 2017/1/6.
 */

@Service
public class MallManageOrderService {

    @Resource
    private IOrderService orderService;

    public Order get(String id) {
        Order order = orderService.get(id);
        return order;
    }

}
