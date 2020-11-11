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
public interface Manipülatör extends Robotlar{
     double getKapasite();
     double getUzunluk();
     double getTasimaHizi();
     void setKapasite(double Kapasite);
     void setUzunluk(double Uzunluk);
     void setTasimaHizi(double TasimaHizi);
}
