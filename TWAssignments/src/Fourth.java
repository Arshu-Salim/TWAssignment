import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by arshis on 11/02/2017.
 */
public class Fourth {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++) {
            for (int j = 0; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
