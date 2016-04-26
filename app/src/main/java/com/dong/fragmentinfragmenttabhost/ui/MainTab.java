package com.dong.fragmentinfragmenttabhost.ui;

import com.dong.fragmentinfragmenttabhost.R;
import com.dong.fragmentinfragmenttabhost.viewpagerfragment.FirstViewPagerFragment;
import com.dong.fragmentinfragmenttabhost.fragment.FourthFragment;
import com.dong.fragmentinfragmenttabhost.fragment.SecondFragment;
import com.dong.fragmentinfragmenttabhost.fragment.ThirdFragment;
import com.dong.fragmentinfragmenttabhost.viewpagerfragment.SecondViewPagerFragment;

/**
 * Created by Administrator on 2016/4/22.
 */
public enum MainTab {

    FIRST(0, R.string.first,R.drawable.tab_icon, FirstViewPagerFragment.class),
    SECOND(1,R.string.second, R.drawable.tab_icon, SecondViewPagerFragment.class),
    THIRD(2,R.string.third, R.drawable.tab_icon, ThirdFragment.class),
    FOURTH(3,R.string.fourth,R.drawable.tab_icon,FourthFragment.class);

    private int index,resName,resIcon;
    Class<?> clz;
    private MainTab(int index,int resName,int resIcon,Class<?> clz){
        this.index=index;
        this.resName=resName;
        this.resIcon=resIcon;
        this.clz=clz;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getResName() {
        return resName;
    }

    public void setResName(int resName) {
        this.resName = resName;
    }

    public int getResIcon() {
        return resIcon;
    }

    public void setResIcon(int resIcon) {
        this.resIcon = resIcon;
    }

    public Class<?> getClz() {
        return clz;
    }

    public void setClz(Class<?> clz) {
        this.clz = clz;
    }
}
