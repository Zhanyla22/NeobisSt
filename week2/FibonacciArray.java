import java.io.IOException;
import java.util.*;

public class FibonacciArray {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int x;
        int f;
        long fibbonaci[] = new long[61];
        x = sc.nextInt();

        fibbonaci[0] = 0;
        fibbonaci[1] = 1;
        for(int j = 2; j <= 60; j++){
            fibbonaci[j] = fibbonaci[j-2] + fibbonaci[j-1];
        }

        for(int i = 0; i < x; i++){
            f = sc.nextInt();
            System.out.printf("Fib(%d) = %d\n", f, fibbonaci[f]);
        }
    }
}