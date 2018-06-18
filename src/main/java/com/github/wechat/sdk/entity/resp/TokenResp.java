package com.github.wechat.sdk.entity.resp;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : hongqiangren.
 * @since: 2018/6/14 15:11
 */
@Data
@NoArgsConstructor
public class TokenResp {

    @JSONField(name = "access_token")
    private String accessToken;
    @JSONField(name = "expires_in")
    private Integer expireIn;
}
