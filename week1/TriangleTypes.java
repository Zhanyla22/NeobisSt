import java.io.IOException;
import java.util.*;
public class TriangleTypes {

    public static void main(String[] args) throws IOException {

        double A;
        double B;
        double C;
        Scanner sc =new Scanner(System.in);
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        double A2 = Math.max(A, Math.max(B, C));
        double B2 = 0;
        double C2 = 0;

        if (A2 == A) {
            B2 =Math.max(B, C);
            C2 =Math.min(B, C);
        }
        if (A2 == B) {
            B2 =Math.max(A, C);
            C2 =Math.min(A, C);
        }
        if (A2 == C) {
            B2 =Math.max(B, A);
            C2 =Math.min(B, A);
        }

        if (A2 >= (B2 + C2)) {
            System.out.print("NAO FORMA TRIANGULO\n");

        }else if (A2*A2 > ((B2*B2)+(C2*C2))) {
            System.out.print("TRIANGULO OBTUSANGULO\n");
        }
        if (A2*A2 == ((B2*B2)+(C2*C2))) {
            System.out.print("TRIANGULO RETANGULO\n");
        }

        if (A2*A2 < ((B2*B2)+(C2*C2))) {
            System.out.print("TRIANGULO ACUTANGULO\n");
        }
        if ((A2 == B2) &&(A2 == C2)) {
            System.out.print("TRIANGULO EQUILATERO\n");
        }
        if (((A2 == B2) &&(A2 != C2)) || ((A2 == C2) &&(A2 != B2)) || ((B2 == C2) &&(B2 != A2)) ) {
            System.out.print("TRIANGULO ISOSCELES\n");
        }

    }

}