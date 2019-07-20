package com.aossci.state.homestate;

/**
 * @author zb
 * @date 2019/7/20 15:42
 * @Description: 房屋状态
 * Copyright (C),2019,AOSSCI Inc.傲势科技有限公司
 */
public interface HomeState {

    /**
     * 出租
     */
    void let();

    /**
     * 销售
     */
    void sale();

    /**
     * 空闲
     */
    void free();
}
