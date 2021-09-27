# StudyPlan
# 16.09.21
# Zhanylai Mamytova

![.java](https://user-images.githubusercontent.com/79711737/133651111-4b545c2d-c62b-45aa-88a5-fd962f2c1034.jpg)

```java
import java.io.IOException;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if ((x > 1 && x < 20) && (y > x && y < 100000)) {
            for (int i = 1; i <=y; i++) {
                System.out.print(i);
                if(i%x==0){
                    System.out.println("");
                }else{
                    System.out.print(" ");
                }
            }
            if(y%x!=0){
                System.out.println("\n");
            }

        }

    }
}
