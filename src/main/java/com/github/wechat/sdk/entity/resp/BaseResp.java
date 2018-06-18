package com.github.wechat.sdk.entity.resp;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @author : hongqiangren.
 * @since: 2018/6/14 15:10
 */
@Data
public class BaseResp {

    @JSONField(name = "errcode")
    private Integer errCode;
    @JSONField(name = "errmsg")
    private String errMsg;
}
