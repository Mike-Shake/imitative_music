package com.example.imitative_music.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.example.imitative_music.R;
import com.example.imitative_music.community.MyViewAdapter;
import com.example.imitative_music.mine.chuangjiangedan;
import com.example.imitative_music.mine.gedanzhushou;
import com.example.imitative_music.mine.shoucanggedan;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;
import java.util.List;

public class fragment_mine extends Fragment {

    private TabLayout tabLayout;
    private ViewPager2 viewPager2;

    private List<Fragment> fragmentList = new ArrayList<>();
    private List<String> tablayoutList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        initFragment();
        View view = inflater.inflate(R.layout.fragment_layout_mine, container, false);

        viewPager2 = view.findViewById(R.id.viewpager2);
        tabLayout = view.findViewById(R.id.tabLayout);
        MyViewAdapter myViewAdapter = new MyViewAdapter(getChildFragmentManager(), getLifecycle(), fragmentList);
        viewPager2.setAdapter(myViewAdapter);
        new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                tab.setText(tablayoutList.get(position));
            }
        }).attach();
        return view;
    }

    private void initFragment() {
        fragmentList.add(new chuangjiangedan());
        fragmentList.add(new shoucanggedan());
        fragmentList.add(new gedanzhushou());
        tablayoutList.add("创建歌单");
        tablayoutList.add("收藏歌单");
        tablayoutList.add("歌单助手");
    }
}
