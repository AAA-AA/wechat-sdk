package com.github.wechat.sdk.entity.resp.ctmmsg;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @author : hongqiangren.
 * @since: 2018/6/17 20:57
 */
@Data
public class CtmCardMessage extends CtmMessage {

    @JSONField(name = "msgtype")
    private String msgType = "wxcard";

    private CardData wxcard;

    static class CardData {

        @JSONField(name = "card_id")
        private String cardId;
    }

}
