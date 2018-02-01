package com.example.yogi.myapplication;

/**
 * Created by yogi on 31/01/18.
 */

public class Komunikasi {
    String title, subtitle;
    Integer imgUrl;

    public Komunikasi(Integer imgUrl, String title, String subtitle) {
        this.imgUrl = imgUrl;
        this.title = title;
        this.subtitle = subtitle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public Integer getImgUrl() { return imgUrl; }

    public void setImgUrl(Integer imgUrl) {
        this.imgUrl = imgUrl;
    }
}
