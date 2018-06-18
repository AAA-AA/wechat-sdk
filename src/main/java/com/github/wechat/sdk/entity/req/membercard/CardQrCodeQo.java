package com.github.wechat.sdk.entity.req.membercard;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author coyzeng@gmail.com
 */
@Data
@NoArgsConstructor
public class CardQrCodeQo implements Serializable {

    private static final long serialVersionUID = -2684493541281926576L;

    /**
     * 卡券ID。
     */
    @JSONField(name = "card_id")
    private String cardId;
    /**
     * 卡券Code码,use_custom_code字段为true的卡券必须填写，非自定义code和导入code模式的卡券不必填写。
     */
    private String code;
    /**
     * 指定领取者的openid，只有该用户能领取。bind_openid字段为true的卡券必须填写，非指定openid不必填写。
     */
    @JSONField(name = "openid")
    private String openId;
    /**
     * 指定下发二维码，生成的二维码随机分配一个code，领取后不可再次扫描。填写true或false。
     * 默认false，注意填写该字段时，卡券须通过审核且库存不为0。
     */
    @JSONField(name = "is_unique_code")
    private Boolean isUniqueCode = true;
    /**
     * outer_id字段升级版本，字符串类型，用户首次领卡时，会通过领取事件推送给商户；
     * 对于会员卡的二维码，用户每次扫码打开会员卡后点击任何url，会将该值拼入url中，方便开发者定位扫码来源
     */
    @JSONField(name = "outer_str")
    private String outerStr;
}
