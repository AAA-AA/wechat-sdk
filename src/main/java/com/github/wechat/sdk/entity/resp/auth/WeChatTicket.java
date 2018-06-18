package com.github.wechat.sdk.entity.resp.auth;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @author : hongqiangren.
 * @since: 2018/6/17 23:21
 */
@Data
public class WeChatTicket {

    private String ticket;

    @JSONField(name = "expires_in")
    private Long expiresIn;
}
