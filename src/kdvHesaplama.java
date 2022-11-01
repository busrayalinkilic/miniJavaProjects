import java.util.Scanner;

public class kdvHesaplama {
    public static void main(String[] args) {
        double kdv = 0.18, kdv2 = 0.8, para;

        Scanner input = new Scanner(System.in);
        System.out.print("Kdv'siz Fiyat:");
        para = input.nextDouble();


        double toplamKdv = (para <= 1000) ? para * kdv : para * kdv2;
        double toplam = para + toplamKdv;
        System.out.println("Toplam Kdv: " + toplamKdv);
        System.out.println("Kdv'li Fiyat: " + toplam);


    }
}
