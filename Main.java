import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.BujurASangkar");
        System.out.println("2.PersegiPanjang");
        System.out.print("isikan pilihan");
        int pilihan = sc.nextInt();
    
        if(pilihan == 1){
            BujurSangkar bs = new BujurSangkar(4);
            System.out.println(bs);

        }
        if(pilihan == 2){
            PersegiPanjang pp = new PersegiPanjang(6,5);
            System.out.println(pp);

    }
}

}
