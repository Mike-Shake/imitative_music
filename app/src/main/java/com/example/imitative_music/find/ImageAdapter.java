package com.example.imitative_music.find;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.imitative_music.R;
import com.youth.banner.adapter.BannerAdapter;

import java.util.List;

public class ImageAdapter extends BannerAdapter<ImageBean,ImageAdapter.ImageHolder> {
    Context context;

    public ImageAdapter(Context context,List<ImageBean> datas) {
        super(datas);
        this.context=context;
    }

    @Override
    public ImageHolder onCreateHolder(ViewGroup parent, int viewType) {
        return new ImageHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.find_banner_item,parent,false));
    }

    @Override
    public void onBindView(ImageHolder holder, ImageBean data, int position, int size) {
        holder.imageView.setImageResource(data.getImageViewID());
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"Test", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public class ImageHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        public ImageHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.find_banner_item_image);
        }
    }
}
