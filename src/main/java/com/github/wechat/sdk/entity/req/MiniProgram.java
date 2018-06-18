package com.github.wechat.sdk.entity.req;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * @author : hongqiangren.
 * @since: 2018/6/14 19:49
 */
@Data
@NoArgsConstructor
public class MiniProgram {

    /**
     * 所需跳转到的小程序appid（该小程序appid必须与发模板消息的公众号是绑定关联关系）
     */
    @NotBlank(message = "小程序APPID不能为空")
    @JSONField(name = "appid")
    private String appId;

    /**
     * 所需跳转到小程序的具体页面路径，支持带参数,（示例index?foo=bar）ø
     */
    @NotBlank(message = "小程序跳转路径不能为空")
    @JSONField(name = "pagepath")
    private String pagePath;
}
