package com.github.wechat.sdk.entity.resp.ctmmsg;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @author : hongqiangren.
 * @since: 2018/6/17 20:20
 */
@Data
public class CtmImageMessage extends CtmMessage{

    private ImageData image;

    @JSONField(name = "msgtype")
    private String msgType = "image";

    @Data
    static class ImageData {
        @JSONField(name = "media_id")
        private String mediaId;
    }

}
