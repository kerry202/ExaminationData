package com.test.orange.http;

import android.app.Activity;
import android.os.Bundle;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;
import com.test.orange.base.OrangeApp;
import org.json.JSONObject;
import java.util.HashMap;
import okhttp3.Call;
import okhttp3.Response;

public class HttpUtils<T> {

    private static final String TAG = "HttpUtils";

    private static HttpUtils sUtils;

    private static final String LANG = "lang";//国际化 头部
    private static final String USERID = "userId";//用户ID 头部
    private static final String USERTOKEN = "accessToken";//用户token
    public Bundle bundle = new Bundle();

    private HttpUtils() {

    }

    public static synchronized HttpUtils getInstance() {
        if (sUtils == null)
            sUtils = new HttpUtils();
        return sUtils;
    }


    public void test(String url, HashMap<String, String> params, final Activity activity) {


        JSONObject jsonObject = new JSONObject(params);

        OkGo.post(url).tag(activity)    // 请求方式和请求url// 请求的 tag, 主要用于取消对应的请求
                .upJson(jsonObject)
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(String s, Call call, Response response) {

                    }

                    @Override
                    public void onError(Call call, Response response, Exception e) {

                    }
                });
    }
}
