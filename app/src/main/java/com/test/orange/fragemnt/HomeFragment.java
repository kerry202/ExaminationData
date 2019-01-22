package com.test.orange.fragemnt;


import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.test.orange.R;
import com.test.orange.adapters.HomePagerAdapter;
import com.test.orange.base.BaseFragment;
import com.test.orange.util.DialogUtils;
import java.util.ArrayList;

import butterknife.BindView;
import butterknife.OnClick;

public class HomeFragment extends BaseFragment {
    @BindView(R.id.home_sort)
    ImageView homeSort;
    @BindView(R.id.home_msg)
    ImageView homeMsg;
    @BindView(R.id.home_tab)
    TabLayout homeTab;
    @BindView(R.id.home_searsh)
    RelativeLayout homeSearsh;
    @BindView(R.id.home_pager)
    ViewPager homePager;

    private ArrayList<Fragment> fragments = new ArrayList<>();
    private ArrayList<String> titles = new ArrayList<>();

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_home_layout;
    }

    @Override
    protected void initView() {

        ExperienceFragment experienceFragment = new ExperienceFragment();
        ConsultationFragment consultationFragment = new ConsultationFragment();
        DataFragment dataFragment = new DataFragment();


        fragments.add(experienceFragment);
        titles.add("经验帖");
        titles.add("1v1咨询");
        titles.add("备考资料");
        fragments.add(consultationFragment);
        fragments.add(dataFragment);

        HomePagerAdapter homePagerAdapter = new HomePagerAdapter(getChildFragmentManager(), fragments, titles);

        homePager.setAdapter(homePagerAdapter);
        homeTab.setTabMode(TabLayout.MODE_FIXED);
        homeTab.setupWithViewPager(homePager);
        homeTab.setSelectedTabIndicatorColor(getResources().getColor(R.color.price_red));

    }


    @Override
    protected void initData() {

    }


    @OnClick({R.id.home_sort, R.id.home_msg, R.id.home_searsh})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.home_sort:
                DialogUtils.showDialog(getActivity(),homeSort);

                break;
            case R.id.home_msg:
                break;
            case R.id.home_searsh:
                break;
        }
    }
}
