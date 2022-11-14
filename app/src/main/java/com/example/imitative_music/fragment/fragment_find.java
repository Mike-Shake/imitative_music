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

import com.example.imitative_music.attention.attention_head_adapter;
import com.example.imitative_music.attention.dynamic_Adapter;
import com.example.imitative_music.find.ImageAdapter;
import com.example.imitative_music.find.ImageBean;
import com.example.imitative_music.find.find_below_recycleView_class;
import com.example.imitative_music.find.find_below_recycleview_adapter;
import com.example.imitative_music.R;
import com.example.imitative_music.find.tuijian_Bean;
import com.example.imitative_music.find.tuijiangedan_Adapter;
import com.youth.banner.Banner;
import com.youth.banner.indicator.CircleIndicator;


import java.util.ArrayList;
import java.util.List;

public class fragment_find extends Fragment {
    RecyclerView recyclerView,recyclerView2;

    //轮播图的使用
    private Banner mBanner;
    private List<ImageBean> image_List ;

    //轮播图下方是横向recyclerview的实现
    find_below_recycleview_adapter adapter;
    private List<find_below_recycleView_class> mlist;

    //推荐歌单
    tuijiangedan_Adapter adapter2;
    private List<tuijian_Bean> tuijian_beanList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_layout_find, container, false);
        //轮播图的添加
        image_List = new ArrayList<>();
        //轮播图下方是横向recyclerview的实现
        mlist = new ArrayList<>();
        //推荐歌单的实现
        tuijian_beanList=new ArrayList<>();

        init();

        //轮播图的适配
        mBanner =  view.findViewById(R.id.find_banner);
        mBanner.setAdapter(new ImageAdapter(getActivity(), image_List));
        // Set Banner is auto to loop.
        mBanner.isAutoLoop(true);
        // Set an indicator for Banner.
        mBanner.setIndicator(new CircleIndicator(getActivity()));
        mBanner.start();

        //横的
        recyclerView = view.findViewById(R.id.find_below_recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        adapter = new find_below_recycleview_adapter(mlist);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setAdapter(adapter);

        // 推荐歌单
        recyclerView2=view.findViewById(R.id.find_recyclerview2);
        LinearLayoutManager layoutManager1=new LinearLayoutManager(getContext());
        recyclerView2.setLayoutManager(layoutManager1);
        adapter2=new tuijiangedan_Adapter(tuijian_beanList);
        layoutManager1.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView2.setAdapter(adapter2);

        return view;
//        return inflater.inflate(R.layout.fragment_layout_find, container, false);
    }

    public void init(){
        find_below_recycleView_class find_below_recycleViews=new find_below_recycleView_class("每日推荐",R.mipmap.meirituijian);
        mlist.add(find_below_recycleViews);
        find_below_recycleView_class find_below_recycleViews1=new find_below_recycleView_class("私人FM",R.mipmap.sirenfm);
        mlist.add(find_below_recycleViews1);
        find_below_recycleViews=new find_below_recycleView_class("歌单",R.mipmap.find_gedan);
        mlist.add(find_below_recycleViews);
        find_below_recycleViews=new find_below_recycleView_class("排行榜",R.mipmap.paihangbang);
        mlist.add(find_below_recycleViews);
        find_below_recycleViews=new find_below_recycleView_class("一歌一遇",R.mipmap.yigeyiyu);
        mlist.add(find_below_recycleViews);
        find_below_recycleViews=new find_below_recycleView_class("数字专辑",R.mipmap.shizizhuanji);
        mlist.add(find_below_recycleViews);
        find_below_recycleViews=new find_below_recycleView_class("有声书",R.mipmap.youshengshu);
        mlist.add(find_below_recycleViews);
        find_below_recycleViews=new find_below_recycleView_class("关注新歌",R.mipmap.gaunzhuxinge);
        mlist.add(find_below_recycleViews);
        find_below_recycleViews=new find_below_recycleView_class("游戏专区",R.mipmap.youxizhuanqu);
        mlist.add(find_below_recycleViews);

        image_List.add(new ImageBean(R.mipmap.find_tu1));
        image_List.add(new ImageBean(R.mipmap.find_tu2));
        image_List.add(new ImageBean(R.mipmap.find_tu3));
        image_List.add(new ImageBean(R.mipmap.find_tu4));
        image_List.add(new ImageBean(R.mipmap.find_tu5));

        tuijian_Bean tuijian_bean=new tuijian_Bean("2022全网最火超好听热门歌曲",R.drawable.loading);
        tuijian_beanList.add(tuijian_bean);
        tuijian_beanList.add(tuijian_bean);
        tuijian_beanList.add(tuijian_bean);
        tuijian_beanList.add(tuijian_bean);

//        tuijian_bean=new tuijian_Bean("2022全网最火超好听热门歌曲",R.drawable.loading);
//        tuijian_beanList.add(tuijian_bean);
//        tuijian_bean=new tuijian_Bean("2022全网最火超好听热门歌曲",R.drawable.loading);
//        tuijian_beanList.add(tuijian_bean);
//        tuijian_bean=new tuijian_Bean("2022全网最火超好听热门歌曲",R.drawable.loading);
//        tuijian_beanList.add(tuijian_bean);
    }


}