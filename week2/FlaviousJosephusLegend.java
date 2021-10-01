import java.io.IOException;
import java.util.*;
public class FlaviousJosephusLegend {

    public static void main(String[] args) throws IOException {
        Scanner obj=new Scanner(System.in);
        int testCase=obj.nextInt();
        for (int k=1;k<testCase+1;k++)
        {
            int n = obj.nextInt();
            int m = obj.nextInt();
            Queue<Integer> queue = new LinkedList<Integer>();
            for (int i = 1; i <= n; i++)
                queue.add(i);
            int a=0;
            while (!queue.isEmpty())
            {
                for (int i = 0; i < m-1; i++)
                    queue.add(queue.remove());
                a=queue.remove();
            }
            System.out.println("Case "+k+": "+a);
        }
    }
}