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
public class CardAdvancedInfo implements Serializable {

    private static final long serialVersionUID = 2027479867612404917L;

    /**
     * 使用门槛（条件）字段，若不填写使用条件则在券面拼写
     * ：无最低消费限制，全场通用，不限品类；并在使用说明显示：
     * 可与其他优惠共享
     */
    @JSONField(name = "use_condition")
    private CardUseCondition cardUseCondition;

    /**
     * 封面摘要结构体名称
     */
    @JSONField(name = "abstract")
    private CardAbstract cardAbstract;

    /**
     * 图文列表，显示在详情内页
     * ，优惠券券开发者须至少传入
     * 一组图文列表
     */
    @JSONField(name = "text_image_list")
    @Size(min = 1, max = 3, message = "自定义跳转的URL只支持1-3字")
    private List<CardTextImage> textImageList;

    /**
     * 使用时段限制
     */
    @JSONField(name = "time_limit")
    private List<CardTimeLimit> cardTimeLimits;

    /**
     * 商家服务类型：可多选
     */
    @JSONField(name = "business_service")
    private List<CardBizServiceType> cardBizServiceTypes;
}
