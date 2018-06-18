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
public class CardTimeLimit implements Serializable {

    private static final long serialVersionUID = -8236714763075779874L;

    /**
     * 限制类型枚举值：支持填入
     * MONDAY 周一
     * TUESDAY 周二
     * WEDNESDAY 周三
     * THURSDAY 周四
     * FRIDAY 周五
     * SATURDAY 周六
     * SUNDAY 周日
     * 此处只控制显示，
     * 不控制实际使用逻辑，不填默认不显示
     */
    @JSONField(name = "type")
    private CardTimeType cardTimeType;

    /**
     * 当前type类型下的起始时间（小时）
     * ，如当前结构体内填写了MONDAY，
     * 此处填写了10，则此处表示周一 10:00可用
     */
    @JSONField(name = "begin_hour")
    private Integer beginHour;

    /**
     * 当前type类型下的起始时间（分钟）
     * ，如当前结构体内填写了MONDAY，
     * begin_hour填写10，此处填写了59，
     * 则此处表示周一 10:59可用
     */
    @JSONField(name = "begin_minute")
    private Integer beginMinute;

    /**
     * 当前type类型下的结束时间（小时）
     * ，如当前结构体内填写了MONDAY，
     * 此处填写了20，则此处表示周一 10:00-20:00可用
     */
    @JSONField(name = "end_hour")
    private Integer endHour;

    /**
     * 当前type类型下的结束时间（分钟）
     * ，如当前结构体内填写了MONDAY，
     * begin_hour填写10，此处填写了59，
     * 则此处表示周一 10:59-00:59可用
     */
    @JSONField(name = "end_minute")
    private Integer endMinute;
}
