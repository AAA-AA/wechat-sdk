package com.github.wechat.sdk.entity.resp.membercard;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author : hongqiangren.
 * @since: 2018/6/18 09:58
 */
@Data
@NoArgsConstructor
public class MemberCardActiveFormData {

    /**
     * 通用组件数据
     */
    @JSONField(name = "common_field_list")
    private List<NameValues> commonFieldList;
    /**
     * 定制组件数据
     */
    @JSONField(name = "custom_field_list")
    private List<NameValues> customFieldList;
}
