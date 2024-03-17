public class PersegiPanjang extends BangunDatar{
    PersegiPanjang(int p, int l) {
        super(p,l);
    }
   
    int getLuas() {
        int p = super.getP();
        int l = super.getL();
        return p*l;

    }

    int getKeliling(){
        int p = super.getP();
        int l = super.getL();
        return 2*(p+l);
    }

///@overide
public String toString() {
    return "Luas :" + getLuas() + "\n" + "keliling: " + getKeliling();

}
//@overide

void info( ){
    System.out.println("Panjang persegi panjang" + super.getP());
    System.out.println("Lebar persegi panjang" + super.getL());
}

}
