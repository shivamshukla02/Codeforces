import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            if ((n & (n - 1)) == 0) {
                System.out.println("NO");
            } else {
            System.out.println("YES");
        }
}
}
}