public class BangunDatar {
    private int p, l, s;
 
     BangunDatar(int s) {
         this.s = s;
         
     }
 
     BangunDatar(int p, int l) {
         this.p = p;
         this.l = l;
     }
 
     void setBangunDatar(int s){
         this.s = s;
     }
     void setBangunDatar(int p, int l){
         this.p = p;
         this.l = l;
     }
 
     int getS(){
         return s;
     }
     int getP(){
         return p;
     }
     int getL(){
         return l;
     }
 
     void info(){
         System.out.print("panjang"+ getS());
         ////tambahkan untuk yang p&l
     }
 }
