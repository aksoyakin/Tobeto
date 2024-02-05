package homeworks.hw1;

import java.util.Scanner;

public class PerfectNumber {
        /*
        Mükemmel Sayı Nedir?
        Bir sayının kendisi hariç pozitif tam sayı çarpanları
        (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir
         */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number!");
        int inputNumber = scanner.nextInt();

        int totalNumber = 0;

        for (int i = 1; i < inputNumber; i++) {
            if (inputNumber % i == 0){
                totalNumber += i;
            }
        }

        if(totalNumber == inputNumber){
            System.out.println("Your number is " + inputNumber + " perfect!");
        }else{
            System.out.println("Your number is " + inputNumber + " not perfect!");
        }
    }
}

