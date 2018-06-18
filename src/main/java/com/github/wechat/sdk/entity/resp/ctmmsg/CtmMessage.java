package com.github.wechat.sdk.entity.resp.ctmmsg;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * 消息种类较多，请根据微信文档选择对应的消息类型
 *
 *
 * @author : hongqiangren.
 * @since: 2018/6/17 15:03
 */
@Data
@NoArgsConstructor
public class CtmMessage {

    @JSONField(name = "touser")
    private String openid;
}
