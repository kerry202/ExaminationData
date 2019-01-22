package com.test.orange.fragemnt;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.test.orange.R;
import com.test.orange.adapters.ConsultationAdapter;
import com.test.orange.base.BaseFragment;

import java.util.ArrayList;

import butterknife.BindView;

public class DataFragment extends BaseFragment {
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

    }
}
