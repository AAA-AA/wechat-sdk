package com.github.wechat.sdk.entity.req.membercard;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * @author coyzeng@gmail.com
 */
@Data
@NoArgsConstructor
public class MemberCardActive implements Serializable {

    private static final long serialVersionUID = 4195414819953362133L;

    /**
     * 会员卡编号，由开发者填入，作为序列号显示在用户的卡包里。可与Code码保持等值
     */
    @NotBlank(message = "会员卡编号不能为空")
    @Size(min = 1, max = 20, message = "会员卡编号只支持1-20位")
    @JSONField(name = "membership_number")
    private String membershipNumber;

    /**
     * 领取会员卡用户获得的code
     */
    @NotBlank(message = "会员卡用户CODE不能为空")
    @Size(min = 1, max = 20, message = "会员卡用户CODE只支持1-20位")
    private String code;

    /**
     * 卡券ID,自定义code卡券必填
     */
    @JSONField(name = "card_id")
    private String cardId;

    /**
     * 商家自定义会员卡背景图，须
     * 先调用上传图片接口将背景图上传至CDN，否则报错
     */
    @JSONField(name = "background_pic_url")
    private String backgroundPicUrl;

    /**
     * 激活后的有效起始时间。若不填写默认以创建时的 data_info 为准。Unix时间戳格式
     */
    @JSONField(name = "activate_begin_time ")
    private String activateBeginTime;

    /**
     * 激活后的有效截至时间。若不填写默认以创建时的 data_info 为准。Unix时间戳格式
     */
    @JSONField(name = "activate_end_time")
    private String activateEndTime;

    /**
     * 初始积分，不填为0
     */
    @JSONField(name = "init_bonus")
    private Integer initBonus = 0;

    /**
     * 积分同步说明
     */
    @Size(min = 0, max = 32, message = "积分同步说明只支持0-32位")
    @JSONField(name = "init_bonus_record")
    private String initBonusRecord;

    /**
     * 初始余额，不填为0
     */
    @JSONField(name = "init_balance")
    private Integer initBalance = 0;

    /**
     * 创建时字段custom_field1定义类型的初始值，限制为4个汉字，12字节
     */
    @Size(min = 0, max = 4, message = "只支持0-4位")
    @JSONField(name = "init_custom_field_value1")
    private String initCustomFieldValueLeft;

    /**
     * 创建时字段custom_field2定义类型的初始值，限制为4个汉字，12字节
     */
    @Size(min = 0, max = 4, message = "只支持0-4位")
    @JSONField(name = "init_custom_field_value2")
    private String initCustomFieldValueCenter;

    /**
     * 创建时字段custom_field3定义类型的初始值，限制为4个汉字，12字节
     */
    @Size(min = 0, max = 4, message = "只支持0-4位")
    @JSONField(name = "init_custom_field_value3")
    private String initCustomFieldValueRight;
}
