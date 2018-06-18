package com.github.wechat.sdk.entity.req.membercard;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * @author coyzeng@gmail.com
 */
@Data
@NoArgsConstructor
public class CardCustomCell implements Serializable {

    private static final long serialVersionUID = -7635146337688252711L;

    /**
     * 入口名称
     */
    @Size(min = 1, max = 15, message = "入口名称只支持1-128字")
    @NotBlank(message = "入口名称不能为空")
    private String name;

    /**
     * 入口右侧提示语，6个汉字内
     */
    @NotBlank(message = "入口右侧提示语不能为空")
    @Size(min = 1, max = 6, message = "入口名称只支持1-6字")
    private String tips;

    /**
     * 入口跳转链接
     */
    @Size(min = 1, max = 128, message = "入口跳转链接只支持1-128字")
    @NotBlank(message = "入口跳转链接不能为空")
    private String url;
}
