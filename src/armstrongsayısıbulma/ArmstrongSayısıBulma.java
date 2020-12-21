package armstrongsayısıbulma;

import java.util.Scanner;
import java.lang.Math;

public class ArmstrongSayısıBulma {

    public static void main(String[] args) {
        
          /*
        Girilen bir sayının armstrong sayısını olup olmadığını bulmaya çalışın.
        Örneğin, 4 basamaklı bir sayının armstrong sayısı olması için şu şartı sağlaması gerekmektedir.
        1634 = 1^4 + 6^4 + 3^4 + 4^4 (Buradaki 4 basamak sayısı)
        371 = 3^3 + 7^3 + 1^3 (Buradaki 3 basamak sayısı)
    
        Bu programı do while döngüsü yardımıyla yapabilirsiniz.
        */
          
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı girin :");
        int sayi = scanner.nextInt();
        System.out.print("basamak sayısını girin :");
        int basamak_sayisi = scanner.nextInt();

        int geçici_sayı = sayi;
        int toplam = 0;
        int basamak_degeri;
        do {
            basamak_degeri = geçici_sayı % 10;
            toplam += Math.pow(basamak_degeri, basamak_sayisi);
            geçici_sayı = geçici_sayı / 10;

        } while (geçici_sayı > 0);

        if (toplam == sayi) {
            System.out.println("Bu sayı Armstrong sayisidir.");
        }else{
            System.out.println("Bu sayi armstrong sayisi değildir.");
        }

    }

}


