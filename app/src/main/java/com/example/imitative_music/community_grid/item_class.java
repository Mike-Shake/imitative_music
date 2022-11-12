package com.example.imitative_music.community_grid;

public class item_class {
    private int ImageID;
    private String nameID;
    private String newmsgID;

    public item_class() {
    }

    public item_class(int imageID, String nameID, String newmsgID) {
        ImageID = imageID;
        this.nameID = nameID;
        this.newmsgID = newmsgID;
    }

    public int getImageID() {
        return ImageID;
    }

    public String getNewmsgID() {
        return newmsgID;
    }

    public String getNameID() {
        return nameID;
    }

}
