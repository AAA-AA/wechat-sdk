package com.github.wechat.sdk.entity.req.membercard;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * @author coyzeng@gmail.com
 */
@Data
@NoArgsConstructor
public class CardUseCondition implements Serializable {

    private static final long serialVersionUID = -1600430378280709518L;

    /**
     * 指定可用的商品类目，仅用于代金券类型
     * ，填入后将在券面拼写适用于xxx
     */
    @Size(min = 0, max = 512, message = "指定可用的商品类目只支持0-512字")
    @JSONField(name = "accept_category")
    private String acceptCategory;

    /**
     * 指定不可用的商品类目，仅用于代金券类型
     * ，填入后将在券面拼写不适用于xxxx
     */
    @Size(min = 0, max = 512, message = "指定不可用的商品类目只支持0-512字")
    @JSONField(name = "reject_category")
    private String rejectCategory;

    /**
     * 不可以与其他类型共享门槛
     * ，填写false时系统将在使用须知里
     * 拼写“不可与其他优惠共享”，
     * 填写true时系统将在使用须知里
     * 拼写“可与其他优惠共享”，
     * 默认为true
     */
    @JSONField(name = "can_use_with_other_discount")
    private Boolean canUseWithOtherDiscount = true;
}
