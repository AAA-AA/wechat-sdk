package com.github.wechat.sdk.entity.req;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.util.Map;

/**
 * @author : hongqiangren.
 * @since: 2018/6/14 19:13
 */
@Data
@NoArgsConstructor
public class TemplateMessage {

    /**
     * 接收者openid
     */
    @NotBlank(message = "消息接收者不能为空")
    @JSONField(name = "touser")
    private String toUserOpenId;

    /**
     * 模板ID
     */
    @NotBlank(message = "消息模板ID不能为空")
    @JSONField(name = "template_id")
    private String templateId;

    /**
     * 模板跳转链接
     */
    private String url;

    /**
     * 跳小程序所需数据，不需跳小程序可不用传该数据
     */
    private MiniProgram miniprogram;

    /**
     * 模板数据
     */
    private Map<String, ValueColor> data;
}
