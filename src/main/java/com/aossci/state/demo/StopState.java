package com.aossci.state.demo;

/**
 * @author zb
 * @date 2019/7/20 11:23
 * @Description: 停止状态
 * Copyright (C),2019,AOSSCI Inc.傲势科技有限公司
 */
public class StopState implements LiftState {

    private Lift lift;

    public StopState(Lift lift){
        this.lift=lift;
    }


    @Override
    public void open() {
        System.out.println("停止------>打开");
        lift.setState(lift.getOpenState());
    }

    @Override
    public void close() {
        System.out.println("电梯本来就关闭的");
    }

    @Override
    public void run() {
        System.out.println("停止------>运行");
        lift.setState(lift.getRunState());
    }

    @Override
    public void stop() {
        System.out.println("电梯本来就是运行的");
    }
}
