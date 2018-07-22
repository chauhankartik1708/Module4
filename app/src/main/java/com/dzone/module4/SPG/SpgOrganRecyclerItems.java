package com.dzone.module4.SPG;

public class SpgOrganRecyclerItems {

    private String title;
    private String desc;

    public String getTitle() {
        return title;
    }

    public void setTitle(String date) {
        this.title = date;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public SpgOrganRecyclerItems(String title, String desc) {
        this.title = title;
        this.desc = desc;
    }
}
