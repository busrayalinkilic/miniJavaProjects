import java.util.Scanner;

public class hipotenusBulma {
    public static void main(String[] args) {
        //formül: a^2+b^2=c^2
        int a, b;
        double c;
        Scanner deger = new Scanner(System.in);
        System.out.print("A kenarını giriniz: ");
        a = deger.nextInt();
        System.out.print("B kenarını giriniz: ");
        b = deger.nextInt();
        double hipotenus = a * a + b * b;
        c = Math.sqrt(hipotenus);
        System.out.println("Hipotenüs: " + c);

    }


}
