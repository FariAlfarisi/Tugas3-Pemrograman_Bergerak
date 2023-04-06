package com.pemrogramanbergerak.recycleview;

public class BrandActivity {
    String nama, text;
    int logo;

    public BrandActivity(String nama, String text, int logo) {
        this.nama = nama;
        this.logo = logo;
        this.text = text;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }
}
