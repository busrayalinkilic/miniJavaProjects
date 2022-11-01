import java.util.Scanner;

public class daireDilimininAlani {
    public static void main(String[] args) {
        int r, aci;
        double pi = 3.14, dilimAlani;

        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını girin: ");
        r = input.nextInt();
        System.out.print("Dairenin merkez açı ölçüsünü girin: ");
        aci = input.nextInt();

        dilimAlani = (pi * (r * r) * aci) / 360;
        System.out.println("Daire diliminin alanı: " + dilimAlani);
    }
}
