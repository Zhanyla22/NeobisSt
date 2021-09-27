import java.io.IOException;
import java.util.*;

public class ColumnInArray{

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        double newArr[][] = new double[12][12];
        int C = sc.nextInt();
        String sm = sc.next();
        double summ = 0;
        if (C >= 0 && C <= 11) {
            for (int i = 0; i < newArr.length; i++) {
                for (int j = 0; j < newArr.length; j++) {
                    newArr[i][j] = sc.nextDouble();
                    if (C == j) {
                        summ += newArr[i][j];
                    }
                }
            }
            if ("S".equals(sm)) {
                System.out.printf("%.1f\n", summ);
            } else if ("M".equals(sm)) {
                System.out.printf("%.1f\n", (summ / 12));
            }
        }
    }
}
