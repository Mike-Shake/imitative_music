package com.example.imitative_music.mine;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.imitative_music.R;

import java.util.ArrayList;
import java.util.List;

public class chuangjiangedan extends Fragment {

    List<list_bean> list;
    RecyclerView recyclerView;
    CreatesonglistAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        list= new ArrayList<>();
        init();
        View view= inflater.inflate(R.layout.mine_chuangjiangedan, container, false);
        recyclerView=view.findViewById(R.id.rv_create1);
        LinearLayoutManager layout=new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layout);
        adapter=new CreatesonglistAdapter(list);
        recyclerView.setAdapter(adapter);
        return view;
    }
    private void init() {
        list_bean list_beans=new list_bean("小狐狸的2021年度歌单","10首",R.mipmap.minr_gedantu);
        list.add(list_beans);
        list.add(list_beans);
        list.add(list_beans);
    }
}
