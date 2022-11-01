import java.util.Scanner;

//yarıçapı kullanıcıdan
public class daireAlaniveCevresi {
    public static void main(String[] args) {
        //alan formülü: pi*r*r
        //çevre formülü: 2*pi*r

        int yaricap;
        double pi = 3.14, alan, cevre;
        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz: ");
        yaricap = input.nextInt();

        alan = pi * yaricap * yaricap;
        cevre = 2 * pi * yaricap;
        System.out.println("Dairenin alanı: " + alan);
        System.out.println("Dairenin çevresi: " + cevre);


    }
}
