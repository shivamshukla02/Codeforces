import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumx=0;
        int sumy=0;
        int sumz=0;
        while(n-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            sumx += x;
            sumy += y;
            sumz += z;}
        if(sumx == 0 && sumy==0 && sumz ==0){
            System.out.print("YES");}
        else{
            System.out.print("NO");
        }}}