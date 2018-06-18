package com.github.wechat.sdk.api;

import com.github.wechat.sdk.filter.AccessFilter;
import github.com.http.sdk.anno.RootApi;

import static com.github.wechat.sdk.constant.WechatConst.ROOT_URL;

/**
 * @author : hongqiangren.
 * @since: 2018/6/14 18:15
 */
@RootApi(root = ROOT_URL,filter = AccessFilter.class)
public interface WxApi extends WxMemberApi,WxAuthApi,WxTemplateMessageApi,WxMenuApi,WxCtmMessageApi {
}
