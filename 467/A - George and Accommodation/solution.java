import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c =0;
        for(int i=1;i <= n;i++){
            int p = sc.nextInt();
            int q = sc.nextInt();
            if(q - p >= 2){
                c++;
            }}
    System.out.print(c);
}
}