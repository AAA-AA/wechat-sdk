package com.github.wechat.sdk.api;

import com.github.wechat.sdk.entity.req.TemplateMessage;
import com.github.wechat.sdk.entity.resp.AccountIndustry;
import com.github.wechat.sdk.entity.resp.MessageTemplate;
import com.github.wechat.sdk.filter.AccessFilter;
import github.com.http.sdk.anno.Http;
import github.com.http.sdk.anno.Key;
import github.com.http.sdk.anno.RootApi;
import github.com.http.sdk.anno.TempParam;


import java.util.List;

import static com.github.wechat.sdk.constant.WechatConst.ROOT_URL;

/**
 * @author : hongqiangren.
 * @since: 2018/6/14 18:01
 */
@RootApi(root = ROOT_URL,filter = AccessFilter.class)
public interface WxTemplateMessageApi {

    /**
     * 查询账号所属行业
     *
     * @return
     */
    @Http(path = "cgi-bin/template/get_industry", method = Http.Method.GET, request = Http.Content.FORM, response = Http.Content.JSON)
    AccountIndustry loadIndustry(@Key @TempParam Long brandId);


    /**
     * 设置所属行业(每月可修改行业1次)
     *
     * @param industry_id1 公众号模板消息所属行业编号
     * @param industry_id2 公众号模板消息所属行业编号
     * @return
     */
    @Http(path = "cgi-bin/template/api_set_industry", method = Http.Method.POST, request = Http.Content.JSON, response = Http.Content.JSON)
    void setIndustry(@Key @TempParam Long brandId, int industry_id1, int industry_id2);


    /**
     * 消息模板编号获取消息模板ID
     *
     * @param template_id_short
     * @return 模板ID
     */
    @Key("template_id")
    @Http(path = "cgi-bin/template/api_add_template", method = Http.Method.POST, request = Http.Content.JSON, response = Http.Content.JSON)
    String loadTemplateId(@Key @TempParam Long brandId, String template_id_short);

    /**
     * 查询账号所有消息模板
     *
     * @return 模板列表
     */
    @Key("template_list")
    @Http(path = "cgi-bin/template/get_all_private_template", method = Http.Method.GET, request = Http.Content.FORM, response = Http.Content.JSON)
    List<MessageTemplate> loadTemplates(@Key @TempParam Long brandId);

    /**
     * 发送模板消息
     *
     * @param message
     * @return 消息ID
     */
    @Key("msgid")
    @Http(path = "cgi-bin/template/del_private_template", method = Http.Method.POST, request = Http.Content.JSON, response = Http.Content.JSON, body = Http.MERGE)
    String sendTemplateMessage(@Key @TempParam Long brandId, TemplateMessage message);

    /**
     * 发送模板消息
     *
     * @param message
     * @return 消息ID
     */
    @Key("msgid")
    @Http(path = "cgi-bin/message/template/send", method = Http.Method.POST, request = Http.Content.JSON, response = Http.Content.JSON, body = Http.MERGE)
    String delTemplate(@Key @TempParam Long brandId, TemplateMessage message);

}
