package homeworks.hw1;

import java.util.Scanner;

public class DiscountCalculator {
    /*
     iki ürünün kullanıcı tarafından
     fiyatı girildiğinde toplam fiyat 500 tl'den fazla ise 2.üründen %40 indirim
     yaparak ödenecek tutarı gösteren uygulamayı yazınız.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("İlk ürünün fiyatını giriniz: ");
        int firstPrice = scanner.nextInt();

        System.out.print("İkinci ürünün fiyatını giriniz: ");
        int secondPrice = scanner.nextInt();

        int totalPrice = firstPrice + secondPrice;
        if(totalPrice > 500){
            int discountPrice = (secondPrice / 100) * 40;
            secondPrice -= discountPrice;
            System.out.println();
            System.out.println("İkinci üründen %40 indirim kazandiniz.");
            System.out.println();
            System.out.println("İlk ürünün fiyatı: " + firstPrice);
            System.out.println("İkinci ürünün indirimli fiyatı: " + secondPrice);
            System.out.println();
            totalPrice = firstPrice + secondPrice;
            System.out.println("Toplam ödemeniz gereken tutar: " + totalPrice);
        }else{
            System.out.println();
            System.out.println("İlk ürünün fiyatı: " + firstPrice);
            System.out.println("İkinci ürünün fiyatı: " + secondPrice);
            System.out.println();
            System.out.println("Toplam ödemeniz gereken tutar: " + totalPrice);
        }
    }
}
