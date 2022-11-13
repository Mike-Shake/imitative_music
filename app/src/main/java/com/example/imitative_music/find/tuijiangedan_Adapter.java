package com.example.imitative_music.find;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.imitative_music.R;

import java.util.List;

public class tuijiangedan_Adapter extends RecyclerView.Adapter<tuijiangedan_Adapter.Myholder> {
    List<tuijian_Bean> mlist;

    public tuijiangedan_Adapter(List<tuijian_Bean> mlist) {
        this.mlist = mlist;
    }

    @NonNull
    @Override
    public Myholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Myholder(LayoutInflater.from(parent.getContext()).inflate(R.layout.find_recyclerview2_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull Myholder holder, int position) {
        holder.tuijiantu.setImageResource(mlist.get(position).getTuijiantu());
        holder.tuijianming.setText(mlist.get(position).getTuijianming());
    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }

    public class Myholder extends RecyclerView.ViewHolder {
        TextView tuijianming;
        ImageView tuijiantu;
        public Myholder(@NonNull View itemView) {
            super(itemView);
            tuijianming=itemView.findViewById(R.id.tuijianming);
            tuijiantu =itemView.findViewById(R.id.tuijiantu);
        }
    }
}
