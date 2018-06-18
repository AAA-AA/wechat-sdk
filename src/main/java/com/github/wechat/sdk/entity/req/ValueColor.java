package com.github.wechat.sdk.entity.req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * @author : hongqiangren.
 * @since: 2018/6/14 19:48
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ValueColor {

    /**
     * 模板内容值
     */
    @NotBlank(message = "模板值不能为空")
    private String value;

    /**
     * #173177|模板内容字体颜色，不填默认为黑色
     */
    private String color = "#173177";

}
