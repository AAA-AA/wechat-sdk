package com.github.wechat.sdk.entity.resp;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : hongqiangren.
 * @since: 2018/6/14 18:14
 */
@Data
@NoArgsConstructor
public class MessageTemplate {

    /**
     * 模板ID
     */
    @JSONField(name = "template_id")
    private String templateId;
    /**
     * 模板标题
     */
    private String title;
    /**
     * 模板所属行业的一级行业
     */
    @JSONField(name = "primary_industry")
    private String primaryIndustry;
    /**
     * 模板所属行业的二级行业
     */
    @JSONField(name = "deputy_industry")
    private String deputyIndustry;
    /**
     * 模板内容
     */
    private String content;
    /**
     * 模板示例
     */
    private String example;

}
