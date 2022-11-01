import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {
        int a, b, select;
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        a = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        b = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz: ");
        select = input.nextInt();

        if (select == 1) {
            System.out.println(a + b);
        } else if (select==2) {
            System.out.println(a-b);
        } else if (select==3) {
            System.out.println(a*b);
        } else if (select==4) {
            System.out.println(a/b);
        }

    }


    }

