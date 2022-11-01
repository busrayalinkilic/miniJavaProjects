import java.util.Scanner;

public class ucgenAlani {
    public static void main(String[] args) {
        int a, b, c, cevre;
        double alan, u;
        Scanner input = new Scanner(System.in);
        System.out.print("A kenarını giriniz: ");
        a = input.nextInt();
        System.out.print("B kenarını giriniz: ");
        b = input.nextInt();
        System.out.print("C kenarını giriniz: ");
        c = input.nextInt();

        cevre = a + b + c;
        System.out.println("Üçgenin çevresi: " + cevre);

        u = cevre/2;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin alanı: " + alan);

    }
}
