package homeworks.hw1;

import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        System.out.println(" *** Welcome to the Java Store ***");
        System.out.println("Our product are listed in below: ");
        System.out.println("1- T-shirts");
        System.out.println("2- Jeans");
        System.out.println("3- Socks");

        System.out.println("Please enter the number that you want to buy:");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();


        System.out.println("Kaç adet almak istiyorsunuz?");
        int quantity = scanner.nextInt();
        whichProduct(input, quantity);
    }

    /*
    1- Switch case ile müşteriden alınan sipariş numarasına göre
    hangi ürünün sipariş edildiğini belirleyen algoritma yazınız.
    Input için Scanner kullanınız
     */
    public static void whichProduct(int input, int quantity) {
        switch (input) {
            case 1:
                int TshirtPrice = 200;
                System.out.println("You bought a t-shirt.");
                calculatePrice(quantity, TshirtPrice);
                break;
            case 2:
                int jeanPrice = 250;
                System.out.println("You bought a jean.");
                calculatePrice(quantity,jeanPrice);
                break;
            case 3:
                int sockPrice = 100;
                System.out.println("You bought a sock");
                calculatePrice(quantity,sockPrice);
                break;
            default:
                System.out.println("Please enter the right number!");
        }
    }

    /*
    2- kullanıcıdan kaç ürün almak istediğini soran,
    her ürünün fiyatını alarak toplam alışveriş tutarını hesaplayan
    bir algoritma yazınız.(Input için Scanner ve döngü için for döngüsü kullanınız)
     */
    public static void calculatePrice(int quantity, int price) {
        int totalPrice = 0;
        for (int i = 0; i <= quantity; i++) {
            totalPrice = quantity * price;
        }
        System.out.println(totalPrice);
    }
}
