import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        int gidilenYol, acilisUcreti = 10;
        double perKm = 2.20, toplamUcret;
        Scanner input = new Scanner(System.in);
        System.out.print("Gidilen kilometreyi giriniz: ");
        gidilenYol = input.nextInt();

        toplamUcret = (gidilenYol * perKm) + acilisUcreti;

        toplamUcret = (toplamUcret<20) ? 20 : toplamUcret;
        System.out.println("Toplam ödenecek tutar: " + toplamUcret);

    }
}
