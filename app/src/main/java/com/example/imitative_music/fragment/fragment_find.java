package com.example.imitative_music.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.example.imitative_music.find_horizontal_recycleview.find_below_recycleView_class;
import com.example.imitative_music.find_horizontal_recycleview.find_below_recycleview_adapter;
import com.example.imitative_music.R;


import java.util.ArrayList;
import java.util.List;

public class fragment_find extends Fragment {
    //轮播图的使用
    private ViewPager viewPager;
    private int[] mImg;
    private int[] mImg_id;
    private String[] mDec;
    private ArrayList<ImageView> mImgList;
    private LinearLayout find_loopView_dots;
    private TextView find_loopView_textView;
    private int previousSelectedPosition = 0;
    boolean isRunning = false;

    RecyclerView recyclerView;
    find_below_recycleview_adapter adapter;
    private List<find_below_recycleView_class> mlist;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_layout_find, container, false);
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


//    @Override
//    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {//
//         viewPager = (ViewPager) getActivity().findViewById(R.id.fragment_find_loopviewpager);
//        find_loopView_dots = (LinearLayout) getActivity().findViewById(R.id.find_loopView_dots);
//        find_loopView_textView = (TextView) getActivity().findViewById(R.id.find_loopView_textView);
//        // 图片资源id数组
//        mImg = new int[]{
//                R.mipmap.text,
//                R.mipmap.text,
//                R.mipmap.text,
//                R.mipmap.text,
//                R.mipmap.text,
//        };
//        // 文本描述
//        mDec = new String[]{
//                "Test1",
//                "Test2",
//                "Test3",
//                "Test4",
//                "Test5"
//        };
//        mImg_id = new int[]{
//                R.id.pager_img1,
//                R.id.pager_img2,
//                R.id.pager_img3,
//                R.id.pager_img4,
//                R.id.pager_img5
//        };
//        // 初始化要展示的5个ImageView
//        mImgList = new ArrayList<ImageView>();
//        ImageView imageView;
//        View dotView;
//        LinearLayout.LayoutParams layoutParams;
//        for (int i = 0; i < mImg.length; i++) {
//            //初始化要显示图片对象
//            imageView = new ImageView(getActivity());
//            imageView.setBackgroundResource(mImg[i]);
//            imageView.setId(mImg_id[i]);
//            imageView.setOnClickListener(new pagerOnClickListener(getActivity().getApplicationContext()));
//            mImgList.add(imageView);
//            //加引导点
//            dotView = new View(getActivity());
//            dotView.setBackgroundResource(R.drawable.dot);
//            layoutParams = new LinearLayout.LayoutParams(10, 10);
//
//            if (i != 0) {
//                layoutParams.leftMargin = 10;
//            }
//            //设置默认所有都不可用
//            dotView.setEnabled(false);
//            find_loopView_dots.addView(dotView, layoutParams);
//        }
//        find_loopView_dots.getChildAt(0).setEnabled(true);
//        find_loopView_textView.setText(mDec[0]);
//        previousSelectedPosition = 0;
//        //设置适配器
//        viewPager.setAdapter(new LoopAdapter(mImgList));
//        // 把ViewPager设置为默认选中Integer.MAX_VALUE / t2，从十几亿次开始轮播图片，达到无限循环目的;
//        int m = (Integer.MAX_VALUE / 2) % mImgList.size();
//        int currentPosition = Integer.MAX_VALUE / 2 - m;
//        viewPager.setCurrentItem(currentPosition);
//
//        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
//            @Override
//            public void onPageScrolled(int i, float v, int i1) {
//
//            }
//
//            @Override
//            public void onPageSelected(int i) {
//                int newPosition = i % mImgList.size();
//                find_loopView_textView.setText(mDec[newPosition]);
//                find_loopView_dots.getChildAt(previousSelectedPosition).setEnabled(false);
//                find_loopView_dots.getChildAt(newPosition).setEnabled(true);
//                previousSelectedPosition = newPosition;
//            }
//
//            @Override
//            public void onPageScrollStateChanged(int i) {
//
//            }
//
//        });
//        isRunning = true;
//        while (isRunning) {
//            //下一条
//            new Handler().post(new Runnable() {
//                @Override
//                public void run() {
//                    viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
//                }
//            });
//
//        }
//        // 开启轮询
//        new Thread(){
//            public void run(){
//                isRunning = true;
//                while(isRunning){
//                    try{
//                        Thread.sleep(5000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    //下一条
//                   getActivity().runOnUiThread(new Runnable() {
//                        @Override
//                        public void run() {
//                            viewPager.setCurrentItem(viewPager.getCurrentItem()+1);
//                        }
//                    });
//                }
//            }
//        }.start();
//    }
}