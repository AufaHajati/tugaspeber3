package com.example.tugaspeber2;


public class Item {

    private String nama;
    private String nim;
    private int image;

    public Item(String nama, String nim, int image) {
        this.nama = nama;
        this.nim = nim;
        this.image = image;
    }

    public static Item get(int position) {
    };


    public String getNama() {

        return nama;
    }

    public void setNama(String nama) {

        this.nama = nama;
    }

    public String getNim() {

        return nim;
    }

    public void setNim(String nim) {

        this.nim = nim;
    }

    public int getImage() {

        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
