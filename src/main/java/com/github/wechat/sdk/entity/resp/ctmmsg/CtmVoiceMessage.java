package com.github.wechat.sdk.entity.resp.ctmmsg;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @author : hongqiangren.
 * @since: 2018/6/17 20:53
 */
public class CtmVoiceMessage extends CtmMessage {

    @JSONField(name = "msgtype")
    private String msgType = "voice";

    private VoiceData voice;

    @Data
    static class VoiceData {
        @JSONField(name = "media_id")
        private String mediaId;
    }

}
