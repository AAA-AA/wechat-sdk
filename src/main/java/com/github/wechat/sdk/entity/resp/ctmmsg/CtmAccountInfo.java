package com.github.wechat.sdk.entity.resp.ctmmsg;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @author : hongqiangren.
 * @since: 2018/6/15 17:19
 */
@Data
public class CtmAccountInfo {

    @JSONField(name = "kf_account")
    private String account;

    @JSONField(name = "kf_nick")
    private String nickname;

    @JSONField(name = "kf_headimgurl")
    private String headImageUrl;

    @JSONField(name = "kf_id")
    private String id;

}
