package com.aossci.state.homestate;

/**
 * @author zb
 * @date 2019/7/20 15:51
 * @Description: 销售状态
 * Copyright (C),2019,AOSSCI Inc.傲势科技有限公司
 */
public class SaleState implements HomeState{

    private Home home;

    public SaleState(Home home){
        this.home=home;
    }

    @Override
    public void let() {
        System.out.println("销售状态不能够进行出租");
    }

    @Override
    public void sale() {
        System.out.println("目前状态是销售状态");
    }

    @Override
    public void free() {
        System.out.println("销售------>空闲");
        home.setState(home.getFreeState());
    }
}
