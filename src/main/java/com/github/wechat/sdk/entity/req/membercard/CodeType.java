package com.github.wechat.sdk.entity.req.membercard;

/**
 * @author : hongqiangren.
 * @since: 2018/6/18 00:19
 */
public enum CodeType {
    /**
     * 文本
     */
    CODE_TYPE_TEXT,
    /**
     * 一维码
     */
    CODE_TYPE_BARCODE,
    /**
     * 二维码
     */
    CODE_TYPE_QRCODE,
    /**
     * 仅显示二维码
     */
    CODE_TYPE_ONLY_QRCODE,
    /**
     * 仅显示一维码
     */
    CODE_TYPE_ONLY_BARCODE,
    /**
     * 不显示任何码型
     */
    CODE_TYPE_NONE
}
