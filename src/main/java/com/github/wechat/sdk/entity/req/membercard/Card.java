package com.github.wechat.sdk.entity.req.membercard;

import com.alibaba.fastjson.annotation.JSONField;

import javax.validation.constraints.NotNull;

/**
 * @author : hongqiangren.
 * @since: 2018/6/18 00:12
 */
public class Card {
    /**
     * 会员卡类型
     */
    @JSONField(name = "card_type")
    @NotNull(message = "会员卡类型不能为空")
    private CardType cardType = CardType.MEMBER_CARD;
    @JSONField(name = "member_card")
    @NotNull(message = "会员卡信息不能为空")
    private MemberCard memberCard;
}
