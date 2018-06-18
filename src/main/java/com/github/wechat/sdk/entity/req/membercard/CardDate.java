package com.github.wechat.sdk.entity.req.membercard;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author coyzeng@gmail.com
 */
@Data
@NoArgsConstructor
public class CardDate implements Serializable {

    private static final long serialVersionUID = 7801926736642158456L;

    /**
     * DATE_TYPE_FIX_TIME_RANGE|
     */
    @NotBlank(message = "使用日期类型不能为空")
    private CardDateType type = CardDateType.DATE_TYPE_PERMANENT;

    /**
     * 1397577600|ype为DATE_TYPE_FIX_TIME_RANGE时专用，
     * 表示起用时间。从1970年1月1日00:00:00至起用时间的秒数
     * （东八区时间,UTC+8，单位为秒）
     */
    @JSONField(name = "begin_timestamp")
    private Long beginTimestamp;

    /**
     * 1472724261|ype为DATE_TYPE_FIX_TIME_RANGE时专用，
     * 表示起用时间。从1970年1月1日00:00:00至起用时间的秒数
     * （东八区时间,UTC+8，单位为秒）
     */
    @JSONField(name = "end_timestamp")
    private Long endTimestamp;
}
