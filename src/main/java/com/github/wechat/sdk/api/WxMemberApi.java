package com.github.wechat.sdk.api;

import com.github.wechat.sdk.constant.WechatConst;
import com.github.wechat.sdk.entity.resp.Member;
import com.github.wechat.sdk.entity.resp.User;
import com.github.wechat.sdk.filter.AccessFilter;
import github.com.http.sdk.anno.Http;
import github.com.http.sdk.anno.Key;
import github.com.http.sdk.anno.RootApi;
import github.com.http.sdk.anno.TempParam;

import javax.validation.constraints.NotBlank;

/**
 * @author : hongqiangren.
 * @since: 2018/6/14 18:00
 */
@RootApi(root = WechatConst.ROOT_URL, filter = {AccessFilter.class})
public interface WxMemberApi {

    /**
     * 拉取会员信息
     *
     * @param card_id
     * @param code
     * @return
     */
    @Http(path = "card/membercard/userinfo/get", method = Http.Method.POST, response = Http.Content.JSON)
    Member loadMember(@Key @TempParam Long brandId, @Key @NotBlank(message = "会员卡ID不能为空") String card_id, @NotBlank(message = "查询用户领取到的code值不能为空") String code);


    /**
     * 获取用户基本信息
     *
     * @param brandId
     * @param openid  普通用户的标识，对当前公众号唯一
     * @param lang    返回国家地区语言版本，zh_CN 简体，zh_TW 繁体，en 英语
     * @return
     */
    @Http(path = "cgi-bin/user/info", method = Http.Method.GET, response = Http.Content.JSON)
    User loadUser(@Key @TempParam Long brandId, @Key @NotBlank(message = "openID不能为空") String openid, String lang);
}
