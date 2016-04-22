package com.dong.fragmentinfragmenttabhost.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dong.fragmentinfragmenttabhost.interf.BaseFragmentInterface;

/**
 * Created by Administrator on 2016/4/22.
 */
public class BaseFragment extends Fragment implements BaseFragmentInterface {

    protected LayoutInflater mInflater;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mInflater=inflater;
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void initView(View view) {

    }

    @Override
    public void initData() {

    }
}
