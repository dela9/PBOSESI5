public class BujurSangkar extends BangunDatar {

    BujurSangkar(int s) {
        super(s);
    }
    int getLuas() {
        int s = super.getS();
        return s*s;

    }

    int getKeliling(){
        int s = super.getS();
        return 4*s;


    }
    ///@overide
    public String toString() {
        return "Luas :" + getLuas() + "\n" + "keliling: " + getKeliling();

    }
    //@overide

    void info( ){
        System.out.println("sisi bujung sangkar" + super.getS());
    }
}
