import java.util.Scanner;

public class manavKasa {
    public static void main(String[] args) {
        double toplamTutar, armut, elma, domates, muz, patlican;


        Scanner input = new Scanner(System.in);
        System.out.print("Armut kaç kilo? : ");
        armut = input.nextDouble();

        System.out.print("Elma kaç kilo? : ");
        elma = input.nextDouble();

        System.out.print("Domates kaç kilo? : ");
        domates = input.nextDouble();

        System.out.print("Muz kaç kilo? : ");
        muz = input.nextDouble();

        System.out.print("Patlıcan kaç kilo? : ");
        patlican = input.nextDouble();

        toplamTutar = (armut * 2.14) + (elma * 3.67) + (domates * 1.11) + (muz * 0.95) + (patlican * 5.00);
        System.out.println("Toplam Tutar: " + toplamTutar);

    }
}
