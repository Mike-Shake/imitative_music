package com.example.imitative_music.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.imitative_music.MainActivity;
import com.example.imitative_music.find_LoopView.ImageAdapter;
import com.example.imitative_music.find_LoopView.ImageBean;
import com.example.imitative_music.find_horizontal_recycleview.find_below_recycleView_class;
import com.example.imitative_music.find_horizontal_recycleview.find_below_recycleview_adapter;
import com.example.imitative_music.R;
import com.youth.banner.Banner;
import com.youth.banner.indicator.CircleIndicator;


import java.util.ArrayList;
import java.util.List;

public class fragment_find extends Fragment {
    //轮播图的使用
    private Banner mBanner;
    private List<ImageBean> image_List = new ArrayList<>();

    //轮播图下方是横向recyclerview的实现
    RecyclerView recyclerView;
    find_below_recycleview_adapter adapter;
    private List<find_below_recycleView_class> mlist;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_layout_find, container, false);

        //轮播图链表的添加
        image_List = new ArrayList<>();
        initData();
        //轮播图的适配
        mBanner =  view.findViewById(R.id.find_banner);
        mBanner.setAdapter(new ImageAdapter(getActivity(), image_List));
        // Set Banner is auto to loop.
        mBanner.isAutoLoop(true);
        // Set an indicator for Banner.
        mBanner.setIndicator(new CircleIndicator(getActivity()));
        mBanner.start();



        //轮播图下方是横向recyclerview的实现
        mlist = new ArrayList<>();
        init();
        recyclerView = view.findViewById(R.id.find_below_recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        adapter = new find_below_recycleview_adapter(mlist);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setAdapter(adapter);
        return view;
//        return inflater.inflate(R.layout.fragment_layout_find, container, false);
    }

    public void init(){
        find_below_recycleView_class find_below_recycleViews=new find_below_recycleView_class("每日推荐",R.mipmap.radio_widget_icn_new);
        mlist.add(find_below_recycleViews);
        find_below_recycleView_class find_below_recycleViews1=new find_below_recycleView_class("私人FM",R.mipmap.radio_widget_icn_new);
        mlist.add(find_below_recycleViews1);
        find_below_recycleViews=new find_below_recycleView_class("歌单",R.mipmap.radio_widget_icn_new);
        mlist.add(find_below_recycleViews);
        find_below_recycleViews=new find_below_recycleView_class("排行榜",R.mipmap.radio_widget_icn_new);
        mlist.add(find_below_recycleViews);
        find_below_recycleViews=new find_below_recycleView_class("一歌一遇",R.mipmap.radio_widget_icn_new);
        mlist.add(find_below_recycleViews);
        find_below_recycleViews=new find_below_recycleView_class("数字专辑",R.mipmap.radio_widget_icn_new);
        mlist.add(find_below_recycleViews);
        find_below_recycleViews=new find_below_recycleView_class("有声书",R.mipmap.radio_widget_icn_new);
        mlist.add(find_below_recycleViews);
        find_below_recycleViews=new find_below_recycleView_class("关注新歌",R.mipmap.radio_widget_icn_new);
        mlist.add(find_below_recycleViews);
        find_below_recycleViews=new find_below_recycleView_class("游戏专区",R.mipmap.radio_widget_icn_new);
        mlist.add(find_below_recycleViews);
    }


    private void initView(){

    }

    private void initData(){
        image_List.add(new ImageBean(R.drawable.loading));
        image_List.add(new ImageBean(R.drawable.loading));
        image_List.add(new ImageBean(R.drawable.loading));
        image_List.add(new ImageBean(R.drawable.loading));
        image_List.add(new ImageBean(R.drawable.loading));
    }
}