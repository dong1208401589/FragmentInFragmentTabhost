package com.dong.fragmentinfragmenttabhost.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dong.fragmentinfragmenttabhost.R;
import com.dong.fragmentinfragmenttabhost.base.BaseFragment;

/**
 * Created by Administrator on 2016/4/22.
 */
public class FirstFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, null);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        initView(view);
    }

    @Override
    public void initView(View view) {
        TextView textView = (TextView) view.findViewById(R.id.textview);
        textView.setText(R.string.first_page);
    }


    @Override
    public void initData() {

    }
}
