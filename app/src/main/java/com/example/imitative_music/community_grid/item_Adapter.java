package com.example.imitative_music.community_grid;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.imitative_music.R;

import java.util.List;

public class item_Adapter extends RecyclerView.Adapter<item_Adapter.MyHolder> {
    private List<item_class> mlist;

    public item_Adapter(List<item_class> mlist) {
        this.mlist = mlist;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.community_grid_item, parent, false);
        MyHolder myHolder = new MyHolder(view);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        holder.imageViewID.setImageResource(mlist.get(position).getImageID());
        holder.nameID.setText(mlist.get(position).getNameID());
        holder.newmsgID.setText(mlist.get(position).getNewmsgID());
    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder{
        TextView nameID;
        TextView newmsgID;
        ImageView imageViewID;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            nameID = itemView.findViewById(R.id.nameID);
            newmsgID = itemView.findViewById(R.id.newmsgID);
            imageViewID = itemView.findViewById(R.id.imageView);
        }
    }
}
