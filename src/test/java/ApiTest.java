import com.github.wechat.sdk.api.WxApi;
import com.github.wechat.sdk.constant.WechatConst;
import com.github.wechat.sdk.entity.req.menu.Button;
import com.github.wechat.sdk.entity.resp.*;
import github.com.http.sdk.anno.Http;
import github.com.http.sdk.proxy.HttpProxy;
import github.com.http.sdk.utils.HttpClientApi;
import org.apache.http.HttpException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : hongqiangren.
 * @since: 2018/6/14 15:06
 */
public class ApiTest {


    public static void main(String[] args) throws HttpException {
        String appId = "";
        String secret = "";
        String grantType = "client_credential";
        HttpClientApi clientApi = new HttpClientApi();
        Map<String, String> parammap = new HashMap<>();
        parammap.put("appid", appId);
        parammap.put("secret", secret);
        parammap.put("grant_type", grantType);
        String result = clientApi.get("https://api.weixin.qq.com/cgi-bin/token", parammap);

        WxApi wxApi = HttpProxy.create().proxy(WxApi.class);

        TokenResp tokenResp = wxApi.loadToken(appId, secret, grantType);
        WechatConst.TEST_TOKEN = tokenResp.getAccessToken();
        wxApi.setIndustry(12L, 2, 39);
        AccountIndustry accountIndustry = wxApi.loadIndustry(12L);

        List<MessageTemplate> messageTemplates = wxApi.loadTemplates(12L);

        User user = wxApi.loadUser(12L, "ocm7W1f9S_b9VCOGYkRXBViTWanc", "zh-CN");

        Button firstLevel = Button.builder()
                .type("click")
                .name("今日歌曲")
                .key("V1001_TODAY_MUSIC")
                .build();


        List<Button> buttons = new ArrayList<>();
        buttons.add(firstLevel);

        wxApi.createWechatMenu(12L, buttons);

        String wechatMenu1 = wxApi.getWechatMenu(12l);


        System.out.println(accountIndustry);
        //System.out.println(tokenResp.getAccessToken());
    }


}
