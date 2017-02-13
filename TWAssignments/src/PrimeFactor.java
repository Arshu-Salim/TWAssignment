import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by arshis on 11/02/2017.
 */
public class PrimeFactor {
    static void generate(int n){
        int i =2;
        while(n>1){
            if(n%i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
            else
                i++;
        }
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        generate(n);
    }
}
