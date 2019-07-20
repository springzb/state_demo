package com.aossci.state.homestate;

/**
 * @author zb
 * @date 2019/7/20 15:44
 * @Description: 房屋实体类
 * Copyright (C),2019,AOSSCI Inc.傲势科技有限公司
 */
public class Home {

    private HomeState letState;

    private HomeState saleState;

    private HomeState freeState;

    public Home(){
        letState=new LetState(this);
        saleState=new SaleState(this);
        freeState=new FreeState(this);
    }

    private HomeState state;

    public void let(){
        state.let();
    }
    public void free(){
        state.free();
    }
    public void sale(){
        state.sale();
    }

    public HomeState getLetState() {
        return letState;
    }

    public HomeState getSaleState() {
        return saleState;
    }

    public HomeState getFreeState() {
        return freeState;
    }

    public void setState(HomeState state){
        this.state=state;
    }

}
