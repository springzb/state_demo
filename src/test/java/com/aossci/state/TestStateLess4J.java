package com.aossci.state;

import com.aossci.state.stateless4j.CurrentState;
import com.aossci.state.stateless4j.StateConver;
import com.aossci.state.stateless4j.Trigger;
import com.github.oxo42.stateless4j.StateMachine;
import org.junit.Test;

/**
 * @author zb
 * @date 2019/7/20 16:44
 * @Description: 测试状态机
 * Copyright (C),2019,AOSSCI Inc.傲势科技有限公司
 */
public class TestStateLess4J {

    /**
     * 设置初始状态为 小
     */
    private static StateMachine<CurrentState,Trigger> stateMachine =
            new StateMachine<>(CurrentState.SMALL, StateConver.getConfig());

    @Test
    public void testStateMachine(){
        /**
         * 触发条件
         */
        stateMachine.fire(Trigger.FLOWER);

        System.out.println("currentState-->"+stateMachine.getState());

        stateMachine.fire(Trigger.MUSHROOM);
        System.out.println(stateMachine.getState());

        stateMachine.fire(Trigger.MONSTER);
        System.out.println(stateMachine.getState());

        stateMachine.fire(Trigger.MUSHROOM);
        System.out.println(stateMachine.getState());

        stateMachine.fire(Trigger.FLOWER);
        System.out.println(stateMachine.getState());

        stateMachine.fire(Trigger.MONSTER);
        System.out.println(stateMachine.getState());


        stateMachine.fire(Trigger.MONSTER);
        System.out.println(stateMachine.getState());
        /**
         * 查询所有的 触发条件
         */
        System.out.println(stateMachine.getPermittedTriggers());
    }


    @Test
    public void testOne(){
        stateMachine.fire(Trigger.FLOWER);
        // 从当前状态改变时所触发的动作         getState是改变后的状态
        System.out.println("currentState-->"+stateMachine.getState());
    }


    @Test
    public void testTwo(){
        stateMachine.fire(Trigger.FLOWER);
        // 从当前状态改变时所触发的动作
        System.out.println("currentState-->"+stateMachine.getState());
        // 改变到当前状态时所触发的动作
        stateMachine.fire(Trigger.MONSTER);
    }

}
