package com.example.uygulama13oyun;

public class Oyuncu {
    private String isim;
    private Integer can;
    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }
    public Integer getCan() {
        return can;
    }
    public void setCan(Integer can) {
        this.can = can;
    }
    public Oyuncu(String isim, Integer can) {
        this.isim = isim;
        this.can = can;
    }
    public Solider tankci = new Tankci();
    public Solider topcu = new Topcu();
}
