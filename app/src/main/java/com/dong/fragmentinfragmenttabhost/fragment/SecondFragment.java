package com.dong.fragmentinfragmenttabhost.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dong.fragmentinfragmenttabhost.R;
import com.dong.fragmentinfragmenttabhost.base.BaseFragment;
import com.joanzapata.pdfview.PDFView;
import com.joanzapata.pdfview.listener.OnPageChangeListener;

/**
 * Created by Administrator on 2016/4/22.
 */
public class SecondFragment extends BaseFragment implements OnPageChangeListener {

    public static final String ABOUT_FILE = "about.pdf";

    PDFView pdfView;

    String pdfName = ABOUT_FILE;

    Integer pageNumber = 1;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, null);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        initView(view);
    }

    @Override
    public void initView(View view) {
        pdfView= (PDFView) view.findViewById(R.id.pdfview);
        display(pdfName, false);
    }

    private void display(String assetFileName, boolean jumpToFirstPage) {
        if (jumpToFirstPage) pageNumber = 1;
        pdfView.fromAsset(assetFileName)
                .defaultPage(pageNumber)
                .onPageChange(this)
                .load();
    }
    @Override
    public void initData() {

    }

    @Override
    public void onPageChanged(int page, int pageCount) {
        pageNumber = page;
    }
}
