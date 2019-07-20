package com.aossci.state.demo;

/**
 * @author zb
 * @date 2019/7/20 11:18
 * @Description: 运行状态
 * Copyright (C),2019,AOSSCI Inc.傲势科技有限公司
 */
public class RunState implements LiftState {
    private Lift lift;

    public RunState(Lift lift){
        this.lift=lift;
    }


    @Override
    public void open() {
        System.out.println("电梯不能够从运行状态变为打开");
    }

    @Override
    public void close() {
        System.out.println("电梯运行的时候门是关闭的");
    }

    @Override
    public void run() {
        System.out.println("电梯现在是运行的");
    }

    @Override
    public void stop() {
        System.out.println("运行-------->停止");
        lift.setState(lift.getStopState());
    }
}
