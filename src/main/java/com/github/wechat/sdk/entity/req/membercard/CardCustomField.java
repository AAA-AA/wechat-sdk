package com.github.wechat.sdk.entity.req.membercard;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author coyzeng@gmail.com
 */
@Data
@NoArgsConstructor
public class CardCustomField implements Serializable {

    private static final long serialVersionUID = 5187092172241385163L;

    /**
     * 会员信息类目半自定义名称，当开发者变更这类类目信息的value值时
     * 可以选择触发系统模板消息通知用户
     */
    @JSONField(name = "name_type")
    private CardNameType cardNameType;

    /**
     * 会员信息类目自定义名称，当开发者变更这类类目信息的value值时
     * 不会触发系统模板消息通知用户
     */
    private String name;

    /**
     * 点击类目跳转外链url
     */
    private String url;
}
