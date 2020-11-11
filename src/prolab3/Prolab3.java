/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prolab3;

import java.awt.Color;
import java.util.Scanner;
import javax.swing.JFrame;
/**
 *
 * @author milan
 */
public class Prolab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
       Arayüz pencere=new Arayüz();
       pencere.setSize(1080, 720);
       int ctrl=1;
       int uzunluk;
       int motor=0;
       int hiz=0;
       int yuk=0;
        int Sayac=0;
        int Sayi;
        String hareketli = " ";
        String hareketsiz=" ";
        int s1=0,s2=0,s3=0,s4=0,s5=0,s6=0;
        Tekerlekli r1[]=new Tekerlekli[5];
        Paletli r2[]=new Paletli[5];
        Spider r3[]=new Spider[5];
        Paralel r4[]=new Paralel[5];
        Seri    r5[]=new Seri[5];
        Hibrit  r6[]=new Hibrit[5];
        int [][] RobotList=new int[10][2];
        int index=0;
        System.out.println("Kac tane robot türü secmek istersiniz?: ");
       
        int robot_sayisi=scan.nextInt();
        
        String [] Robot=new String[robot_sayisi];
        for (int i = 0; i < robot_sayisi;i++) {
        System.out.println("Robot türü seciniz:");
        String b=scan.next();
        
        if(b.equals("Tekerlekli")){
            r1[s1]=new Tekerlekli();
           r1[s1].setTür("Tekerlekli");
            System.out.println("Tekerlekli robot icin gezinme hizi giriniz(en fazla 80): ");
            hiz=scan.nextInt();
            if(hiz>80){
                while(ctrl==1){
                System.out.println("Tekerlekli robot 80 den yuksek hizla gidemez lutfen tekrar deger giriniz: ");
                hiz=scan.nextInt();
                if(hiz<81){
                    ctrl=0;
                }
                }
            }
           r1[s1].setGezinmeHizi(hiz);
            System.out.println("Motor sayısı giriniz:");
            motor=scan.nextInt();
            r1[s1].setMotor(motor);
           
            System.out.println("Tekerlek sayisi giriniz:");
            Sayi=scan.nextInt();
            r1[s1].setTekerlek(Sayi);
            System.out.println("Yuk miktarını giriniz:");
            yuk=scan.nextInt();
            r1[s1].setYuk(yuk);
            r1[s1].EngelGecmeSuresiBul();
            RobotList[index][0]=1;
            RobotList[index][1]=s1;
            s1++;
            index++;
                
        }
   
        if(b.equals("Paletli")){

          r2[s2]=new Paletli();
             System.out.println("Paletli robot icin gezinme hizi giriniz(en fazla 60): ");
            hiz=scan.nextInt();
            if(hiz>60){
                while(ctrl==1){
                System.out.println("Paletli robot 60 tan yuksek hizla gidemez lutfen tekrar deger giriniz: ");
                hiz=scan.nextInt();
                if(hiz<61){
                    ctrl=0;
                }
                }
            }      
            r2[s2].setGezinmeHizi(hiz);
            System.out.println("Motor sayısı giriniz:");
            motor=scan.nextInt();
            r2[s2].setMotor(motor);
            System.out.println("Palet sayısı giriniz:");
            Sayi=scan.nextInt();
            r2[s2].setPalet(Sayi);
            System.out.println("Yük miktarını giriniz:");
            yuk=scan.nextInt();
            r2[s2].setYuk(yuk);
            r2[s2].EngelGecmeSuresiBul();
            RobotList[index][0]=2;
            RobotList[index][1]=s2;
            index++;
         s2++;
        }
        if(b.equals("Spider")){
          r3[s3]=new Spider();
          r3[s3].setTür("Spider");
            System.out.println("Spider robot icin gezinme hizi giriniz(en fazla 40): ");
            hiz=scan.nextInt();
            if(hiz>40){
                while(ctrl==1){
                System.out.println("Spider robot 40 tan yuksek hizla gidemez lutfen tekrar deger giriniz: ");
                hiz=scan.nextInt();
                if(hiz<41){
                    ctrl=0;
                }
                }
            }
            r3[s3].setGezinmeHizi(hiz);
            System.out.println("Motor sayısı giriniz:");
            motor=scan.nextInt();
            r3[s3].setMotor(motor);
            System.out.println("Bacak sayısını giriniz:");
            Sayi=scan.nextInt();
            r3[s3].setBacak(Sayi);
            System.out.println("Yük miktarını giriniz:");
            yuk=scan.nextInt();
            r3[s3].setYuk(yuk);
            RobotList[index][0]=3;
            RobotList[index][1]=s3;
            s3++;
            index++;
        }
        if(b.equals("Seri")){
            r5[s5]=new Seri();
            r5[s5].setTür("Seri");
            System.out.println("Seri robot icin tasima hizi giriniz(en fazla 20): ");
            hiz=scan.nextInt();
            if(hiz>20){
                while(ctrl==1){
                System.out.println("Seri robot 20 den yuksek hizla tasiyamaz lutfen tekrar deger giriniz: ");
                hiz=scan.nextInt();
                if(hiz<21){
                    ctrl=0;
                }
                }
            }
            r5[s5].setTasimaHizi(hiz);
            
            ctrl=1;
            r5[s5].setKapasite(15);
            System.out.println("Seri robot yuk miktari giriniz(en fazla 15): ");
            yuk=scan.nextInt();
            if(yuk>r5[s5].getKapasite()){
                while(ctrl==1){
                System.out.println("Seri robot 15 kg dan fazla yuk tasiyamaz lutfen tekrar deger giriniz: ");
                yuk=scan.nextInt();
                if(yuk<16){
                    ctrl=0;
                }
                }
            }
            r5[s5].setYuk(yuk);
            System.out.println("Motor sayısını giriniz:");
            motor=scan.nextInt();
            r5[s5].setMotor(motor);
            System.out.println("Kol uzunluğunu giriniz:");
            uzunluk=scan.nextInt();
            r5[s5].setUzunluk(uzunluk);
            RobotList[index][0]=5;
            RobotList[index][1]=s5;
            index++;
            s5++;
        }
        if(b.equals("Paralel")){
            r4[s4]=new Paralel();
            System.out.println("Paralel robot icin tasima hizi giriniz(en fazla 30): ");
            hiz=scan.nextInt();
            if(hiz>30){
                while(ctrl==1){
                System.out.println("Paralel robot 30 dan yuksek hizla tasiyamaz lutfen tekrar deger giriniz: ");
                hiz=scan.nextInt();
                if(hiz<31){
                    ctrl=0;
                }
                }
            }
            r4[s4].setTasimaHizi(hiz);
            ctrl=1;
            r4[s4].setKapasite(35);
            System.out.println("Paralel robot icin yuk miktari giriniz(en fazla 35): ");
            yuk=scan.nextInt();
            if(yuk>r4[s4].getKapasite()){
                while(ctrl==1){
                System.out.println("Paralel robot 35 kg dan fazla yuk tasiyamaz lutfen tekrar deger giriniz: ");
                yuk=scan.nextInt();
                if(yuk<36){
                    ctrl=0;
                }
                }
            }
            r4[s4].setYuk(yuk);
            System.out.println("Motor sayısı giriniz:");
            motor=scan.nextInt();
            r4[s4].setMotor(motor);
            System.out.println("Kol uzunluğunu giriniz:");
            uzunluk=scan.nextInt();
            r4[s4].setUzunluk(uzunluk);
            RobotList[index][0]=4;
            RobotList[index][1]=s4;
            index++;
            s4++;
           
        }
        if(b.equals("Hibrit")){
           r6[s6]=new Hibrit();
            System.out.println("Robotun hareketli kısmı nasıl olacak?(Tekerlekli,Paralel,Spider)");
            hareketli=scan.next();
            System.out.println("Robotun hareketsiz kısmı nasıl olacak?(Paletli,Seri)");
            hareketsiz=scan.next();
            if(hareketli.equals("Tekerlekli")){
                System.out.println("Tekerlek sayisi giriniz:");
            }
            if(hareketli.equals("Paletli")){
                System.out.println("Palet sayisi giriniz:");
            }
            if(hareketli.equals("Spider")){
                System.out.println("Bacak sayisi giriniz:");
            }
            Sayi=scan.nextInt();
            r6[s6].setSayi(Sayi);
            System.out.println("Hızını giriniz");
            int hizH=100;
            if(hareketli.equals("Tekerlekli")){
                while(hizH>80){
                    hizH=scan.nextInt();
                    r6[s6].setGezinmeHizi(hizH);
                }
            }
            if(hareketli.equals("Paletli")){
                while(hizH>60){
                    hizH=scan.nextInt();
                    r6[s6].setGezinmeHizi(hizH);
                }
            }
            if(hareketli.equals("Spider")){
                while(hizH>40){
                    hizH=scan.nextInt();
                    r6[s6].setGezinmeHizi(hizH);
                }
            }
            System.out.println("Yük miktarını giriniz:");
            int yükH=100;
            if(hareketsiz.equals("Seri")){
                while(yükH>15){
                    yükH=scan.nextInt();
                    r6[s6].setYuk(yükH);
                }
            }
            if(hareketsiz.equals("Paralel")){
                while(yükH>35){
                    yükH=scan.nextInt();
                    r6[s6].setYuk(yükH);
                }
            }            
            System.out.println("Motor sayisinı giriniz:");
            motor=scan.nextInt();
            r6[s6].setMotor(motor);
            System.out.println("Kol uzunluğunu giriniz:");
            uzunluk=scan.nextInt();
            r6[s6].setUzunluk(uzunluk);
            System.out.println("Kol hızını giriniz:");
            hiz=100;
            if(hareketsiz.equals("Paralel")){
                while(hiz>30){
                    hiz=scan.nextInt();
                    r6[s6].setTasimaHizi(hiz);
                }
            }
            if(hareketsiz.equals("Seri")){
                while(hiz>15){
                    hiz=scan.nextInt();
                    r6[s6].setTasimaHizi(hiz);
                }
            }
            System.out.println("Sabitlenme süresi giriniz:");
            int sabit=scan.nextInt();
            r6[s6].setSabitlenme(sabit);
            System.out.println("Kola yükleme süresini giriniz:");
            int Yukleme=scan.nextInt();
            r6[s6].setYukleme(Yukleme);
            RobotList[index][0]=6;
            RobotList[index][1]=s6;
            s6++;
        }
        }
         int count=0;
         int []rand=new int[10];
        int i=0,secim=11;
        int ctrlR=1;
        while(ctrlR==1){
        while(secim>index){
        System.out.println("Robot seç");
            for (int j = 0; j <index; j++) {
                System.out.print((j+1)+". ");
               if(RobotList[j][0]==1){
                   System.out.println("Tekerlekli"+RobotList[j][1]);
               }
                 if(RobotList[j][0]==2){
                   System.out.println("Paletli"+RobotList[j][1]);
               }
                   if(RobotList[j][0]==3){
                   System.out.println("Spider"+RobotList[j][1]);
               }
                    if(RobotList[j][0]==4){
                   System.out.println("Paralel"+RobotList[j][1]);
               }
                if(RobotList[j][0]==5){
                System.out.println("Seri"+RobotList[j][1]);
               }
                if(RobotList[j][0]==6){
                     System.out.println("Hibrit"+RobotList[j][1]);
                }
      
            }
                secim=scan.nextInt();
        } 
             secim--;
           
            if(RobotList[secim][0]==1){
                pencere.setEngelGecmeSuresi(r1[RobotList[secim][1]].EngelGecmeSuresiBul());
                pencere.setHiz(r1[RobotList[secim][1]].getGezinmehizi());
                pencere.setTür("Tekerlekli");
            }
            if(RobotList[secim][0]==2){
                pencere.setEngelGecmeSuresi(r2[RobotList[secim][1]].EngelGecmeSuresiBul());
                pencere.setHiz(r2[RobotList[secim][1]].getGezinmehizi());
                pencere.setTür("Paletli");
            }
            if(RobotList[secim][0]==3){
                pencere.setHiz(r3[RobotList[secim][1]].getGezinmehizi());
                pencere.setTür("Spider");
            }
            if(RobotList[secim][0]==5){
                pencere.setYük(r5[RobotList[secim][1]].getYuk());
                pencere.setKolHızı(r5[RobotList[secim][1]].getTasimaHizi());
                 pencere.setKolUzunlugu(r5[RobotList[secim][1]].getUzunluk());
                pencere.setTür("Seri");
            }
             if(RobotList[secim][0]==4){
                pencere.setYük(r4[RobotList[secim][1]].getYuk());
                pencere.setKolHızı(r4[RobotList[secim][1]].getTasimaHizi());
                 pencere.setKolUzunlugu(r4[RobotList[secim][1]].getUzunluk());
                pencere.setTür("Paralel");
            }
        System.out.println("Baslangıc noktası icin x degeri:");
        int x=scan.nextInt();
        System.out.println("Baslangıc noktası icin y degeri:");
        int y=scan.nextInt();
        pencere.setK(x, y);
        rand[count]=0;
        while(rand[count]==0){
             pencere.setVisible(true);
            rand[count]=pencere.getA();
        }
        pencere.setA(0);
        count++;
        System.out.println("Sonlandırmak için 1'e basiniz");
        int son=scan.nextInt();
        if(son==1){
            pencere.setVisible(false);
        }
        System.out.println("Baska robot girmek ister misiniz?(evet 1 hayır 0");
           ctrlR=scan.nextInt();
           secim=11;
        }
            
    }
    
}

