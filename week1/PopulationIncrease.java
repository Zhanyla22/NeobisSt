import java.io.IOException;
import java.util.*;
public class PopulationIncrease {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int PA;
        int PB;
        int anos;
        double G1;
        double G2;
        if(T>=1 && T<=3000) {
            for (int i = 1; i <= T; i++) {
                anos=0;
                PA = sc.nextInt();
                PB = sc.nextInt();
                G1 = sc.nextDouble();
                G2 = sc.nextDouble();
                while (PB >= PA) {
                    PA += (PA * G1) / 100;
                    PB += (PB * G2) / 100;
                    anos++;
                    if (anos > 100) {
                        break;
                    }
                }
                if (anos > 100) {
                    System.out.println("Mais de 1 seculo.");
                }
                else {
                    System.out.println(anos + " anos.");
                }
            }
        }
    }

}