package com.example.imitative_music.attention;

public class dynamic_recyclerview_class {
    private String mingzi;
    private String laiyuan;
    private String neirong;
    private int touxiang;
    private int tupian1;
    private int tupian2;

    public dynamic_recyclerview_class(String mingzi, String laiyuan, String neirong, int touxiang, int tupian1, int tupian2) {
        this.mingzi = mingzi;
        this.laiyuan = laiyuan;
        this.neirong = neirong;
        this.touxiang = touxiang;
        this.tupian1 = tupian1;
        this.tupian2 = tupian2;
    }

    public String getMingzi() {
        return mingzi;
    }

    public String getLaiyuan() {
        return laiyuan;
    }

    public String getNeirong() {
        return neirong;
    }

    public int getTouxiang() {
        return touxiang;
    }

    public int getTupian1() {
        return tupian1;
    }

    public int getTupian2() {
        return tupian2;
    }
}
