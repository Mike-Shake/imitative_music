package com.example.imitative_music.attention;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.imitative_music.R;

import java.util.List;

public class dynamic_Adapter extends RecyclerView.Adapter<dynamic_Adapter.Myholder> {
    List<dynamic_recyclerview_class> mlist;

    public dynamic_Adapter(List<dynamic_recyclerview_class> mlist) {
        this.mlist = mlist;
    }

    @NonNull
    @Override
    public Myholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.attention_recyclerview1_item, parent, false);
        Myholder myholder = new Myholder(view);
        return myholder;
    }

    @Override
    public void onBindViewHolder(@NonNull Myholder holder, int position) {
        holder.touxiang.setImageResource(mlist.get(position).getTouxiang());
        holder.laiyuan.setText(mlist.get(position).getLaiyuan());
        holder.mingzi.setText(mlist.get(position).getMingzi());
        holder.tupian1.setImageResource(mlist.get(position).getTupian1());
        holder.tupian2.setImageResource(mlist.get(position).getTupian2());
        holder.neirong.setText(mlist.get(position).getNeirong());
    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }

    public class Myholder extends RecyclerView.ViewHolder {
        TextView mingzi;
        TextView laiyuan;
        TextView neirong;
        ImageView touxiang;
        ImageView tupian1;
        ImageView tupian2;

        public Myholder(@NonNull View itemView) {
            super(itemView);
            mingzi = itemView.findViewById(R.id.mingzi);
            laiyuan = itemView.findViewById(R.id.laiyuan);
            neirong = itemView.findViewById(R.id.neirong);
            touxiang = itemView.findViewById(R.id.touxiang);
            tupian1 = itemView.findViewById(R.id.tupian1);
            tupian2 = itemView.findViewById(R.id.tupian2);
        }
    }
}
