package com.hand.dp.InterceptingFilter;

/**
 * @Classname PrivateFilter
 * @Description TODO
 * @Date 2019-09-01 17:52
 * @Author changjiexian
 */
public class PrivateFilter implements Filter {
    @Override
    public void doFilter() {
        System.out.println("隐私过滤");
    }
}
