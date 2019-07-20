package com.aossci.state.demo;

/**
 * @author zb
 * @date 2019/7/20 11:04
 * @Description: 打开状态
 * Copyright (C),2019,AOSSCI Inc.傲势科技有限公司
 */
public class OpenState implements LiftState {

    private Lift lift;

    public OpenState(Lift lift){
        this.lift=lift;
    }


    @Override
    public void open() {
        System.out.println("电梯处于打开状态");
    }

    @Override
    public void close() {
        System.out.println("开启-------->关闭");
        lift.setState(lift.getCloseState());
    }

    @Override
    public void run() {
        System.out.println("电梯处于打开状态，不能够直接运行");
    }

    @Override
    public void stop() {
        System.out.println("电梯打开的状态是处于停止状态");
    }
}
