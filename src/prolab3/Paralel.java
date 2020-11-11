/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prolab3;

/**
 *
 * @author Epwl
 */
public class Paralel implements Manipülatör{
    private double TasimaHizi;
    private double Kapasite;
    private double Uzunluk;
    private int Motor;
    private String Tür;
    private double Yuk;
    private double Sure=0;
    public Paralel(){
        
    }
    @Override
    public double getKapasite() {
        return Kapasite;
    }

    @Override
    public double getUzunluk() {
        return Uzunluk;
    }

    @Override
    public double getTasimaHizi() {
        return TasimaHizi;
    }

    @Override
    public void setKapasite(double Kapasite) {
        this.Kapasite=Kapasite;
    }

    @Override
    public void setUzunluk(double Uzunluk) {
        this.Uzunluk=Uzunluk;
    }

    @Override
    public void setTasimaHizi(double TasimaHizi) {
        this.TasimaHizi=TasimaHizi;
    }

    @Override
    public int getMotor() {
        return Motor;
    }

    @Override
    public double getYuk() {
        return Yuk;
    }

    @Override
    public String getTür() {
        return Tür;
    }

    @Override
    public void setTür(String Tür) {
        this.Tür=Tür;
    }

    @Override
    public void setMotor(int Motor) {
        this.Motor=Motor;
    }

    @Override
    public void setYuk(double Yuk) {
        this.Yuk=Yuk;
    }
    
}
