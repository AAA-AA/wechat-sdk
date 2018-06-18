package com.github.wechat.sdk.entity.req.ctmmsg;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @author : hongqiangren.
 * @since: 2018/6/15 17:12
 */
@Data
public class CtmAccountQo {

    @JSONField(name = "kf_account")
    private String kfAccount;

    private String nickname;

    private String password;

}
