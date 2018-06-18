package com.github.wechat.sdk.entity.resp.membercard;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author coyzeng@gmail.com
 */
@Data
@NoArgsConstructor
public class QrCodeTicket implements Serializable {

    private static final long serialVersionUID = 3888423146419370341L;

    /**
     * 获取的二维码ticket，凭借此ticket调用通过ticket换取二维码接口可以在有效时间内换取二维码。
     */
    private String ticket;
    /**
     * 二维码图片解析后的地址，开发者可根据该地址自行生成需要的二维码图片
     */
    private String url;
    /**
     * 二维码显示地址，点击后跳转二维码页面
     */
    @JSONField(name = "show_qrcode_url")
    private String showQrcodeUrl;
}
