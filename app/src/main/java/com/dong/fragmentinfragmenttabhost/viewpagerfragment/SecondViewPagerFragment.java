package com.dong.fragmentinfragmenttabhost.viewpagerfragment;

import android.support.design.widget.TabLayout;

import com.dong.fragmentinfragmenttabhost.R;
import com.dong.fragmentinfragmenttabhost.adater.ViewPagerFragmentAdapter;
import com.dong.fragmentinfragmenttabhost.base.BaseViewPageFragment;
import com.dong.fragmentinfragmenttabhost.fragment.FirstFragment;
import com.dong.fragmentinfragmenttabhost.fragment.FourthFragment;
import com.dong.fragmentinfragmenttabhost.fragment.SecondFragment;
import com.dong.fragmentinfragmenttabhost.fragment.ThirdFragment;

/**
 * Created by Administrator on 2016/4/26.
 */
public class SecondViewPagerFragment extends BaseViewPageFragment{

    @Override
    public void onSetupTabAdater(ViewPagerFragmentAdapter adapter) {
        String[] titles = getResources().getStringArray(R.array.first_viewpage_arrays);
        adapter.addTab(titles[0],titles[0],FirstFragment.class,null);
        adapter.addTab(titles[1],titles[1],SecondFragment.class,null);
        adapter.addTab(titles[2],titles[2],ThirdFragment.class,null);
        adapter.addTab(titles[3],titles[3],FourthFragment.class,null);
        adapter.addTab(titles[0],titles[0],FirstFragment.class,null);
        adapter.addTab(titles[1],titles[1],SecondFragment.class,null);
        adapter.addTab(titles[2],titles[2],ThirdFragment.class,null);
        adapter.addTab(titles[3],titles[3],FourthFragment.class,null);
        adapter.addTab(titles[0],titles[0],FirstFragment.class,null);
        adapter.addTab(titles[1],titles[1],SecondFragment.class,null);
        adapter.addTab(titles[2],titles[2],ThirdFragment.class,null);
        adapter.addTab(titles[3],titles[3],FourthFragment.class,null);
    }

    @Override
    public void setScreenPageLimit() {
        mViewPager.setOffscreenPageLimit(3);
    }

    @Override
    public void setTabLayout(TabLayout tabLayout) {
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
    }
}
