package com.aossci.state.demo;

import lombok.Data;

/**
 * @author zb
 * @date 2019/7/20 11:02
 * @Description: 电梯类
 * Copyright (C),2019,AOSSCI Inc.傲势科技有限公司
 */
@Data
/**
 * 定义电梯context
 */
public class Lift {
    //定义出电梯的所有状态
    private LiftState openState;
    private LiftState closeState;
    private LiftState runState;
    private LiftState stopState;

    public Lift() {
        openState = new OpenState(this);
        closeState = new CloseState(this);
        runState = new RunState(this);
        stopState = new StopState(this);
    }

    //定义电梯状态
    LiftState state;

    public void open() {
        state.open();
    }

    public void close() {
        state.close();
    }

    public void run() {
        state.run();
    }

    public void stop() {
        state.stop();
    }

    public void setState(LiftState state) {
        this.state = state;
    }

    public LiftState getOpenState() {
        return openState;
    }

    public LiftState getCloseState() {
        return closeState;
    }

    public LiftState getRunState() {
        return runState;
    }

    public LiftState getStopState() {
        return stopState;
    }

}
