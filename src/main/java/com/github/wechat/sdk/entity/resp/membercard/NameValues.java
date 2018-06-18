package com.github.wechat.sdk.entity.resp.membercard;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author coyzeng@gmail.com
 */
@Data
@NoArgsConstructor
public class NameValues implements Serializable {

    private static final long serialVersionUID = -2347652327532502630L;

    /**
     * 会员信息类目名称
     */
    private String name;
    /**
     * 会员卡信息类目值，比如等级值等
     */
    private String value;
    /**
     * 填写项目为多选时的返回
     */
    @JSONField(name = "value_list")
    private List<String> valueList;
}
