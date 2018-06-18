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
public class MemberCardActiveForm implements IMemberCardActiveForm, Serializable {

    private static final long serialVersionUID = 5312942639689661887L;

    /**
     * 卡券ID
     */
    @Size(min = 1, max = 32, message = "卡券ID只支持1-32位")
    @NotBlank(message = "卡券ID不能为空")
    @JSONField(name = "card_id")
    private String cardId;

    /**
     * 会员卡激活时的必填选项
     */
    @JSONField(name = "required_form")
    private MemberCardActiveRequiredForm requiredForm = new MemberCardActiveRequiredForm();

    /**
     * 会员卡激活时的选填项
     */
    @JSONField(name = "optional_form")
    private MemberCardActiveOptionalForm optionalForm = new MemberCardActiveOptionalForm();

    /**
     * 服务声明，用于放置商户会员卡守则
     */
    @JSONField(name = "service_statement")
    private ServiceStatement serviceStatement;

    /**
     * 绑定老会员链接
     */
    @JSONField(name = "bind_old_card")
    private NameUrl bindOldCard;
}
