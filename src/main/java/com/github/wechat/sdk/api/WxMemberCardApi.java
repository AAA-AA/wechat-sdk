package com.github.wechat.sdk.api;

import com.github.wechat.sdk.constant.WechatConst;
import com.github.wechat.sdk.entity.req.membercard.Card;
import com.github.wechat.sdk.entity.req.membercard.CouponQrCodeQo;
import com.github.wechat.sdk.entity.req.membercard.IMemberCardActiveForm;
import com.github.wechat.sdk.entity.req.membercard.MemberCardActive;
import com.github.wechat.sdk.entity.resp.membercard.MemberCardActiveFormData;
import com.github.wechat.sdk.entity.resp.membercard.QrCodeTicket;
import com.github.wechat.sdk.filter.AccessFilter;
import github.com.http.sdk.anno.*;

import javax.validation.constraints.NotBlank;
import java.util.List;

/**
 * @author : hongqiangren.
 * @since: 2018/6/14 18:00
 */
@RootApi(root = WechatConst.ROOT_URL, filter = {AccessFilter.class})
public interface WxMemberCardApi {

    @Http(path = "card/testwhitelist/set", method = Http.Method.POST, response = Http.Content.JSON)
    void whitelist(@Key @TempParam Long brandId, @HttpParam(name = "openid") List<String> openid, @HttpParam(name = "username") List<String> username);

    @Key("card_id")
    @Http(path = "card/create", method = Http.Method.POST, request = Http.Content.JSON, response = Http.Content.JSON)
    String createMemberCard(@Key @TempParam Long brandId, @HttpParam(name = "card") Card card);

    @Http(path = "card/membercard/activate", method = Http.Method.POST, request = Http.Content.JSON, response = Http.Content.JSON, body = -1)
    void activeMemberCard(@Key @TempParam Long brandId, MemberCardActive memberCardActive);

    @Http(path = "card/membercard/activateuserform/set", method = Http.Method.POST, request = Http.Content.JSON, response = Http.Content.JSON, body = -1)
    void customActiveForm(@Key @TempParam Long brandId, IMemberCardActiveForm memberCardActiveForm);

    @Key("info")
    @Http(path = "card/membercard/activatetempinfo/get", method = Http.Method.POST, response = Http.Content.JSON)
    MemberCardActiveFormData loadActiveFormData(@Key @TempParam Long brandId, @Key @NotBlank(message = "激活凭证不能为空") String activate_ticket);

    @Http(path = "card/qrcode/create", method = Http.Method.POST, request = Http.Content.JSON, response = Http.Content.JSON, body = -1)
    QrCodeTicket genCardQrCode(@Key @TempParam Long brandId, CouponQrCodeQo qrCodeQo);
}
