package com.ekumfi.agent.pagerAdapter;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.ekumfi.agent.fragment.SellerOrderFragment;

import java.util.ArrayList;

public class SellerOrdersPagerAdapter extends FragmentPagerAdapter {
    ArrayList<String> statuses;

    public SellerOrdersPagerAdapter(FragmentManager fm, ArrayList<String> statuses) {
        super(fm);
        this.statuses = statuses;
    }

    @Override
    public Fragment getItem(int position) {
        SellerOrderFragment orderFragment = new SellerOrderFragment();
        Bundle bundle = new Bundle(3);
        bundle.putString("status", getPageTitle(position).toString());
        orderFragment.setArguments(bundle);

        return orderFragment;
    }

    @Override
    public int getCount() {
        return statuses.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return statuses.get(position);
    }
}