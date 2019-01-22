package com.test.orange.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.test.orange.util.MyEvents;

import org.greenrobot.eventbus.EventBus;

import butterknife.ButterKnife;
import butterknife.Unbinder;


public abstract class BaseFragment extends Fragment implements View.OnClickListener {

    public EventBus eventBus = OrangeApp.mEventBus;
    public MyEvents myEvents = new MyEvents();
    protected Unbinder unbinder;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view =View.inflate(getActivity(),getLayoutId(),null);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        unbinder = ButterKnife.bind(this, view);
//        eventBus.register(this);
        initView();
        initData();
    }



    @Override
    public void onClick(View v) {

    }



    @Override
    public void onDestroy() {
        super.onDestroy();
        eventBus.unregister(this);
    }

    protected abstract int getLayoutId();

    protected abstract void initView();

    protected abstract void initData();


}
