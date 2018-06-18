package com.github.wechat.sdk.entity.resp.ctmmsg;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @author : hongqiangren.
 * @since: 2018/6/15 17:29
 */
@Data
public class CtmTextMessage extends CtmMessage{

    @JSONField(name = "text")
    private TextData text;

    @JSONField(name = "msgtype")
    private String msgType = "text";

    @Data
    class TextData {
        private String content;
    }

}

