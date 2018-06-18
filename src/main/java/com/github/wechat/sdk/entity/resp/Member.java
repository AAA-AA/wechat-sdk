package com.github.wechat.sdk.entity.resp;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : hongqiangren.
 * @since: 2018/6/14 20:00
 */
@Data
@NoArgsConstructor
public class Member {
    /**
     * 用户在本公众号内唯一识别码
     */
    private String openid;

    /**
     * 用户昵称
     */
    private String nickname;

    /**
     * 会员卡编号，由开发者填入，作为序列号显示在用户的卡包里。可与Code码保持等值
     */
    @JSONField(name = "membership_number")
    private String membershipNumber;

    /**
     * 积分信息
     */
    private Long bonus;

    /**
     * 余额信息
     */
    private Long balance;

    /**
     * 用户性别
     */
    private Gender sex;

    @JSONField(name = "user_card_status")
    private UserCardStatus userCardStatus;

    /**
     * 该卡是否已经被激活，true表示已经被激活，false表示未被激活
     */
    @JSONField(name = "has_active")
    private Boolean hasActive;

    /**
     * user_info           会员信息
     * custom_field_list   开发者设置的会员卡会员信息类目，如等级。
     * name            	   会员信息类目名称
     * value               会员卡信息类目值，比如等级值等
     */
    @JSONField(name = "user_info")
    private JSONObject userInfo;

}
