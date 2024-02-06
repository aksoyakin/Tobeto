package homeworks.hw1;

import java.util.Scanner;

public class ShoppingWithCargoFee {
    /*
    .netcilere verilen ödev
     Bir mağazada alınan ürünün fiyatı 300 tl üzerinde ise 50 tl olan kargo ücreti alınmamaktadır.
     ürünün fiyatı girildiğinde toplam ödemesi gereken tutarı gösteren programı yazınız.
     */

    public static void main(String[] args) {
        printProducts();

        System.out.print("Please enter the number that you want to buy: ");
        Scanner scanner = new Scanner(System.in);
        int productCode = scanner.nextInt();

        System.out.print("How many pcs you want to buy: ");
        int quantity = scanner.nextInt();

        selectProduct(productCode,quantity);
    }
    public static void printProducts(){
        System.out.println("Welcome to the Java Store!");
        System.out.println("Products:");
        System.out.println("1 - Tshirt");
        System.out.println("2 - Jeans");
        System.out.println("3 - Socks");
        System.out.println("4 - Jacket");
    }
    public static void selectProduct(int productCode, int quantity){
        int tshirtPrice = 200;
        int jeanPrice = 300;
        int sockPrice = 50;
        int jacketPrice = 600;

        switch(productCode){
            case 1:
                System.out.println("You bought " + quantity + " pcs tshirt.");
                calculatePrice(quantity,tshirtPrice);
                break;
            case 2:
                System.out.println("You bought " + quantity + " pcs jean.");
                calculatePrice(quantity,jeanPrice);
                break;
            case 3:
                System.out.println("You bought " + quantity + " pcs sock.");
                calculatePrice(quantity,sockPrice);
                break;
            case 4:
                System.out.println("You bought " + quantity + " pcs jacket.");
                calculatePrice(quantity, jacketPrice);
                break;
            default:
                System.out.println("Please enter a valid number.");
                break;
        }
    }
    public static void calculatePrice(int quantity, int price) {
        int totalPrice = 0;
        for (int i = 0; i <= quantity; i++) {
            totalPrice = quantity * price;
        }

        int cargoFee = 50;
        if(totalPrice < 300){
            System.out.println("Total product price: " + totalPrice);
            totalPrice += cargoFee;
            System.out.println("Shipment fee: " + cargoFee);
            System.out.println("You have to pay: " + totalPrice);
        }else{
            System.out.println("Total product price: " + totalPrice);
            System.out.println("There is no shipping fee for purchases of 300 TL or more.");
        }
    }
}
