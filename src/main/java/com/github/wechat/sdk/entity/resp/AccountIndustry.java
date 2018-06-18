package com.github.wechat.sdk.entity.resp;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : hongqiangren.
 * @since: 2018/6/14 18:10
 */
@Data
@NoArgsConstructor
public class AccountIndustry {
    private static final long serialVersionUID = 5552494483120232746L;

    @JSONField(name = "primary_industry")
    private IndustryPair primaryIndustry;

    @JSONField(name = "secondary_industry")
    private IndustryPair secondaryIndustry;
}
