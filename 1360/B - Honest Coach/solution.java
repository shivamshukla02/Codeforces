import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }
 
        Arrays.sort(a);
 
        int min = Integer.MAX_VALUE;
                for(int i=1; i<n; i++){
            int diff = a[i] - a[i-1];
            if(diff < min){
                min = diff;
            }
    }
System.out.println(min);
}
}
}