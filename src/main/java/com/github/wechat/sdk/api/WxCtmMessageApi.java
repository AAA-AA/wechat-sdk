package com.github.wechat.sdk.api;

import com.github.wechat.sdk.entity.req.ctmmsg.CtmAccountQo;
import com.github.wechat.sdk.entity.resp.BaseResp;
import com.github.wechat.sdk.entity.resp.ctmmsg.CtmAccountInfo;
import com.github.wechat.sdk.entity.resp.ctmmsg.CtmMessage;
import com.github.wechat.sdk.filter.AccessFilter;
import github.com.http.sdk.anno.Http;
import github.com.http.sdk.anno.Key;
import github.com.http.sdk.anno.RootApi;
import github.com.http.sdk.anno.TempParam;

import java.util.List;

import static com.github.wechat.sdk.constant.WechatConst.ROOT_URL;

/**
 *
 * 客服消息接口
 * @author : hongqiangren.
 * @since: 2018/6/14 18:01
 */
@RootApi(root = ROOT_URL,filter = AccessFilter.class)
public interface WxCtmMessageApi {

    /**
     * 添加客服帐号
     * 每个公众号最多添加10个客服账号
     * @return
     */
    @Http(path = "customservice/kfaccount/add", method = Http.Method.POST, request = Http.Content.FORM, response = Http.Content.JSON)
    BaseResp createCustomerAccount(@Key @TempParam Long brandId,CtmAccountQo accountQo);


    /**
     * 修改客服帐号
     * @param accountQo
     * @return
     */
    @Http(path = "customservice/kfaccount/update", method = Http.Method.POST, request = Http.Content.JSON, response = Http.Content.JSON)
    BaseResp updateCustomerAccount(@Key @TempParam Long brandId, CtmAccountQo accountQo);


    /**
     * 获取所有客服账号
     * |获取公众号中所设置的客服基本信息，包括客服工号、客服昵称、客服登录账号
     * @param accountQo
     * @return 模板ID
     */
    @Http(path = "customservice/kfaccount/del", method = Http.Method.POST, request = Http.Content.JSON, response = Http.Content.JSON)
    BaseResp delCustomerAccount(@Key @TempParam Long brandId,CtmAccountQo accountQo);

    /**
     * 查询账号所有消息模板
     *
     * @return 模板列表
     */
    @Key("kf_list")
    @Http(path = "customservice/getkflist", method = Http.Method.GET, request = Http.Content.FORM, response = Http.Content.JSON)
    List<CtmAccountInfo> loadAllCustomerAccount(@Key @TempParam Long brandId);

    /**
     * 客服接口-发消息
     * @see
     * @param message
     * @return 消息ID
     */
    @Key("msgid")
    @Http(path = "cgi-bin/message/custom/send", method = Http.Method.POST, request = Http.Content.JSON, response = Http.Content.JSON, body = Http.MERGE)
    BaseResp delTemplate(@Key @TempParam Long brandId, CtmMessage message);

}
