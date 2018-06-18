package com.github.wechat.sdk.entity.resp;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : hongqiangren.
 * @since: 2018/6/14 18:11
 */
@Data
@NoArgsConstructor
public class IndustryPair {

    @JSONField(name = "first_class")
    private String firstClass;

    @JSONField(name = "second_class")
    private String secondClass;
}
