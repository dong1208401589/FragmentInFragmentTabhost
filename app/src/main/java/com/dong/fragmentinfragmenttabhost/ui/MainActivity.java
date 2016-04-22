package com.dong.fragmentinfragmenttabhost.ui;

import android.graphics.drawable.Drawable;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TabHost;
import android.widget.TextView;

import com.dong.fragmentinfragmenttabhost.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    FragmentTabHost tabHost;
    private void initView(){
        tabHost= (FragmentTabHost) findViewById(android.R.id.tabhost);
        tabHost.setup(this,getSupportFragmentManager(),R.id.content);

        initTabs();
    }

    private void initTabs(){
        MainTab[] tabs = MainTab.values();
        final int size = tabs.length;
        for (int i=0;i<size ;i++){
            MainTab mainTab=tabs[i];
            TabHost.TabSpec tab=tabHost.newTabSpec(getString(mainTab.getResName()));
            View indication= LayoutInflater.from(this).inflate(R.layout.tab_indication,null);
            TextView textView= (TextView) indication.findViewById(R.id.tab_title);
            textView.setText(mainTab.getResName());
            Drawable drawable=ContextCompat.getDrawable(this,mainTab.getResIcon());
            textView.setCompoundDrawablesWithIntrinsicBounds(null, drawable,null,null);
            tab.setIndicator(indication);
//            tab.setContent(new TabHost.TabContentFactory() {
//                @Override
//                public View createTabContent(String tag) {
//                    return new View(MainActivity.this);
//                }
//            });
            tabHost.addTab(tab,mainTab.getClz(),null);
            tabHost.getTabWidget().setDividerDrawable(null);//去掉分割线
        }
    }
}
