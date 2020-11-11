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
public class Gezgin implements Robotlar{
        private int Motor;
        private double Yuk;
        private double Hiz;
        private String Tür;
        private double HızKapasitesi;
        public Gezgin() {

        }
        @Override
        public String getTür(){
            return Tür;
        }
        
        @Override
        public void setTür(String Tür){
            this.Tür=Tür;
        }
        public double getGezinmehizi() {
            return Hiz;
        }
        public void setGezinmeHizi(double Hiz){
            this.Hiz=Hiz;

        }
        public Gezgin(String Tür,int Motor,double Yuk) {
            this.Tür=Tür;
            this.Motor = Motor;
            this.Yuk=Yuk;
        }
        @Override
        public int getMotor(){

            return Motor;
        }

        @Override
        public double getYuk() {

            return Yuk;
        }

        @Override
        public void setMotor(int motor) {
            this.Motor=motor;
        }

        @Override
        public void setYuk(double Yuk) {

            this.Yuk=Yuk;
        }
        public void setHızKapasitei(int HızKapasitesi){
            this.HızKapasitesi=HızKapasitesi;
        }
        

        }

