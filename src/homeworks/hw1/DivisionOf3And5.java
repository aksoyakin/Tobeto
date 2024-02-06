package homeworks.hw1;

public class DivisionOf3And5 {
    /*
    1-200 arası içinde 3'e veya 5'e tam bölünebilen sayıları listeleyen ve
    kaç adet olduğunu yazdıran programı yazınız.
     */
    public static void main(String[] args) {

        int counter = 0;
        for(int i = 1; i <=200; i++){
            if (i % 3 == 0 || i % 5 == 0){
                counter ++;
                System.out.println(i);
            }
        }
        System.out.println("There is a total " + counter + " number can divide 3 or 5.");
    }

}
