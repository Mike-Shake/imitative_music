package com.example.imitative_music.mine;

import android.widget.ImageView;

public class list_bean {
    String tv_name;
    String tv_count;
    int img_create;

    public list_bean(String tv_name, String tv_count, int img_create) {
        this.tv_name = tv_name;
        this.tv_count = tv_count;
        this.img_create = img_create;
    }

    public String getTv_name() {
        return tv_name;
    }

    public String getTv_count() {
        return tv_count;
    }

    public int getImg_create() {
        return img_create;
    }
}

