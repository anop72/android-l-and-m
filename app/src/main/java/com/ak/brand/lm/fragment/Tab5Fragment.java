package com.ak.brand.lm.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ak.brand.lm.R;
import com.ak.brand.lm.pager.ViewPagerAdapter;

public class Tab5Fragment extends Fragment {

    private int mArray[] = { R.drawable.img5, R.drawable.img6,
            R.drawable.img7};

    public Tab5Fragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tab5, container, false);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getActivity(), mArray);
        ViewPager myPager = (ViewPager) rootView.findViewById(R.id.viewPager);
        myPager.setAdapter(adapter);
        myPager.setCurrentItem(0);
        return rootView;
    }

}
