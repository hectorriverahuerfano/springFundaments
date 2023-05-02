package com.Platzi.fundamentosSpring.bean.implementation;


import com.Platzi.fundamentosSpring.bean.MyBean;

public class MyBeanImpl implements MyBean {

    @Override
    public String hello() {
        return "Hello from my BeanImpl";
    }
}
