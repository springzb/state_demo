package com.aossci.state.demo;

/**
 * @author zb
 * @date 2019/7/20 11:12
 * @Description: 电梯关闭状态
 * Copyright (C),2019,AOSSCI Inc.傲势科技有限公司
 */
public class CloseState implements LiftState {

    private Lift lift;

    public CloseState(Lift lift){
        this.lift=lift;
    }


    @Override
    public void open() {
        System.out.println("关闭------->打开");
        lift.setState(lift.getOpenState());
    }

    @Override
    public void close() {
        System.out.println("电梯是关闭的");
    }

    @Override
    public void run() {
        System.out.println("关闭------>运行");
        lift.setState(lift.getRunState());
    }

    @Override
    public void stop() {
        System.out.println("关闭---->停止");
        lift.setState(lift.getStopState());
    }
}
