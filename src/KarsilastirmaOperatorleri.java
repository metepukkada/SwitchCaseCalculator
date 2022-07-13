import java.util.Scanner;

public class KarsilastirmaOperatorleri {
    public static void main(String[] args) {
        double n1, n2;
        int option;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz: ");
        n1 = input.nextDouble();
        System.out.print("İkinci Sayıyı Giriniz: ");
        n2 = input.nextDouble();
        System.out.print("Yapmak İstediğiniz İşlemi Seçiniz: ");
        System.out.println("\n1 - Toplama\n2 - Çıkarma\n3 - Çarpma\n4 - Bölme");
        option = input.nextInt();
        switch (option) {
            case 1 -> System.out.println("Sonucunuz: " + (n1 + n2));
            case 2 -> System.out.println("Sonucunuz: " + (n1 - n2));
            case 3 -> System.out.println("Sonucunuz: " + (n1 * n2));
            case 4 -> {
                if (n2 != 0) {
                    System.out.println("Sonucunuz: " + (n1 / n2));
                }
                    else System.out.println("Bir Sayı 0'a Bölüenemez! ");
            }
            default -> System.out.println("Yanlış Bir Rakam Girdiniz.");
        }
    }
}