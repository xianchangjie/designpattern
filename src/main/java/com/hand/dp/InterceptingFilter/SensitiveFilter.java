package com.hand.dp.InterceptingFilter;

/**
 * @Classname SensitiveFilter
 * @Description 敏感信息拦截
 * @Date 2019-08-31 18:53
 * @Author changjiexian
 */
public class SensitiveFilter implements Filter{
    @Override
    public void doFilter() {
        System.out.println("敏感信息过滤");
    }
}
