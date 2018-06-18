package com.github.wechat.sdk.api;

import com.github.wechat.sdk.constant.WechatConst;
import com.github.wechat.sdk.entity.req.auth.WeChatTokenQo;
import com.github.wechat.sdk.entity.resp.TokenResp;
import com.github.wechat.sdk.entity.resp.auth.WeChatTicket;
import com.github.wechat.sdk.entity.resp.auth.WeChatToken;
import com.github.wechat.sdk.filter.AccessFilter;
import github.com.http.sdk.anno.*;

import javax.validation.constraints.NotBlank;

/**
 * @author : hongqiangren.
 * @since: 2018/6/14 15:01
 */
@RootApi(root = WechatConst.ROOT_URL, filter = {AccessFilter.class})
public interface WxAuthApi {

    /**
     * 获取accessToken接口
     *
     * @param appId
     * @param secret
     * @param grantType
     */
    @Http(method = Http.Method.GET, path = "cgi-bin/token", request = Http.Content.JSON, response = Http.Content.JSON)
    TokenResp loadToken(@HttpParam(name = "appid") String appId, String secret, @HttpParam(name = "grant_type") String grantType);

    @Http(path = "cgi-bin/ticket/getticket", method = Http.Method.GET, response = Http.Content.JSON)
    WeChatTicket loadAccessTicket(@Key @TempParam Long brandId, @NotBlank(message = "票据类型不能为空") String type);

    @Key("code")
    @Http(path = "/card/code/decrypt", method = Http.Method.POST, response = Http.Content.JSON)
    String codeDecrypt(@Key @TempParam Long brandId, @NotBlank(message = "加密串不能为空") String encrypt_code);

    @Http(path = "/sns/oauth2/access_token", method = Http.Method.GET, response = Http.Content.JSON, body = -1)
    WeChatToken loadAccessToken(WeChatTokenQo tokenQo);


}
