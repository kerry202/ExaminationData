package com.test.orange.fragemnt;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.test.orange.R;
import com.test.orange.adapters.ExperienceAdapter;
import com.test.orange.base.BaseFragment;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class ExperienceFragment extends BaseFragment {
    @BindView(R.id.experience_recycler)
    RecyclerView experienceRecycler;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_experience_layout;
    }

    @Override
    protected void initView() {
        experienceRecycler.setLayoutManager(new LinearLayoutManager(getActivity()));

        ArrayList<String> arrayList =new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            arrayList.add("");
        }
        ExperienceAdapter experienceAdapter =new ExperienceAdapter(arrayList);

        experienceRecycler.setAdapter(experienceAdapter);


    }

    @Override
    protected void initData() {

    }


}
