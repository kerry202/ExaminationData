package com.test.orange.fragemnt;

import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.test.orange.R;
import com.test.orange.adapters.DetailsAdapter;
import com.test.orange.adapters.DetailsPagerAdapter;
import com.test.orange.base.BaseFragment;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.OnClick;

/**
 *
 * */
public class DetailsConsultationFragment extends BaseFragment {
    @BindView(R.id.details_banner_pager)
    ViewPager detailsBannerPager;
    @BindView(R.id.details_banner_index)
    TextView detailsBannerIndex;
    @BindView(R.id.details_user_icon)
    ImageView detailsUserIcon;
    @BindView(R.id.details_add_follow)
    Button detailsAddFollow;
    @BindView(R.id.details_user_name)
    TextView detailsUserName;
    @BindView(R.id.details_experience_value)
    TextView detailsExperienceValue;
    @BindView(R.id.details_consultation_tv)
    TextView detailsConsultationTv;
    @BindView(R.id.details_data_tv)
    TextView detailsDataTv;
    @BindView(R.id.details_recycler)
    RecyclerView detailsRecycler;

    @Override
    protected int getLayoutId() {
        return R.layout.details_consultation_layout;
    }

    @Override
    protected void initView() {


        DetailsPagerAdapter detailsPagerAdapter =new DetailsPagerAdapter();

        detailsBannerPager.setAdapter(detailsPagerAdapter);

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add("");
        }

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false) {
            @Override
            public boolean canScrollVertically() {
                return false;
            }
        };
        detailsRecycler.setLayoutManager(linearLayoutManager);
        DetailsAdapter detailsAdapter = new DetailsAdapter(list);
        detailsRecycler.setAdapter(detailsAdapter);

    }

    @Override
    protected void initData() {

    }


    @OnClick(R.id.details_add_follow)
    public void onViewClicked() {
    }
}
