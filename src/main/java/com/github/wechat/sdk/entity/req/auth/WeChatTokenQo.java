package com.github.wechat.sdk.entity.req.auth;

import com.alibaba.fastjson.annotation.JSONField;
import github.com.http.sdk.anno.Key;
import lombok.Data;

/**
 * @author : hongqiangren.
 * @since: 2018/6/17 23:23
 */
@Data
public class WeChatTokenQo {
    @JSONField(name = "grant_type")
    private String grantType = "client_credential";
    @Key
    private String appid;
    private String secret;
    private String code;
}
