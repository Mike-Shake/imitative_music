package com.example.imitative_music.find_LoopView;

import android.content.Context;
import android.media.Image;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.ArrayList;

public class LoopAdapter extends PagerAdapter  {

    private ArrayList<ImageView> imageViewList;

    public LoopAdapter(ArrayList<ImageView> imageViewList) {
        this.imageViewList = imageViewList;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        // container: 容器: ViewPager
        // position: 当前要显示条目的位置 0 -> 4
        // newPosition = position % 5
        int newPosition=position % imageViewList.size();

        ImageView img=imageViewList.get(newPosition);
        // a. 把View对象添加到container中
        container.addView(img);
        // b. 把View对象返回给框架, 适配器
        return img;
    }


    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }

    @Override
    public int getCount() {
        return Integer.MAX_VALUE;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }
}
