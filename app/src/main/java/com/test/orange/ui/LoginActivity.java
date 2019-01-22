package com.test.orange.ui;

import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;
import com.test.orange.R;
import com.test.orange.base.BaseActivity;
import com.test.orange.config.MyInterface;
import com.test.orange.util.Logs;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

import java.util.HashMap;

import okhttp3.Call;
import okhttp3.Response;

public class LoginActivity extends BaseActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.login_layout;
    }

    @Override
    protected void initView() {

        HashMap<String, String> params = new HashMap<>();
        params.put("phone", "13261936996");
        JSONObject jsonObject = new JSONObject(params);

        OkGo.post(MyInterface.BaseUrl + MyInterface.SendCode).tag(this)
                .upJson(jsonObject)
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(String s, Call call, Response response) {
                        Logs.s("     注册接口1 onNext  " + s);
                    }

                    @Override
                    public void onError(Call call, Response response, Exception e) {
                        Logs.s("     注册接口1 onNext  " + e.getMessage());
                    }
                });

    }

    @Override
    protected void initData() {


    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread() {

    }

}
