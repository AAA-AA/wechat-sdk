package com.github.wechat.sdk.entity.req.membercard;


import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.List;

/**
 * @author coyzeng@gmail.com
 */
@Data
@NoArgsConstructor
public class CardBaseInfo implements Serializable {

    private static final long serialVersionUID = 8077543330518626879L;

    /**
     * http://mmbiz.qpic.cn/mmbiz/iaL1LJM1mF9aRKPZ/0
     * 卡券的商户logo，建议像素为300*300
     */
    @NotBlank(message = "卡券LOGO不能为空")
    @Size(min = 1, max = 128, message = "卡券LOGO只支持1-128字")
    @JSONField(name = "logo_url")
    private String logoUrl;
    /**
     * 海底捞|商户名字,字数上限为12个汉字
     */
    @NotBlank(message = "品牌名称不能为空")
    @Size(min = 1, max = 12, message = "品牌名称只支持1-12字")
    @JSONField(name = "brand_name")
    private String brandName;

    /**
     * string(16)
     */
    @NotNull(message = "Code展示类型不能为空")
    @Size(min = 1, max = 16, message = "Code展示类型只支持1-16字")
    @JSONField(name = "code_type")
    private CodeType codeType = CodeType.CODE_TYPE_TEXT;

    /**
     * 海底捞会员卡|卡券名，字数上限为9个汉字
     * (建议涵盖卡券属性、服务及金额)
     */
    @NotBlank(message = "卡券名不能为空")
    @Size(min = 1, max = 12, message = "卡券名只支持1-12字")
    private String title;

    /**
     * 券颜色。按色彩规范标注填写Color010-Color100
     */
    @NotBlank(message = "券颜色不能为空")
    private String color = "Color010";

    /**
     * 使用时向服务员出示此券|卡券使用提醒，字数上限为16个汉字
     */
    @NotBlank(message = "卡券使用提醒不能为空")
    @Size(min = 1, max = 16, message = "卡券使用提醒只支持1-16字")
    private String notice;

    /**
     * 020-88888888|客服电话
     */
    @Size(min = 0, max = 24, message = "客服电话只支持0-24字")
    @JSONField(name = "service_phone")
    private String servicePhone;

    /**
     * 不可与其他优惠同享|卡券使用说明，字数上限为1024个汉字
     */
    @NotBlank(message = "卡券使用说明不能为空")
    @Size(min = 1, max = 1024, message = "卡券使用说明只支持1-1024字")
    private String description;

    /**
     * 使用日期，有效期的信息
     */
    @NotBlank(message = "使用日期不能为空")
    @JSONField(name = "date_info")
    private CardDate dateInfo;


    /**
     * 商品信息
     */
    @NotBlank(message = "商品信息不能为空")
    private CardSku sku;

    /**
     * 每人可领券的数量限制，建议会员卡每人限领一张
     */
    @NotNull(message = "每人可领券的数量不能为空")
    @Min(value = 1, message = "卡发行量只支持1-5")
    @Max(value = 5, message = "卡发行量只支持1-5")
    @JSONField(name = "get_limit")
    private Integer getLimit = 1;

    /**
     * 通常自有优惠码系统的开发者选择自定义Code码
     */
    @JSONField(name = "use_custom_code")
    private Boolean useCustomCode = false;

    /**
     * 卡券是否可转赠,默认为true
     */
    @JSONField(name = "can_give_friend")
    private Boolean canGiveFriend = true;

    /**
     * 门店位置ID。调用POI门店管理接口获取门店位置ID
     */
    @JSONField(name = "location_id_list")
    private List<Long> locationIdList;

    /**
     * 立即使用|自定义跳转外链的入口名字
     */
    @Size(min = 0, max = 15, message = "自定义跳转外链的入口名字只支持0-15字")
    @JSONField(name = "custom_url_name")
    private String customUrlName;

    /**
     * 自定义跳转的URL
     */
    @Size(min = 0, max = 128, message = "自定义跳转的URL只支持0-128字")
    @JSONField(name = "custom_url")
    private String customUrl;

    /**
     * 显示在入口右侧的提示语
     */
    @Size(min = 0, max = 18, message = "入口右侧的提示语只支持0-18字")
    @JSONField(name = "custom_url_sub_title")
    private String customUrlSubTitle;

    /**
     * 营销场景的自定义入口名称
     */
    @Size(min = 0, max = 15, message = "营销场景的自定义入口名称只支持0-15字")
    @JSONField(name = "promotion_url_name")
    private String promotion_url_name;

    /**
     * 营销场景的自定义入口名称
     */
    @Size(min = 0, max = 15, message = "营销场景的自定义入口名称只支持0-15字")
    @JSONField(name = "promotion_url")
    private String promotionUrl;

    /**
     * 填写true为用户点击进入会员卡时推送事件，默认为false。详情见进入会员卡事件推送
     */
    @JSONField(name = "need_push_on_view")
    private Boolean needPushOnView;
}
