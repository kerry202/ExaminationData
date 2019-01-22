package com.test.orange.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.test.orange.R;
import com.test.orange.adapters.HomePagerAdapter;
import com.test.orange.base.BaseActivity;
import com.test.orange.fragemnt.DetailsConsultationFragment;
import com.test.orange.fragemnt.DetailsEvaluateFragment;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.OnClick;

public class DetailsActivity extends BaseActivity {

    @BindView(R.id.details_back)
    RelativeLayout detailsBack;
    @BindView(R.id.details_tab)
    TabLayout detailsTab;
    @BindView(R.id.details_head_rl)
    RelativeLayout detailsHeadRl;
    @BindView(R.id.details_shared_tv)
    TextView detailsSharedTv;
    @BindView(R.id.details_colletion_tv)
    TextView detailsColletionTv;
    @BindView(R.id.details_msg_tv)
    TextView detailsMsgTv;
    @BindView(R.id.details_buttom_rl)
    RelativeLayout detailsButtomRl;
    @BindView(R.id.details_viewpager)
    ViewPager detailsPager;
    @BindView(R.id.go_buy)
    Button goBuy;

    private ArrayList<Fragment> fragments = new ArrayList<>();
    private ArrayList<String> titles = new ArrayList<>();


    @Override
    protected int getLayoutId() {
        return R.layout.details_layout;
    }

    @Override
    protected void initView() {

        fragments.add(new DetailsConsultationFragment());
        fragments.add(new DetailsEvaluateFragment());
        titles.add("1v1咨询");
        titles.add("评价");

        HomePagerAdapter homePagerAdapter = new HomePagerAdapter(getSupportFragmentManager(), fragments, titles);

        detailsPager.setAdapter(homePagerAdapter);
        detailsTab.setTabMode(TabLayout.MODE_FIXED);
        detailsTab.setupWithViewPager(detailsPager);
        detailsTab.setSelectedTabIndicatorColor(getResources().getColor(R.color.price_red));


    }

    @Override
    protected void initData() {

    }


    @OnClick({R.id.details_back, R.id.details_shared_tv, R.id.go_buy, R.id.details_colletion_tv, R.id.details_msg_tv})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.details_back:
                break;
            case R.id.details_shared_tv:
                break;
            case R.id.details_colletion_tv:
                break;
            case R.id.details_msg_tv:
                break;
            case R.id.go_buy:
                startActivity(new Intent(this, OkBuyActivity.class));
                break;
        }
    }

}
