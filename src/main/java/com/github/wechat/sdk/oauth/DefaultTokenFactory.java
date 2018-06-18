package com.github.wechat.sdk.oauth;

import com.github.wechat.sdk.constant.WechatConst;

/**
 * @author : hongqiangren.
 * @since: 2018/6/14 18:35
 */
public class DefaultTokenFactory implements TokenFactory {

    @Override
    public String loadToken(Long brandId) {
        return WechatConst.TEST_TOKEN;
    }
}
