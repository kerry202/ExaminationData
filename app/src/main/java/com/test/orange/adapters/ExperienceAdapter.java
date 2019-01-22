package com.test.orange.adapters;

import android.support.annotation.Nullable;

import com.recycler.baseholder.BaseQuickAdapter;
import com.recycler.baseholder.BaseViewHolder;
import com.test.orange.R;

import java.util.List;

public class ExperienceAdapter extends BaseQuickAdapter<String,BaseViewHolder> {

    public ExperienceAdapter(@Nullable List<String> data) {
        super(R.layout.experience_adapter_layout, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {

    }

}
