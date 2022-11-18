package com.example.imitative_music.mine;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;

import com.example.imitative_music.R;

import java.util.List;

public class CreatesonglistAdapter extends RecyclerView.Adapter<CreatesonglistAdapter.MyViewHolder> {

    List<list_bean> list;

    public CreatesonglistAdapter(List<list_bean> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.mine_create_list_item,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv_create.setText(list.get(position).tv_name);
        holder.tv_count.setText(list.get(position).tv_count);
        holder.img_create.setImageResource(list.get(position).img_create);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv_create,tv_count;
        ImageView img_create;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            img_create=itemView.findViewById(R.id.img_create);
            tv_create=itemView.findViewById(R.id.tv_create_name);
            tv_count=itemView.findViewById(R.id.tv_count);
        }
    }
}
