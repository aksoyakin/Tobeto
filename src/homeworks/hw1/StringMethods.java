package homeworks.hw1;

public class StringMethods {
    /*
      String methodlarını araştırın ve örnek yapın.
    */
    public static void main(String[] args) {

        String string = "I love JAVA!";
        String ikinciStr = "I love Programming";
        String ucuncuStr = "I love JAVA!";

        //charAt => indexte hangi char var onu döndürür
        System.out.println(string.charAt(2));

        //length => stringin uzunluğunu verir
        //saymaya 1'den başlar
        //int döndürür!
        System.out.println(string.length());
        int length = string.length();
        System.out.println("length(): " + length);

        //indexOf => bir karakterin baştan konumunu verir
        //saymaya 0'dan başlar.
        //int döndürür
        System.out.println(string.indexOf('!'));
        int indexOf = string.indexOf("love");
        System.out.println("indexOf():"  + indexOf);

        //compareTo
        //ilk str'nin ikincisiyle kıyaslar ve farkını verir
        System.out.println(string.compareTo(ikinciStr));
        System.out.println(string.compareTo(ucuncuStr));

        //contains
        //ifadeyi içerip içermediğini sorgular
        //true ya da false döndürür
        System.out.println(string.contains("AV"));
        System.out.println(string.contains("asdasdasd"));

        //string sonunu kontrol eder
        //büyük küçük harfe dikkat et!!!
        System.out.println(string.endsWith("!"));
        System.out.println(string.endsWith("ppppp"));
        System.out.println(string.endsWith("VA!"));

        //replace
        //ifadeyi değiştirir
        System.out.println(string.replace("A","b"));

        //substring
        //3 ile 10 arasındaki stringi döndürdü
        System.out.println(string.substring(3,10));

        //toUpperCase
        //toLowerCase
        System.out.println(string.toUpperCase());
        System.out.println(string.toLowerCase());

        //concat
        //stringi birleştirir
        System.out.println(string.concat(ikinciStr));

        //trim
        //başta ve sondaki boşlukları kırpar
        String trimTest = "   Akin Aksoy    ";
        System.out.println(trimTest.trim());

    }
}
