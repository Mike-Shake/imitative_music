package com.example.imitative_music.find_horizontal_recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.imitative_music.R;

import java.util.List;

public class find_below_recycleview_adapter extends RecyclerView.Adapter<find_below_recycleview_adapter.ViewHolder> {

    private List<find_below_recycleView_class> mlist;

    public find_below_recycleview_adapter(List<find_below_recycleView_class> mlist) {
        this.mlist = mlist;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.find_layout_below_recycleview_item, parent, false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        find_below_recycleView_class find_below_recycleViews=mlist.get(position);
        holder.imageView.setImageResource(find_below_recycleViews.getImageId());
        holder.textView.setText(find_below_recycleViews.getName());
    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=(ImageView) itemView.findViewById(R.id.find_below_recycleview_img);
            textView=(TextView) itemView.findViewById(R.id.find_below_recycleview_textname);
        }
    }

}
