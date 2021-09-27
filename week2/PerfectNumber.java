import java.io.IOException;
import java.util.*;
public class PerfectNumber{

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n;
        for (int j = 0; j < x; j++) {
            int count = 0;
            n = sc.nextInt();
            for (int i = 1; i <= n / 2; i++) {

                if (n % i == 0) {
                    count += i;
                }
            }
            if (count == n) {
                System.out.println(n + " eh perfeito");
            } else {
                System.out.println(n + " nao eh perfeito");

            }
        }
    }

}