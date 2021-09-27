import java.io.IOException;
import java.util.*;

public class WeightedAvareges {

    public static void main(String[] args) throws IOException {


        Scanner sc=new Scanner(System.in);
        int  N = sc.nextInt();
        float a, b, c;
        float avg=0;


        for (int i = 0; i < N; i++) {
            a = sc.nextFloat();
            b= sc.nextFloat();
            c = sc.nextFloat();
            avg= ( a*2 + b*3 + c*5 ) / 10;
            System.out.printf("%.1f\n", avg);
        }
    }
}