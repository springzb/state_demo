package com.aossci.state;

import com.aossci.state.demo.Lift;
import com.aossci.state.demo.OpenState;
import com.aossci.state.homestate.FreeState;
import com.aossci.state.homestate.Home;
import org.junit.Test;

/**
 * @author zb
 * @date 2019/7/20 11:35
 * @Description: 测试
 * Copyright (C),2019,AOSSCI Inc.傲势科技有限公司
 */
public class TestState {

    @Test
    public void testState(){
        Lift lift = new Lift();
        lift.setState(new OpenState(lift));

        lift.close();

        lift.run();

        lift.stop();

        lift.open();
    }

    @Test
    public void TestHomeState(){
        Home home = new Home();
        // 初始化状态
        home.setState(new FreeState(home));

        home.let();

        home.sale();

        home.free();

        home.sale();

        home.free();

        home.let();

        home.free();
    }

}
