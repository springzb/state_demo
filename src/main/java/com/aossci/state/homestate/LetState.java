package com.aossci.state.homestate;

/**
 * @author zb
 * @date 2019/7/20 15:47
 * @Description: 出租状态
 * Copyright (C),2019,AOSSCI Inc.傲势科技有限公司
 */
public class LetState implements HomeState {

    private Home home;

    public LetState(Home home){
        this.home=home;
    }


    @Override
    public void let() {
        System.out.println("当前状态是空闲状态");
    }

    @Override
    public void sale() {
        System.out.println("出租中的房屋，不能够进行销售");
    }

    @Override
    public void free() {
        System.out.println("出租------->空闲");
        home.setState(home.getFreeState());
    }
}
