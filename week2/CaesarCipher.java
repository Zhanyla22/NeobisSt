import java.io.IOException;
import java.util.*;

public class CaesarCipher {

    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int test_case=sc.nextInt();
        String soz=sc.nextLine();
        int vol=0;

        for (int j=0;j<test_case;j++) {
            soz=sc.nextLine();

            if (vol!=0) {
                soz = sc.nextLine();
            }
            int n = sc.nextInt();
            char[] a = new char[soz.length()];

            for (int i=0;i<soz.length();i++) {
                int z=((int)soz.charAt(i)-n);

                if(z<65) {
                    z=z+26;
                }

                a[i]=(char)z;
                System.out.print(a[i]);
            }

            System.out.print("\n");
            vol++;
        }
    }
}