package com.github.wechat.sdk.entity.req.membercard;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 * @author coyzeng@gmail.com
 */
@Data
@NoArgsConstructor
public class MemberCardActiveOptionalForm implements Serializable {

    private static final long serialVersionUID = -4461643614181492365L;

    /**
     * 当前结构（required_form或者optional_form ）内
     * 的字段是否允许用户激活后再次修改，商户设置为true
     * 时，需要接收相应事件通知处理修改事件
     */
    @JSONField(name = "can_modify")
    private Boolean canModify = false;

    /**
     * 微信格式化的选项类型
     */
    @JSONField(name = "common_field_id_list")
    private List<FormInput> commonFieldIdList =
            Arrays.asList(
                    FormInput.USER_FORM_INFO_FLAG_SEX,
                    FormInput.USER_FORM_INFO_FLAG_BIRTHDAY,
                    FormInput.USER_FORM_INFO_FLAG_LOCATION);

    /**
     * 自定义选项名称，开发者可
     * 以分别在必填和选填中至多定义五个自定义选项
     */
    @JSONField(name = "custom_field_list ")
    private JSONObject customFieldList;

    /**
     * 自定义富文本类型，包含以下三个字段，开发者可
     * 以分别在必填和选填中至多定义五个自定义选项
     * <pre>
     * {
     *   "type": "FORM_FIELD_RADIO",  富文本类型
     *                                 FORM_FIELD_RADIO   自定义单选
     *                                 FORM_FIELD_SELECT   自定义选择项
     *                                 FORM_FIELD_CHECK_BOX 自定义多选
     *   "name": "兴趣",               字段名
     *   "values": [                  选择项
     *   "钢琴",
     *   "舞蹈",
     *   "足球"
     *   ]
     * },
     * </pre>
     */
    @JSONField(name = "rich_field_list")
    private JSONObject richFieldList;
}
