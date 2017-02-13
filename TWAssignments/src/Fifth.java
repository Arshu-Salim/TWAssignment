import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by arshis on 11/02/2017.
 */
public class Fifth {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=1;i<=t;i++) {
            for (int j = i; j < t ; j++)
                System.out.print(" ");
            for (int k=1; k<=(2*i-1); k++)
                System.out.print("*");
            System.out.println();
        }
    }
}
