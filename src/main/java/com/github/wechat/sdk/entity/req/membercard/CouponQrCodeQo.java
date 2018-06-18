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
public class CouponQrCodeQo implements Serializable {

    private static final long serialVersionUID = -8804083601528561069L;
    @JSONField(name = "action_name")
    private String actionName = "QR_CARD";
    /**
     * 指定二维码的有效时间，范围是60 ~ 1800秒。不填默认为365天有效
     */
    @JSONField(name = "expire_seconds")
    private Integer expireSeconds;
    @JSONField(name = "action_info")
    private CouponAction actionInfo;
}
