package com.aossci.state.stateless4j;

/**
 * @author zb
 * @date 2019/7/20 16:22
 * @Description: 当前状态
 * Copyright (C),2019,AOSSCI Inc.傲势科技有限公司
 */
public enum CurrentState {

    /**
     * 初始状态
     */
    SMALL,

    /**
     * 变大状态
     */
    BIG,

    /**
     * 攻击状态
     */
    ATTACH,

    /**
     * 死亡状态
     */
    DEAD
}
