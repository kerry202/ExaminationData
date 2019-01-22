package com.test.orange.fragemnt;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.test.orange.R;
import com.test.orange.adapters.EvaluateAdapter;
import com.test.orange.base.BaseFragment;

import java.util.ArrayList;

import butterknife.BindView;

public class DetailsEvaluateFragment extends BaseFragment {
    @BindView(R.id.evaluate_recycler)
    RecyclerView evaluateRecycler;

    @Override
    protected int getLayoutId() {
        return R.layout.details_evaluate_layout;
    }

    @Override
    protected void initView() {

        evaluateRecycler.setLayoutManager(new LinearLayoutManager(getActivity()));

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            list.add("");
        }
        EvaluateAdapter evaluateAdapter = new EvaluateAdapter(list);

        evaluateRecycler.setAdapter(evaluateAdapter);

    }

    @Override
    protected void initData() {

    }

}
