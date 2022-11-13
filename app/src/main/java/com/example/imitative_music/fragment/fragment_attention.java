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

        recyclerView = view.findViewById(R.id.attention_recyclerview1);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        adapter = new attention_head_adapter(mlist);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setAdapter(adapter);

        recyclerView2 = view.findViewById(R.id.attention_recyclerview2);
        LinearLayoutManager layoutManager1 = new LinearLayoutManager(getActivity());
        recyclerView2.setLayoutManager(layoutManager1);
        adapter2 = new dynamic_Adapter(recyclerview2_list);
        recyclerView2.setAdapter(adapter2);


        return view;
    }

    private void init() {
        attention_head_class attention_head_classes = new attention_head_class("我的圈子", R.mipmap.radio_widget_icn_new);
        mlist.add(attention_head_classes);
        attention_head_classes = new attention_head_class("我的圈子", R.mipmap.radio_widget_icn_new);
        mlist.add(attention_head_classes);
        attention_head_classes = new attention_head_class("我的圈子", R.mipmap.radio_widget_icn_new);
        mlist.add(attention_head_classes);
        attention_head_classes = new attention_head_class("我的圈子", R.mipmap.radio_widget_icn_new);
        mlist.add(attention_head_classes);
        attention_head_classes = new attention_head_class("我的圈子", R.mipmap.radio_widget_icn_new);
        mlist.add(attention_head_classes);
        attention_head_classes = new attention_head_class("我的圈子", R.mipmap.radio_widget_icn_new);
        mlist.add(attention_head_classes);
        attention_head_classes = new attention_head_class("我的圈子", R.mipmap.radio_widget_icn_new);
        mlist.add(attention_head_classes);

        dynamic_recyclerview_class dynamic_recyclerview_classes = new dynamic_recyclerview_class("恋的忧伤日记",
                "Ta推荐了林俊杰的新歌", "别害怕有我",
                R.mipmap.mine_touxaing, R.drawable.loading, R.drawable.loading);
        recyclerview2_list.add(dynamic_recyclerview_classes);
        dynamic_recyclerview_classes = new dynamic_recyclerview_class("恋的忧伤日记",
                "Ta推荐了林俊杰的新歌", "别害怕有我",
                R.mipmap.mine_touxaing, R.drawable.loading, R.drawable.loading);
        recyclerview2_list.add(dynamic_recyclerview_classes);
        dynamic_recyclerview_classes = new dynamic_recyclerview_class("恋的忧伤日记",
                "Ta推荐了林俊杰的新歌", "别害怕有我",
                R.mipmap.mine_touxaing, R.drawable.loading, R.drawable.loading);
        recyclerview2_list.add(dynamic_recyclerview_classes);
        dynamic_recyclerview_classes = new dynamic_recyclerview_class("恋的忧伤日记",
                "Ta推荐了林俊杰的新歌", "别害怕有我",
                R.mipmap.mine_touxaing, R.drawable.loading, R.drawable.loading);
        recyclerview2_list.add(dynamic_recyclerview_classes);
        dynamic_recyclerview_classes = new dynamic_recyclerview_class("恋的忧伤日记",
                "Ta推荐了林俊杰的新歌", "别害怕有我",
                R.mipmap.mine_touxaing, R.drawable.loading, R.drawable.loading);
        recyclerview2_list.add(dynamic_recyclerview_classes);
        dynamic_recyclerview_classes = new dynamic_recyclerview_class("恋的忧伤日记",
                "Ta推荐了林俊杰的新歌", "别害怕有我",
                R.mipmap.mine_touxaing, R.drawable.loading, R.drawable.loading);
        recyclerview2_list.add(dynamic_recyclerview_classes);
    }

}
