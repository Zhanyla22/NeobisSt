import java.io.IOException;
import java.util.*;
public class PrimeNumber {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x;
        int count;
        for (int i = 0; i < n; i++) {
            count = 0;
            x = sc.nextInt();
            for (int j = 2; j < x; j++) {
                if (x % j == 0) count++;
            }
            if (count == 0) System.out.println(x + " eh primo");
            else System.out.println(x + " nao eh primo");
        }
    }
}