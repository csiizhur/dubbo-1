package com.king.mall.order.api;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by King on 2017/1/6.
 */
public class Order implements Serializable {

    private String id;

    private String itemName;

    private Date creatTime;

    public Order() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }
}
