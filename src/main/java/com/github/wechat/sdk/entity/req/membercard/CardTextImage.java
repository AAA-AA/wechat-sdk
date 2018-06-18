package com.github.wechat.sdk.entity.req.membercard;

import com.alibaba.fastjson.annotation.JSONField;
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
public class CardTextImage implements Serializable {

    private static final long serialVersionUID = 8734869754260901659L;

    /**
     * 图片链接
     */
    @Size(min = 1, max = 128, message = "图片链接只支持1-128字")
    @NotBlank(message = "图片地址不能为空")
    @JSONField(name = "image_url")
    private String imageUrl;

    /**
     * 图文描述
     */
    @Size(min = 1, max = 512, message = "图文描述只支持1-512字")
    @NotBlank(message = "图文描述不能为空")
    private String text;
}
