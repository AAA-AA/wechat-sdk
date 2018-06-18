package com.github.wechat.sdk.entity.resp;

/**
 * @author : hongqiangren.
 * @since: 2018/6/14 20:01
 */
public enum UserCardStatus {

    // 当前用户会员卡状态
    /**
     * 正常
     */
    NORMAL,
    /**
     * 已过期
     */
    EXPIRE,
    /**
     * 转赠中
     */
    GIFTING,
    /***
     * 转赠成功
     */
    GIFT_SUCC,
    /**
     * 转赠超时
     */
    GIFT_TIMEOUT,
    /**
     * 已删除
     */
    DELETE,
    /**
     * 已失效
     */
    UNAVAILABLE
}
