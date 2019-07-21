package com.aossci.state.springstate;

import com.sun.org.apache.regexp.internal.RE;
import org.springframework.statemachine.ExtendedState;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.config.StateMachineBuilder;
import org.springframework.statemachine.state.State;
import org.springframework.statemachine.support.LifecycleObjectSupport;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;

/**
 * @author zb
 * @date 2019/7/21 15:22
 * @Description:
 */
public class BuildMachine {

    public static StateMachine<States,Events> buildMachine() throws Exception {
        StateMachineBuilder.Builder<States, Events> builder = StateMachineBuilder.builder();
        // 配置状态
        builder.configureStates()
                .withStates()
                .initial(States.STATE1)
                .states(EnumSet.allOf(States.class));
        // 配置跳转
        builder.configureTransitions()
                .withExternal()
                .source(States.STATE1).target(States.STATE2)
                .event(Events.EVENTS1)
                .and()
                .withExternal()
                .source(States.STATE2).target(States.STATE1)
                .event(Events.EVENTS2);
        return builder.build();
    }

    public static void main(String[] args) throws Exception {
        StateMachine<States, Events> stateMachine = buildMachine();
        stateMachine.start();
        stateMachine.sendEvent(Events.EVENTS1);

        State<States, Events> initialState = stateMachine.getInitialState();
        System.out.println(initialState.getId());

        State<States, Events> state = stateMachine.getState();
        System.out.println(state.getId());

        stateMachine.sendEvent(Events.EVENTS1);
    }
}
