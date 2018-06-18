package com.github.wechat.sdk.entity.req.membercard;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * @author coyzeng@gmail.com
 */
@Data
@NoArgsConstructor
public class NameUrl implements Serializable {

    private static final long serialVersionUID = 7722715802941596228L;

    /**
     * 链接名称
     */
    @Size(min = 1, max = 32, message = "链接名称只支持1-32位")
    private String name;
    /**
     * 自定义url
     * 请填写http://
     * 或者https://开头的链接
     */
    @Size(min = 1, max = 128, message = "会员声明URL只支持1-128位")
    private String url;
}
