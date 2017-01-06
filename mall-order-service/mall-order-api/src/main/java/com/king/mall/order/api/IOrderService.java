package com.king.mall.order.api;

/**
 * Created by King on 2017/1/6.
 */
public interface IOrderService {

    /**
     * 根据id获取订单
     *
     * @param id    订单主键id
     * @return
     */
    Order get(String id);

}
