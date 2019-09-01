package com.hand.dp.InterceptingFilter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname FilterChain
 * @Description 过滤器链
 * @Date 2019-09-01 17:54
 * @Author changjiexian
 */
public class FilterChain {
    /**
     * 过滤器集合
     */
    List<Filter> filterList = new ArrayList<>();
    /**
     * 私有变量
     */
    private Target target;

    /**
     * set/get这里不需要
     * @param target
     */
    public void setTarget(Target target) {
        this.target = target;
    }

    /**
     * 添加过滤器
     * @param filter
     */
    public void addFilter(Filter filter){
        filterList.add(filter);
    }

    public void process(){
        /**
         * 前置拦截
         */
        filterList.forEach(l->{
            l.doFilter();
        });

        /**
         * 执行目标方法
         */
        target.execute();
    }
}
