package com.aossci.state.homestate;

/**
 * @author zb
 * @date 2019/7/20 15:56
 * @Description: 空闲状态
 * Copyright (C),2019,AOSSCI Inc.傲势科技有限公司
 */
public class FreeState implements HomeState {
    private Home home;

    public FreeState(Home home){
        this.home=home;
    }

    @Override
    public void let() {
        System.out.println("空闲-------->出租");
        home.setState(home.getLetState());
    }

    @Override
    public void sale() {
        System.out.println("空闲-------->销售");
        home.setState(home.getSaleState());
    }

    @Override
    public void free() {
        System.out.println("现在状态是空闲状态");
    }
}
