package com.github.wechat.sdk.entity.req.membercard;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author : hongqiangren.
 * @since: 2018/6/18 00:13
 */
@Data
@NoArgsConstructor
public class MemberCard {
    /**
     * 商家自定义会员卡背景图，须
     * 先调用上传图片接口将背景图上传至CDN，否则报错，
     * 卡面设计请遵循微信会员卡自定义背景设计规范  ,像素大小控制在
     * 1000像素*600像素以下
     */
    @Size(min = 0, max = 128, message = "商家自定义会员卡背景图地址只支持0-128字")
    @JSONField(name = "background_pic_url")
    private String backgroundPicUrl;

    @NotNull(message = "会员卡基础信息不能为空")
    @JSONField(name = "base_info")
    private CardBaseInfo cardBaseInfo;

    @NotNull(message = "会员卡高级属性不能为空")
    @JSONField(name = "advanced_info")
    private CardAdvancedInfo cardAdvancedInfo;

    /**
     * 显示积分，填写true或false，如填写true，积分相关字段均为必填
     */
    @NotNull(message = "显示积分必填")
    @JSONField(name = "supply_bonus")
    private Boolean supplyBonus = false;

    /**
     * 积分规则
     */
    @JSONField(name = "bonus_rule")
    private BonusRule bonusRule;

    /**
     * 是否支持储值，填写true或false。如填写true，储值相关字段均为必填
     */
    @NotNull(message = "是否支持储值必填")
    @JSONField(name = "supply_balance")
    private Boolean supplyBalance = false;

    /**
     * 会员卡特权说明,限制1024汉字
     */
    @Size(min = 1, max = 1024, message = "会员卡特权说明只支持1-1024字")
    @NotBlank(message = "会员卡特权说明不能为空")
    private String prerogative;

    /**
     * 设置为true时用户领取会员卡后系统自动将其激活，无需调用激活接口，详情见自动激活
     * 1.填入了自动激活auto_activate字段，激活链接activate_url和一键开卡接口设置都会失效；
     * 2.若同时传入了activate_url，则一键开卡接口设置会失效；
     * 3.建议开发者activate_url、auto_activate和wx_activate只填写一项。
     */
    @JSONField(name = "auto_activate")
    private Boolean autoActivate;

    /**
     * 设置为true时会员卡支持一键开卡，不允许同时传入activate_url字段，否则设置wx_activate失效。
     * 填入该字段后仍需调用接口设置开卡项方可生效，详情见一键开卡
     * 1.填入了自动激活auto_activate字段，激活链接activate_url和一键开卡接口设置都会失效；
     * 2.若同时传入了activate_url，则一键开卡接口设置会失效；
     * 3.建议开发者activate_url、auto_activate和wx_activate只填写一项。
     */
    @JSONField(name = "wx_activate")
    private Boolean wxActivate = true;

    /**
     * 是否支持跳转型一键激活
     */
    @JSONField(name = "wx_activate_after_submit")
    private Boolean wxActivateAfterSubmit = true;

    /**
     * 跳转型一键激活跳转的地址链接，请填写http://或者https://开头的链接
     */
    @JSONField(name = "wx_activate_after_submit_url")
    private String wxActivateAfterSubmitUrl;

    /**
     * 激活会员卡的url|如果为手动激活，激活地址不能为空
     * 1.填入了自动激活auto_activate字段，激活链接activate_url和一键开卡接口设置都会失效；
     * 2.若同时传入了activate_url，则一键开卡接口设置会失效；
     * 3.建议开发者activate_url、auto_activate和wx_activate只填写一项。
     */
    @Size(min = 0, max = 128, message = "激活会员卡地址只支持1-128字")
    @JSONField(name = "activate_url")
    private String activateUrl;

    /**
     * 折扣，该会员卡享受的折扣优惠,填10就是九折
     */
    private Integer discount;

    /**
     * 自定义会员信息类目，会员卡激活后显示,包含name_type(name)和url字段
     */
    @JSONField(name = "custom_field1")
    private CardCustomField customFieldLeft;

    /**
     * 自定义会员信息类目，会员卡激活后显示,包含name_type(name)和url字段
     */
    @JSONField(name = "custom_field2")
    private CardCustomField customFieldCenter;

    /**
     * 自定义会员信息类目，会员卡激活后显示,包含name_type(name)和url字段
     */
    @JSONField(name = "custom_field3")
    private CardCustomField customFieldRight;

    /**
     * 自定义会员信息类目，会员卡激活后显示
     */
    @JSONField(name = "custom_cell1")
    private CardCustomCell cardCustomCell;
}
