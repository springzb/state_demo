package com.aossci.state.stateless4j;

import com.github.oxo42.stateless4j.delegates.Action1;
import com.github.oxo42.stateless4j.transitions.Transition;

/**
 * @author zb
 * @date 2019/7/20 17:49
 * @Description: 任务
 * Copyright (C),2019,AOSSCI Inc.傲势科技有限公司
 */
public class ExitAction implements Action1<Transition<CurrentState,Trigger>> {

    @Override
    public void doIt(Transition<CurrentState, Trigger> currentStateTriggerTransition) {
        // 改变前的状态
        System.out.println("OUT FROM :" + currentStateTriggerTransition.getSource());
        // 改变后的状态
        System.out.println(currentStateTriggerTransition.getDestination());
    }
}
