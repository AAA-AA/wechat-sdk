package com.github.wechat.sdk.oauth;

/**
 * @author : hongqiangren.
 * @since: 2018/6/14 18:35
 */
public interface TokenFactory {
    String loadToken(Long brandId);
}
