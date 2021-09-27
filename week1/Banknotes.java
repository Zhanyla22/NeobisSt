import java.io.IOException;
import java.util.*;

public class Banknotes{

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int[] newArr = {100, 50, 20, 10, 5, 2, 1};
        int cupura;

        System.out.println(number);

        for (int i = 0; i < newArr.length; i++) {
            cupura = number / newArr[i];
            System.out.println(cupura + " nota(s) de R$ " + newArr[i] + ",00");
            number = number % newArr[i];
        }
    }
}