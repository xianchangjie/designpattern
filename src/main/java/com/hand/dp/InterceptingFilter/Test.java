package com.hand.dp.InterceptingFilter;

/**
 * @Classname Test
 * @Description TODO
 * @Date 2019-09-01 18:17
 * @Author changjiexian
 */
public class Test {
    public static void main(String[] args) {

        Target target = new Target();
        FilterManager filterManager = new FilterManager(target);
        filterManager.setFilter(new DirtyFilter());
        filterManager.setFilter(new PrivateFilter());
        filterManager.setFilter(new SensitiveFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest();

    }
}
