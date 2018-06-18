package com.github.wechat.sdk.api;

import com.github.wechat.sdk.entity.req.menu.Button;
import com.github.wechat.sdk.entity.resp.BaseResp;
import com.github.wechat.sdk.filter.AccessFilter;
import github.com.http.sdk.anno.*;

import java.util.List;

import static com.github.wechat.sdk.constant.WechatConst.ROOT_URL;

/**
 * @author : hongqiangren.
 * @since: 2018/6/14 18:15
 */
@RootApi(root = ROOT_URL, filter = AccessFilter.class)
public interface WxMenuApi {

    /**
     * 创建菜单
     *
     * @param buttonList
     * @return
     */
    @Http(path = "cgi-bin/menu/create", method = Http.Method.POST, response = Http.Content.JSON)
    BaseResp createWechatMenu(@Key @TempParam Long brandId,@HttpParam(name = "button") List<Button> buttonList);

    /**
     * 自定义菜单查询接口
     *
     * @param brandId
     * @return
     */
    @Http(path = "cgi-bin/menu/get", method = Http.Method.GET, response = Http.Content.JSON)
    String getWechatMenu(@Key @TempParam Long brandId);

    /**
     * 自定义菜单查询接口
     *
     * @param brandId
     * @return
     */
    @Http(path = "cgi-bin/menu/delete", method = Http.Method.GET, response = Http.Content.JSON)
    BaseResp deleteWechatMenu(@Key @TempParam Long brandId);
}


