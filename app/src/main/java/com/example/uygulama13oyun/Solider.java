package com.example.uygulama13oyun;

import java.util.Random;

public class Solider {
    private Integer atesGucu;
    public Integer getAtesGucu() {
        return atesGucu;
    }
    public void setAtesGucu(Integer atesGucu) {
        this.atesGucu = atesGucu;
    }
    private Integer sans;
    public Integer getSans() {
        return sans;
    }
    public void setSans(Integer sans) {
        this.sans = sans;
    }
    public Solider(Integer atesGucu, Integer sans) {
        this.atesGucu = atesGucu;
        this.sans = sans;
    }
    public Integer atesEt(Oyuncu dusman){
        Random random = new Random();
        int isabet = random.nextInt(sans)*atesGucu;
        dusman.setCan(dusman.getCan()-isabet);
        return isabet;
    }
}