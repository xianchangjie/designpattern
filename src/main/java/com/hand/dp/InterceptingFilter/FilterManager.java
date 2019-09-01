package com.hand.dp.InterceptingFilter;

/**
 * @Classname FilterManager
 * @Description 过滤器管理
 * @Date 2019-09-01 18:05
 * @Author changjiexian
 */
public class FilterManager {
    /**
     * 私有变量-过滤器链
     */
    private FilterChain filterChain;

    /**
     * 构造方法-set过滤器链
     * @param target
     */
    public FilterManager(Target target) {
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }

    /**
     * set方法
     * @param filter
     */
    public void setFilter(Filter filter) {
        filterChain.addFilter(filter);
    }

    /**
     * 过滤请求
     */
    public void filterRequest(){
        filterChain.process();
    }
}
