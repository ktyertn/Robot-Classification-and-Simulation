/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prolab3;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;
import javax.swing.JFrame;

/**
 *
 * @author Epwl
 */
public class Arayüz extends JFrame {
    private int x=20;
    private int y=20;
    private String Tür;
    private int x1;
    private int y1;
    private double Motor;
    private double EngelGecmeSuresi;
  //  private double sure=0;
    private int a=0;
    Scanner scan=new Scanner(System.in);
    private double Hiz;
    private double Yük;
    private double KolHızı;
    private double Uzunluk;
    private int Sabitlenme;
    private double TasimaHizi;
   public  void setKolHızı(double tasimaHizi) {
        this.KolHızı=tasimaHizi;
    }
     public  void setKolUzunlugu(double uzunluk) {
       this.Uzunluk=uzunluk;
    }
    public void setTasimaHizi(double tasimaHizi) {
        this.TasimaHizi=tasimaHizi;
    }
    public void setA(int a){
        this.a=a;
    }
    public int getA(){
        return a;
                }
    public void setYük(double Yük){
        this.Yük=Yük;
    }
    public void setK(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void setEngelGecmeSuresi(double EngelGecmeSuresi){
        this.EngelGecmeSuresi=EngelGecmeSuresi;
    }
    public void setMotor(int Motor){
        this.Motor=Motor;
    }
    public void setEngelK(int x,int y){
        this.x1=x;
        this.y1=y;
    }
    public void setTür(String Tür){
        this.Tür=Tür;
    }
    public void setHiz(double hiz){
        this.Hiz=hiz;
    }
    public void setSabitlenme(int sabitlenme){
        this.Sabitlenme=sabitlenme;
    }
    @Override
    public void paint(Graphics g){
      
       super.paint(g);
       this.a=0;
       g.setColor(Color.white);
       g.fillRect(200, 75, 600, 600);
       int i=200,j=75;
       g.drawRect(200, 75,600, 600);
       g.setColor(Color.black);
      while(i<=800){
        g.drawLine(i, 75, i,675);
        g.drawLine(200,j,800,j);
        i+=30;
        j+=30;
    } 
      g.setColor(Color.blue);
      
      g.fillOval(206+((x-1)*30),81+((y-1)*30), 20,20);
      int bx=206+((x-1)*30);
      int by=81+((y-1)*30);
      g.setColor(Color.red);
      if(Tür.equals("Tekerlekli")||Tür.equals("Paletli")||Tür.equals("Spider")){
      System.out.println("Kaç tane engel girmek istersiniz:");
        int eng=scan.nextInt();
        int []Engel=new int[(eng*2)];
        int x1,y1,sayacE=0;
        for (int k = 0; k < eng; k++) {
            System.out.println((k+1)+".Engel x:");
            x1=scan.nextInt();
            Engel[sayacE]=206+((x1-1)*30);
            sayacE++;
            System.out.println((k+1)+".Engel y:");
            y1=scan.nextInt();
            Engel[sayacE]=81+((y1-1)*30);
            sayacE++;
            g.fillRect(200+((x1-1)*30), 75+((y1-1)*30), 30, 30);
        }
        int ctrl=1;
        double sure=0;
        while(ctrl==1){
            
            System.out.println("Yatayda hareket için 1'e dikeyde hareket için 2'ye basiniz");
            int duzlem=scan.nextInt();
            if(duzlem==1){
                System.out.println("Sağa gitmek için negatif, sola gitmek için pozitfi değer giriniz");
            int hareket=scan.nextInt();
            if(hareket>0){
                if(bx+(hareket*30)>800){
                    System.out.println("Mazgaldan dışarı çıktınız");
                }
                else{
                g.setColor(Color.gray);
                g.fillOval(bx, by, 20, 20);
                g.setColor(Color.blue);
                if(Tür.equals("Tekerlekli")||Tür.equals("Paletli")){
                    for(int l=1;l<=hareket;l++){
                    for (int k = 0; k < Engel.length; k+=2) {
                        if(bx+(l*30)==Engel[k]&&by==Engel[k+1]){
                            hareket++;
                            sure+=EngelGecmeSuresi-(10/Hiz);
                           
                        }
                    }
                    }
                }
                if(Tür.equals("Spider")){
                    for(int l=1;l<=hareket;l++){
                    for (int k = 0; k < Engel.length; k+=2) {
                        if(bx+(l*30)==Engel[k]&&by==Engel[k+1]){
                            hareket=l-1;
                        }
                    }
                }
                }
                g.fillOval(bx+(hareket*30), by, 20, 20);
                sure+=(double)hareket*10/Hiz;
             
                bx=bx+(hareket*30);
                }
            }
            if(hareket<0){
                if(bx+(hareket*30)<200){
                    System.out.println("Mazgaldan çıktınız");
                }
                else{
                g.setColor(Color.gray);
                g.fillOval(bx, by, 20, 20);
                g.setColor(Color.blue);
                 if(Tür.equals("Tekerlekli")||Tür.equals("Paletli")){
                    for(int l=-1;hareket<=l;l--){
                    for (int k = 0; k < Engel.length; k+=2) {
                        if(bx+(l*30)==Engel[k]&&by==Engel[k+1]){
                            hareket--;
                            sure+=EngelGecmeSuresi-(10/Hiz);

                        }
                    }
                    }
                }
                if(Tür.equals("Spider")){
                    for(int l=1;l<=hareket;l++){
                    for (int k = 0; k < Engel.length; k+=2) {
                        if(bx+(l*30)==Engel[k]&&by==Engel[k+1]){
                            hareket=l+1;
                        }
                    }
                }
                }
                g.fillOval(bx+(hareket*30), by, 20, 20);
                sure+=(double)-1*hareket*10/Hiz;

                bx=bx+(hareket*30);
            }
            }
            }
             if(duzlem==2){
             System.out.println("Geri gitmek için negatf,ileri gitmek için pozitif değer giriniz:");
            int hareket=scan.nextInt();
            if(hareket>0){
                if(by+(hareket*30)>675){
                    System.out.println("Mazgaldan çıktınız.");
                }
                else{
                g.setColor(Color.gray);
                g.fillOval(bx, by, 20, 20);
                g.setColor(Color.blue);
                 if(Tür.equals("Tekerlekli")||Tür.equals("Paletli")){
                    for(int l=1;l<=hareket;l++){
                    for (int k = 0; k < Engel.length; k+=2) {
                        if(bx==Engel[k]&&by+(l*30)==Engel[k+1]){
                            hareket++;
                            sure+=EngelGecmeSuresi-(10/Hiz);
                            System.out.println(sure);                        
                        }
                    }
                  }
                }
                if(Tür.equals("Spider")){
                    for(int l=1;l<=hareket;l++){
                    for (int k = 0; k < Engel.length; k+=2) {
                        if(bx==Engel[k]&&by+(l*30)==Engel[k+1]){
                            hareket=l-1;
                        }
                    }
                }
                }
                g.fillOval(bx, by+(hareket*30), 20, 20);
                sure+=(double)hareket*10/Hiz;

                by=by+(hareket*30);
                }
            }
            if(hareket<0){
                if(by+(hareket*30)<75){
                    System.out.println("Mazgaldan çıktınız.");
                }
                else{
                g.setColor(Color.gray);
                g.fillOval(bx, by, 20, 20);
                g.setColor(Color.blue);
                 if(Tür.equals("Tekerlekli")||Tür.equals("Paletli")){
                    for(int l=-1;hareket<=l;l--){
                    for (int k = 0; k < Engel.length; k+=2) {
                        if(bx==Engel[k]&&by+(l*30)==Engel[k+1]){
                            hareket--;
                            sure+=EngelGecmeSuresi-(10/Hiz);

                        }
                    }
                    }
                }
                if(Tür.equals("Spider")){
                    for(int l=-1;hareket<=l;l--){
                    for (int k = 0; k < Engel.length; k+=2) {
                        if(bx+(l*30)==Engel[k]&&by==Engel[k+1]){
                            hareket=l+1;
                        }
                    }
                }
                }
                g.fillOval(bx, by+(hareket*30), 20, 20);
                sure+=(double)-1*hareket*10/Hiz;

                by=by+(hareket*30);
            }
            }
            }
            System.out.println("Harekete devam etmek için 1'e basınız:");
            ctrl=scan.nextInt();
        }
         this.a=1;
        System.out.println(sure);
        sure=0;
           
            }
       
      if(Tür.equals("Paralel")||Tür.equals("Seri")){
       g.setColor(Color.blue);
      int hareket;
      int sure=0;
      int yols=0;
      g.fillOval(206+((x-1)*30),81+((y-1)*30), 20,20);
      int ctrl=1;
    while(ctrl==1){
         
        System.out.println("Yükü yatayda tasimak icin 1'e dikeyde taşımak için 2'ye basınız:");
          int düzlem=scan.nextInt();
          if(düzlem==1){
              System.out.println("Yükü Sağa taşımak için negatif sola taşımak için pozitif değer giriniz:");
             hareket=scan.nextInt();
             yols+=Math.abs(hareket);
             if(hareket<0){
                 if(bx+(hareket*30)<200){
                     System.out.println("Mazgaldan çıktınız");
                 }
                 else{
                 g.setColor(Color.MAGENTA);
                g.fillOval(bx+(hareket*30), by, 20, 20);
                sure+=(double)-1*hareket*10/KolHızı;
                 g.setColor(Color.gray);
                g.fillOval(bx, by, 20, 20);
                bx=bx+(hareket*30);
                 }
             }
             if(hareket>0){
                 if(bx+(hareket+30)>800){
                     System.out.println("Mazgaldan çıktınız");
                 }
                 else{
                  g.setColor(Color.gray);
                g.fillOval(bx, by, 20, 20);
                 g.setColor(Color.MAGENTA);
                g.fillOval(bx+(hareket*30), by, 20, 20);
                sure+=(double)hareket*10/KolHızı;
                bx=bx+(hareket*30);
                    }
                 }
          }
          if(düzlem==2){
               System.out.println("Yüküs geri taşımak için negatif ileri taşımak için pozitif değer giriniz:");
                hareket=scan.nextInt();
                yols+=Math.abs(hareket);
              if(hareket<0){
                  if(by+(hareket*30)<75){
                      System.out.println("Mazgaldan çıktınız");
                  }
                  else{
                  g.setColor(Color.gray);
                g.fillOval(bx, by, 20, 20);
                 g.setColor(Color.MAGENTA);
                g.fillOval(bx, by+(hareket*30), 20, 20);
                sure+=(double)-1*hareket*10/KolHızı;
                by=by+(hareket*30);
                  }
              }
              if(hareket>0){
                  if(by+(hareket*30)>675){
                      System.out.println("Mazgaldan çıktınız");
                  }
                  else{
                  g.setColor(Color.gray);
                g.fillOval(bx, by, 20, 20);
                 g.setColor(Color.MAGENTA);
                g.fillOval(bx, by+(hareket*30), 20, 20);
                sure+=(double)hareket*10/KolHızı;
                by=by+(hareket*30);
                    }
                  }
          }
            yols=yols*10;
           if(yols>Uzunluk){
          System.out.println("Kol uzunluğu yetersizdir");
      }
      else{
          System.out.println(sure);

   }
     System.out.println("Harekete devam etmek için 1'e basınız:");
      ctrl=scan.nextInt();
      this.a=1;
    
     
      }
      
        sure=0;
      }
      if(Tür.equals("Hibrit")){
          
      }
      }

    void setYuklenme(int yukleme) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
     
   
}

