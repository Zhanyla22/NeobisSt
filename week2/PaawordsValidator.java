import java.io.IOException;
import java.util.*;
public class PaawordsValidator {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int okA=0;
        int okB=0;
        int okN=0;

        while(sc.hasNext()){

            String s = sc.nextLine();

            if (s.length() >= 6 && s.length() <= 32){
                for(int i=0 ; i<s.length() ; i++){
                    if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                        okB++;
                    else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
                        okA++;
                    else if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
                        okN++;
                }
                if (okA==0)
                    System.out.println("Senha invalida.");
                else if (okB==0)
                    System.out.println("Senha invalida.");
                else if (okN==0)
                    System.out.println("Senha invalida.");
                else if (okA+okB+okN==s.length())
                    System.out.println("Senha valida.");
                else
                    System.out.println("Senha invalida.");
            }
            else
                System.out.println("Senha invalida.");

            oka=0;
            okA=0;
            okn=0;
        }
        sc.close();
    }

}