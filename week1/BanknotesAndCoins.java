import java.io.IOException;
import java.util.*;

public class BanknotesAndCoins {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        float number = sc.nextFloat();
        int cupura100 = (int) number / 100;
        System.out.println(cupura100);
        int numberPosle100 = (int) number - (cupura100 * 100); //76
        System.out.println(numberPosle100);

        int cupura50 = numberPosle100 / 50; //1
        System.out.println(cupura50);
        int numberPosle50 = numberPosle100 - (cupura50 * 50); //26
        System.out.println(numberPosle50);

        int cupura20 = numberPosle50 / 20;//1
        System.out.println(cupura20);
        int numberPosle20 = numberPosle50 - (cupura20 * 20);//6
        System.out.println(numberPosle20);
        int cupura10 = numberPosle20 / 10;//0
        System.out.println(cupura10);
        int numberPosle10 = numberPosle20 - (cupura10 * 10);//6
        System.out.println(numberPosle10);

        int cupura5 = numberPosle10 / 5;//1
        System.out.println(cupura5);
        int numberPosle5 = numberPosle10 - (cupura5 * 5);//1
        System.out.println(numberPosle5);

        int cupura2 = numberPosle5 / 2;//0
        System.out.println(cupura2);
        int numberPosle2 = numberPosle5 - (cupura2 * 2);//1
        System.out.println(numberPosle2);
        int cupura1 = numberPosle2 / 1;//1
        System.out.println(cupura1);

        float posleTochki = (float) (((number - ((cupura100 * 100) + (cupura50 * 50) + (cupura20 * 20) + (cupura10 * 10) + (cupura5 * 5) + (cupura2 * 2) + (cupura1 * 1)))));//0.73

        System.out.println(posleTochki);

        int cupura050 = (int) (posleTochki / 0.50);//1
        float numberPosle050 = (float) (posleTochki - (cupura050 * 0.50));//0.23
        System.out.println(numberPosle050);
        int cupura025 = (int) (numberPosle050 / 0.25);//0
        float numberPosle025 = (float) (numberPosle050 - (cupura025 * 0.25));//0.23
        System.out.println(numberPosle025);

        int cupura010 = (int) (numberPosle025 / 0.10);//2
        float numberPosle010 = (float) (numberPosle025 - (cupura010 * 0.10));//0.03
        System.out.println(numberPosle010);

        int cupura005 = (int) (numberPosle010 / 0.05);//0
        System.out.println(cupura005);
        float numberPosle005 = (float) (numberPosle010 - (cupura005 * 0.05));//0.03
        System.out.println(numberPosle005);

        int cupura001 = (int) (numberPosle005 / 0.01);//3
        System.out.println(cupura001);

        System.out.println((cupura100 * 100));
        System.out.print("NOTAS:\n");
        System.out.print(cupura100 + " nota(s) de R$ 100.00\n");
        System.out.print(cupura50 + " nota(s) de R$ 50.00\n");
        System.out.print(cupura20 + " nota(s) de R$ 20.00\n");
        System.out.print(cupura10 + " nota(s) de R$ 10.00\n");
        System.out.print(cupura5 + " nota(s) de R$ 5.00\n");
        System.out.print(cupura2 + " nota(s) de R$ 2.00\n");
        System.out.print("MOEDAS:\n");
        System.out.print(cupura1 + " moeda(s) de R$ 1.00\n");
        System.out.print(cupura050 + " moeda(s) de R$ 0.50\n");
        System.out.print(cupura025 + " moeda(s) de R$ 0.25\n");
        System.out.print(cupura010 + " moeda(s) de R$ 0.10\n");
        System.out.print(cupura005 + " moeda(s) de R$ 0.05\n");
        System.out.print(cupura001 + " moeda(s) de R$ 0.01");
    }
}