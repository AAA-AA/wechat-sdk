package com.github.wechat.sdk.entity.req.membercard;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

/**
 * @author coyzeng@gmail.com
 */
@Data
@NoArgsConstructor
public class CardAbstract implements Serializable {

    private static final long serialVersionUID = 2106922793865741621L;

    /**
     * 封面摘要简介
     */
    @Size(min = 0, max = 24, message = "封面摘要简介只支持0-24字")
    @JSONField(name = "abstract")
    private String cardAbstract;

    /**
     * 封面图片列表，仅支持填入一
     * 个封面图片链接，上传图片接口
     * 上传获取图片获得链接，填写
     * 非CDN链接会报错，并在此填入。
     * 建议图片尺寸像素850*350
     */
    @Size(min = 0, max = 1, message = "封面图片列表只支持0-1字")
    @JSONField(name = "icon_url_list")
    private List<String> iconUrlList;
}
