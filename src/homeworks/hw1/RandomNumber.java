package homeworks.hw1;

import java.util.Scanner;

public class RandomNumber {

    /*
    3/4-Kullanıcının 1 ile 10 arasında rastgele bir sayıyı tahmin etmesini isteyen
    ve doğru tahmin edene kadar devam eden bir program yazınız.
    (While döngüsü ile yapınız ve rastgele sayı üretmek için Random sınıfını kullanınız)
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***** Find the random number! *****");
        System.out.println("Please write a number between 1 and 10.");

        int random = (int)((Math.random() * 10) + 1);

        while(true){
            int input = scanner.nextInt();

            if(input >= 1 && input <= 10){
                if(input == random){
                    System.out.println("You find the right number. Congrats!");
                    break;
                }else{
                    System.out.println("Your number: " + input);
                    System.out.println("Your number is not the true number!");
                    System.out.println("Please try again.");
                }
            }else{
                System.out.println("Please enter a valid number...");
                System.out.println("Please try again.");
            }
        }
    }
}

