package com.example.imitative_music.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.example.imitative_music.R;
import com.example.imitative_music.community.MyViewAdapter;
import com.example.imitative_music.podcast_fragment.recommend;
import com.example.imitative_music.podcast_fragment.story;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;
import java.util.List;

public class fragment_podcast extends Fragment {
    private TabLayout tabLayout;
    private ViewPager2 viewPager2;

    private List<Fragment> fragmentList = new ArrayList<>();
    private List<String> tablayoutList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.fragment_layout_community,container,false);
        initFragment();
        View view = inflater.inflate(R.layout.fragment_layout_community, container, false);
        viewPager2 = view.findViewById(R.id.community_viewpager);
        MyViewAdapter myAdapter = new MyViewAdapter(getChildFragmentManager(), getLifecycle(), fragmentList);
        viewPager2.setAdapter(myAdapter);

        tabLayout = view.findViewById(R.id.community_tabLayout);
        new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull com.google.android.material.tabs.TabLayout.Tab tab, int position) {
                tab.setText(tablayoutList.get(position));
            }
        }).attach();
        return view;
    }
    private void initFragment() {
        fragmentList.add(new recommend());
        fragmentList.add(new story());
        tablayoutList.add("推荐");
        tablayoutList.add("故事");
    }
}
