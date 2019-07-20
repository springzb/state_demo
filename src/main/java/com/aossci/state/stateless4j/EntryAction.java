package com.aossci.state.stateless4j;

import com.github.oxo42.stateless4j.delegates.Action1;
import com.github.oxo42.stateless4j.transitions.Transition;

/**
 * @author zb
 * @date 2019/7/20 18:10
 * @Description: 跳转
 * Copyright (C),2019,AOSSCI Inc.傲势科技有限公司
 */
public class EntryAction implements Action1<Transition<CurrentState,Trigger>> {

    @Override
    public void doIt(Transition<CurrentState, Trigger> currentStateTriggerTransition) {
        // 改变后（Destination）的状态
        System.out.println("ENTRY TO : " +currentStateTriggerTransition.getDestination());
        // 改变前（Source）的状态
        System.out.println(currentStateTriggerTransition.getSource());
    }
}
