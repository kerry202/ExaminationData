package com.test.orange.fragemnt;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.recycler.baseholder.BaseQuickAdapter;
import com.test.orange.R;
import com.test.orange.adapters.ConsultationAdapter;
import com.test.orange.base.BaseFragment;
import com.test.orange.ui.DetailsActivity;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class ConsultationFragment extends BaseFragment {
    @BindView(R.id.experience_recycler)
    RecyclerView experienceRecycler;
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_experience_layout;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {



        experienceRecycler.setLayoutManager(new GridLayoutManager(getActivity(),2));

        ArrayList<String> arrayList =new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            arrayList.add("");
        }

        ConsultationAdapter consultationAdapter =new ConsultationAdapter(arrayList);
        experienceRecycler.setAdapter(consultationAdapter);

        consultationAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {

                startActivity(new Intent(getActivity(),DetailsActivity.class));
            }
        });

    }

}
