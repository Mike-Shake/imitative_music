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

import com.example.imitative_music.R;
import com.example.imitative_music.attention.attention_head_adapter;
import com.example.imitative_music.attention.attention_head_class;
import com.example.imitative_music.attention.dynamic_recyclerview_class;
import com.example.imitative_music.attention.dynamic_Adapter;


import java.util.ArrayList;
import java.util.List;

public class fragment_attention extends Fragment {

    RecyclerView recyclerView, recyclerView2;
    attention_head_adapter adapter;
    dynamic_Adapter adapter2;
    private List<attention_head_class> mlist;

    private List<dynamic_recyclerview_class> recyclerview2_list;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_layout_attention, container, false);
        mlist = new ArrayList<>();
        recyclerview2_list = new ArrayList<>();
        init();

        //我的好友的添加
        recyclerView = view.findViewById(R.id.attention_recyclerview1);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        adapter = new attention_head_adapter(mlist);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setAdapter(adapter);

        //我的好友动态的添加
        recyclerView2 = view.findViewById(R.id.attention_recyclerview2);
        LinearLayoutManager layoutManager1 = new LinearLayoutManager(getActivity());
        recyclerView2.setLayoutManager(layoutManager1);
        adapter2 = new dynamic_Adapter(recyclerview2_list);
        recyclerView2.setAdapter(adapter2);


        return view;
    }

    private void init() {
        attention_head_class attention_head_classes = new attention_head_class("雾与晨", R.mipmap.t1);
        mlist.add(attention_head_classes);
        attention_head_classes = new attention_head_class("乐音乐", R.mipmap.t2);
        mlist.add(attention_head_classes);
        attention_head_classes = new attention_head_class("快乐南瓜", R.mipmap.t3);
        mlist.add(attention_head_classes);
        attention_head_classes = new attention_head_class("甜筒指南", R.mipmap.t4);
        mlist.add(attention_head_classes);
        attention_head_classes = new attention_head_class("_厌烦一切", R.mipmap.t5);
        mlist.add(attention_head_classes);
        attention_head_classes = new attention_head_class("我的忧伤日记", R.mipmap.t6);
        mlist.add(attention_head_classes);
        attention_head_classes = new attention_head_class("嘿嘿嘿", R.mipmap.shizizhuanji);
        mlist.add(attention_head_classes);

        dynamic_recyclerview_class dynamic_recyclerview_classes = new dynamic_recyclerview_class("雾与晨的杂货店",
                "Ta推荐的歌曲乐评很精彩", "无人问津的角落总是开满鲜花",
                R.mipmap.mine_touxaing, R.mipmap.a1, R.mipmap.a2);
        recyclerview2_list.add(dynamic_recyclerview_classes);

        dynamic_recyclerview_classes = new dynamic_recyclerview_class("乐音乐VIP",
                "音乐品味相似75%的人用户看过", "随机抽一个单身的人告诉哥单身的好处",
                R.mipmap.t1, R.mipmap.a3, R.mipmap.a4);
        recyclerview2_list.add(dynamic_recyclerview_classes);

        dynamic_recyclerview_classes = new dynamic_recyclerview_class("快乐南瓜",
                "根据你的二度好友推荐", "发点开心的",
                R.mipmap.t2, R.mipmap.d1, R.mipmap.d2);
        recyclerview2_list.add(dynamic_recyclerview_classes);

        dynamic_recyclerview_classes = new dynamic_recyclerview_class("甜筒指南",
                "歌手薛之谦的热歌讨论", "叮咚学习方法已送达",
                R.mipmap.t3, R.mipmap.d3, R.mipmap.d4);
        recyclerview2_list.add(dynamic_recyclerview_classes);

        dynamic_recyclerview_classes = new dynamic_recyclerview_class("_厌烦一切",
                "Ta推荐了林俊杰的新歌", "好消息是要回家了",
                R.mipmap.t4, R.mipmap.d5, R.mipmap.d6);
        recyclerview2_list.add(dynamic_recyclerview_classes);

        dynamic_recyclerview_classes = new dynamic_recyclerview_class("我的忧伤日记",
                "Ta推荐了毛不易的新歌", "呜呜呜，写不完",
                R.mipmap.t5, R.drawable.loading, R.drawable.loading);
        recyclerview2_list.add(dynamic_recyclerview_classes);
    }

}
