package com.example.imitative_music.community;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.imitative_music.R;

import java.util.ArrayList;
import java.util.List;

public class plaza extends Fragment {
    private List<item_class> mlist;
    private RecyclerView recyclerView_grid;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.community_plaza, container, false);
        recyclerView_grid=view.findViewById(R.id.community_grid_recyclerview);
        mlist=new ArrayList<>();
        initView();
        GridLayoutManager layoutManager=new GridLayoutManager(getActivity(),2);
        layoutManager.setOrientation(RecyclerView.HORIZONTAL);
        recyclerView_grid.setLayoutManager(layoutManager);
        recyclerView_grid.setAdapter(new item_Adapter(mlist));
        recyclerView_grid.setItemAnimator(new DefaultItemAnimator());
        return view;
    }

    private void initView() {

        mlist=new ArrayList<>();
        item_class classes=new item_class(R.drawable.loading,"破防","999+");
        mlist.add(classes);
        mlist.add(classes);
        mlist.add(classes);
        mlist.add(classes);
        mlist.add(classes);
        mlist.add(classes);
        mlist.add(classes);
        mlist.add(classes);
        mlist.add(classes);
        mlist.add(classes);
        mlist.add(classes);
    }

}
