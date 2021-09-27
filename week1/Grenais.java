import java.io.IOException;
import java.util.*;


public class Grenais {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int inter = 0;
        int gremio = 0;
        int empates = 0;
        int summ = 0;
        int interGoals;
        int gremGoals;
        int response = 1;
        do {
            if (response == 1) {
                summ++;
                interGoals = sc.nextInt();
                gremGoals = sc.nextInt();
                if (interGoals > gremGoals) {
                    inter++;
                } else if (gremGoals > interGoals) {
                    gremio++;
                } else {
                    empates++;
                }
            }
            System.out.println("Novo grenal (1-sim 2-nao)");
            response = sc.nextInt();
        }
        while (response != 2);
        System.out.println(summ + " grenais");
        System.out.println("Inter:" + inter);
        System.out.println("Gremio:" + gremio);
        System.out.println("Empates:" + empates);
        if (inter > gremio) {
            System.out.println("Inter venceu mais");
        }
        else if (inter < gremio) {
            System.out.println("Gremio venceu mais");
        }
        else {
            System.out.println("Nao houve vencedor");
        }
    }
}
