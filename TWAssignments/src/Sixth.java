import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by arshis on 11/02/2017.
 */
public class Sixth {
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
        for(int i = t-1; i >= 1; i-- ) {
            for (int j = t; j > i ; j--)
                System.out.print(" ");
            for (int k=1; k<2*i; k++)
                System.out.print("*");
            System.out.println();
        }

    }
}
