package com.king.mall.order.start;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by King on 2017/1/6.
 */
public class Startup {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        context.start();
        System.out.println("*****系统服务启动成功*****");
        synchronized (Startup.class) {
            while (true) {
                try {
                    Startup.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
