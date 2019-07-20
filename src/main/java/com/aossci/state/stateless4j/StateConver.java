package com.aossci.state.stateless4j;

import com.github.oxo42.stateless4j.StateMachineConfig;

/**
 * @author zb
 * @date 2019/7/20 16:29
 * @Description: 状态转换
 * Copyright (C),2019,AOSSCI Inc.傲势科技有限公司
 *  状态     条件      不同的条件触发变成不同的状态
 *  state 和 trigger 触发状态的转换
 */
public class StateConver {
    /**
     *                               当前状态    触发状态条件
     */
    private static StateMachineConfig<CurrentState,Trigger> config = new StateMachineConfig<>();

    static {
        /**
         * 最初为small状态时
         */
        config.configure(CurrentState.SMALL)
                /**
                 * 遇到蘑菇触发-->big状态
                 */
                .permit(Trigger.MUSHROOM,CurrentState.BIG)
                /**
                 * 花朵触发,-->直接变为可攻击状态
                 */
                .permit(Trigger.FLOWER,CurrentState.ATTACH)
                /**
                 * 妖怪触发,死亡状态
                 */
                .permit(Trigger.MONSTER,CurrentState.DEAD)
                /**
                 *     从当前状态改变时所触发的动作
                 */
                .onExit(new ExitAction())
                /**
                 *     改变到当前状态时所触发的动作
                 */
                .onEntry(new EntryAction());

        /**
         *  当为BIG状态的时候
         */
        config.configure(CurrentState.BIG)
                /**
                 * 蘑菇触发,状态不变,
                 * permitReentry方法state变化相同,但具体执行过程有一些区别
                 */
                .ignore(Trigger.MUSHROOM)
                .permit(Trigger.FLOWER,CurrentState.ATTACH)
                .permit(Trigger.MONSTER,CurrentState.SMALL);

        config.configure(CurrentState.ATTACH)
                .permit(Trigger.MONSTER,CurrentState.SMALL)
                .ignore(Trigger.FLOWER)
                .ignore(Trigger.MUSHROOM);

        config.configure(CurrentState.DEAD)
                .ignore(Trigger.MONSTER)
                .ignore(Trigger.FLOWER)
                .ignore(Trigger.MUSHROOM);
    }

    public static StateMachineConfig<CurrentState, Trigger> getConfig() {
        return config;
    }
}
