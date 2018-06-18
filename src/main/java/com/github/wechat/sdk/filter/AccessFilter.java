package com.github.wechat.sdk.filter;

import com.github.wechat.sdk.oauth.DefaultTokenFactory;
import com.github.wechat.sdk.oauth.TokenFactory;
import github.com.http.sdk.filter.Filter;
import github.com.http.sdk.proxy.Invocation;
import github.com.http.sdk.proxy.Invoker;

/**
 * @author : hongqiangren.
 * @since: 2018/6/14 16:05
 */
public class AccessFilter implements Filter {

    private TokenFactory tokenFactory;
    @Override
    public Object invoke(Invoker<?> invoker, Invocation invocation) throws Throwable {
        Long brandId = invocation.getTransient("brandId");
        if (brandId != null && brandId.equals(12L) && tokenFactory == null) {
            invocation.addQuery("access_token",new DefaultTokenFactory().loadToken(12L));
        }
        return invoker.invoke(invocation);
    }
}
