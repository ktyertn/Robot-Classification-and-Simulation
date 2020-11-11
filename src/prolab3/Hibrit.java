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
public class Hibrit extends Gezgin implements Manipülatör{
        
        private double sure = 0;
        private String Tür;
        private double Kapasite;
        private double Uzunluk;
        private double TasimaHizi;
        private String Hareketli;
        private String Hareketsiz;
        private int setSayi;
    private int Sabit;
    private int Yukleme;
        
    public Hibrit(){
        
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
    public double EngelGecmeSuresiBul(String Tür){
        if(Tür.equals("Tekerlekli"))this.sure=(getMotor()*0.5);
        if(Tür.equals("Paletli"))this.sure=(getMotor()*3);  
        return sure;
    }

   public void setSayi(int Sayi) {
        this.setSayi=Sayi;
    }

    public void setSabitlenme(int sabit) {
        this.Sabit=sabit;
    }

    public void setYukleme(int Yukleme) {
       this.Yukleme=Yukleme;
    }
    public int getYukleme(){
        return Yukleme;
    }
    public int getSabitlenme() {
        return Sabit;
           }
    }

