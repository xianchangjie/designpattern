package com.hand.dp.InterceptingFilter;

/**
 * @Classname DirtyFilter
 * @Description TODO
 * @Date 2019-09-01 17:53
 * @Author changjiexian
 */
public class DirtyFilter implements Filter{
    @Override
    public void doFilter() {
        System.out.println("脏话过滤");
    }
}
