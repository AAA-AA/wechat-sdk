package com.github.wechat.sdk.entity.req.menu;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : hongqiangren.
 * @since: 2018/6/18 10:22
 */
@Data
@Builder
public class Button {
    /**
     * 菜单的响应动作类型，view表示网页类型，click表示点击类型，miniprogram表示小程序类型
     */
    private String type;
    /**
     * 菜单标题，不超过16个字节，子菜单不超过60个字节
     */
    private String name;
    /**
     * click等点击类型必须, 菜单KEY值，用于消息接口推送，不超过128字节
     */
    private String key;

    /**
     * view、miniprogram类型必须	网页 链接，用户点击菜单可打开链接，不超过1024字节。 type为miniprogram时，不支持小程序的老版本客户端将打开本url。
     */
    private String url;

    /**
     * miniprogram类型必须	小程序的appid（仅认证公众号可配置）
     */
    @JSONField(name = "appid")
    private String appId;

    /**
     * media_id类型和view_limited类型必须
     */
    @JSONField(name = "media_id")
    private String mediaId;

    /**
     * miniprogram类型必须	小程序的页面路径
     */
    private String pagePath;
    /**
     * 非必填， 二级菜单数组，个数应为1~5个
     */
    @JSONField(name = "sub_button")
    private List<Button> subButton = new ArrayList<>();

}
