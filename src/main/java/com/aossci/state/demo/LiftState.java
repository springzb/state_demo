package com.aossci.state.demo;

/**
 * @author zb
 * @date 2019/7/20 10:58
 * @Description: 状态接口
 * Copyright (C),2019,AOSSCI Inc.傲势科技有限公司
 */
public interface LiftState {
    /**
     * 开启
     */
    void open();

    /**
     * 关闭
     */
    void close();

    /**
     * 运行
     */
    void run();

    /**
     * 停止
     */
    void stop();
}
