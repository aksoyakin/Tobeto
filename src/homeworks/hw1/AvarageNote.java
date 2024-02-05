package homeworks.hw1;

import java.util.Scanner;

public class AvarageNote {
    public static void main(String[] args) {
        /*
         * kullanıcıdan öğrenci sayısını isteyen her öğrenci için
         * öğrenci adı,öğrenci soyadı,1.sınav notu,2.sınav notu,3.sınav notu
         * isteyen ve daha sonra not ortalamasını hesaplayıp
         * ekrana yazdıran algoritma yapınız.(For döngüsü kullanınız)
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** NOT ORTALAMASI HESAPLAMA PROGRAMI'NA HOŞGELDİNİZ ***");

        System.out.print("Sınıfınızda kaç öğrenci var? => ");
        int numberOfStudents = scanner.nextInt();

        int totalAvarage = getInfo(numberOfStudents);
        System.out.println("Sınıf ortalaması: " + totalAvarage);
    }
    public static int getInfo(int numberOfStudents){
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        for (int i = 1; i <= numberOfStudents; i++){
            System.out.print("Lütfen öğrencinin adını yazınız: ");
            String name = scanner.next();
            System.out.print("Lütfen öğrencinin soyadını yazınız: ");
            String surname = scanner.next();
            System.out.print("Lütfen öğrencinin 1. notunu giriniz: ");
            int examNote1 = scanner.nextInt();
            System.out.print("Lütfen öğrencinin 2. notunu giriniz: ");
            int examNote2 = scanner.nextInt();
            System.out.print("Lütfen öğrencinin 3. notunu giriniz: ");
            int examNote3 = scanner.nextInt();

            int avarage = calculateStudentAvarage(examNote1,examNote2,examNote3);
            System.out.println("Öğrencinin ortalaması: " + avarage);

            counter += avarage;
        }
        return calculateClassAvarage(counter,numberOfStudents);
    }
    public static int calculateStudentAvarage(int examNote1, int examNote2, int examNote3){
        return (examNote1 + examNote2 + examNote3) / 3;
    }
    public static int calculateClassAvarage(int totalNotes, int numberOfStudents){
        return totalNotes / numberOfStudents;
    }
}
