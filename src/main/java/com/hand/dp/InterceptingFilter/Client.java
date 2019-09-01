package com.hand.dp.InterceptingFilter;

/**
 * @Classname Client
 * @Description 客户端
 * @Date 2019-09-01 18:16
 * @Author changjiexian
 */
public class Client {
    private FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager) {
        this.filterManager = filterManager;
    }

    public void sendRequest(){
        filterManager.filterRequest();
    }
}
