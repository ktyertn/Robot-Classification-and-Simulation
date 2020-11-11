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
public class Paletli extends Gezgin {

    private int Palet;
    public double EngelGecmeSuresiBul() {
        int motor=getMotor();

         return motor*3;
    }

    void setPalet(int Sayi) {
        this.Palet=Sayi;
    }
}
