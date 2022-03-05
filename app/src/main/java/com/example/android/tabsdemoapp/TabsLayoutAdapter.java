package com.example.android.tabsdemoapp;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class TabsLayoutAdapter extends FragmentStatePagerAdapter {
    private final List<Fragment> myFragmentList = new ArrayList<>();
    private final List<String> myFragmentTitleList = new ArrayList<>();

    public TabsLayoutAdapter(FragmentManager fm) {
        super(fm);
    }//end const.

    public void addFragment(Fragment fragment, String title){
        myFragmentList.add(fragment);
        myFragmentTitleList.add(title);
    }//end addFragment

    @Override
    public Fragment getItem(int position) {
        return myFragmentList.get(position);
    }//end getItem()

    @Override
    public int getCount() {
        return myFragmentList.size();
    }//end getCount()

    @Override
    public CharSequence getPageTitle(int position) {
        return myFragmentTitleList.get(position);
    }//end getPageTitle()

}//end class
