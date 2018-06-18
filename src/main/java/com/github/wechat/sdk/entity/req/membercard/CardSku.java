package com.github.wechat.sdk.entity.req.membercard;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author coyzeng@gmail.com
 */
@Data
@NoArgsConstructor
public class CardSku implements Serializable {

    private static final long serialVersionUID = -1256299732142224592L;
    
    /**
     * 500000000
     */
    @NotNull(message = "卡发行量不能为空")
    @Min(value = 1, message = "卡发行量只支持1-500000000")
    @Max(value = 500000000, message = "卡发行量只支持1-500000000")
    private Long quantity;
}
