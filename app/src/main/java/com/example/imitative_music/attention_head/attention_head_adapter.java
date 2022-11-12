package com.example.imitative_music.attention_head;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.imitative_music.R;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;


public class attention_head_adapter extends RecyclerView.Adapter<attention_head_adapter.ViewHolder> {

    private List<attention_head_class> mlist;

    public attention_head_adapter(List<attention_head_class> mlist) {
        this.mlist = mlist;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_layout_attention_item1, parent, false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        attention_head_class attention_head_classes=mlist.get(position);
        holder.circleImageView.setImageResource(attention_head_classes.getImageId());
        holder.textView.setText(attention_head_classes.getName());
    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }
    static class ViewHolder extends RecyclerView.ViewHolder{
        CircleImageView circleImageView;
        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            circleImageView=(CircleImageView) itemView.findViewById(R.id.attention_recyclerview_img);
            textView=(TextView) itemView.findViewById(R.id.attention_recyclerview_name);
        }
    }
}
