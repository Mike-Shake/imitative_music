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
import com.example.imitative_music.attention_head.attention_head_adapter;
import com.example.imitative_music.attention_head.attention_head_class;
import com.example.imitative_music.find_horizontal_recycleview.find_below_recycleView_class;
import com.example.imitative_music.find_horizontal_recycleview.find_below_recycleview_adapter;

import java.util.ArrayList;
import java.util.List;

public class fragment_attention extends Fragment {
    
    RecyclerView recyclerView;
    attention_head_adapter adapter;
    private List<attention_head_class> mlist;
    
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_layout_attention, container, false);
        mlist = new ArrayList<>();
        init();
        recyclerView = view.findViewById(R.id.attention_recyclerview1);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        adapter = new attention_head_adapter(mlist);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setAdapter(adapter);
        return view;
    }

    private void init() {
        attention_head_class attention_head_classes=new attention_head_class("我的圈子",R.mipmap.radio_widget_icn_new);
        mlist.add(attention_head_classes);
        attention_head_classes=new attention_head_class("我的圈子",R.mipmap.radio_widget_icn_new);
        mlist.add(attention_head_classes);
        attention_head_classes=new attention_head_class("我的圈子",R.mipmap.radio_widget_icn_new);
        mlist.add(attention_head_classes);
        attention_head_classes=new attention_head_class("我的圈子",R.mipmap.radio_widget_icn_new);
        mlist.add(attention_head_classes);
        attention_head_classes=new attention_head_class("我的圈子",R.mipmap.radio_widget_icn_new);
        mlist.add(attention_head_classes);
        attention_head_classes=new attention_head_class("我的圈子",R.mipmap.radio_widget_icn_new);
        mlist.add(attention_head_classes);
        attention_head_classes=new attention_head_class("我的圈子",R.mipmap.radio_widget_icn_new);
        mlist.add(attention_head_classes);
    }

}