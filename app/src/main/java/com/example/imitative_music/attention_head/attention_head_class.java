package com.example.imitative_music.attention_head;

public class attention_head_class {
    private String name;
    private int imageId;

    public attention_head_class(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }
}
