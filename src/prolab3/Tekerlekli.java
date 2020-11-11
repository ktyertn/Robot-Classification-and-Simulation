/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prolab3;

/**
 *
 * @author milan
 */
public class Tekerlekli extends Gezgin{

    private int Tekerlek;
    public double EngelGecmeSuresiBul() {
        int motor=getMotor();
        return motor*0.5;
    }

    void setTekerlek(int Sayi) {
        this.Tekerlek=Sayi;
    }
}
