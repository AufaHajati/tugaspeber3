package com.example.aufahajati;

public class Item {

    String Nama;
    String NIM;
    int Gambar;

    public Item(String Nama, String NIM, int Gambar) {
        this.Nama = Nama;
        this.NIM = NIM;
        this.Gambar = Gambar;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public int getGambar() {
        return Gambar;
    }

    public void setGambar(int Gambar) {
        this.Gambar = Gambar;
    }
}
