package com.youyicheng.KaoLiao.base;

import android.content.Context;
import android.support.multidex.MultiDexApplication;

import org.greenrobot.eventbus.EventBus;

public class OrangeApp extends MultiDexApplication {


    public static EventBus mEventBus = EventBus.getDefault();

    public static Context mContext ;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext=this;

    }
}
