import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a[] = new int[3];
        while(t-->0){
            int n = sc.nextInt();
            for(int i=0;i<3;i++){
                a[i]=sc.nextInt();}
            int minSolvers = Math.min(a[0], Math.min(a[1], a[2]));
            System.out.println(n - minSolvers);
        }}}