package com.github.wechat.sdk.entity.resp.auth;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @author : hongqiangren.
 * @since: 2018/6/17 23:24
 */
@Data
public class WeChatToken {
    @JSONField(name = "access_token")
    private String accessToken;
    @JSONField(name = "expires_in")
    private Long expiresIn;
    private String openid;
    private String scope;
}
