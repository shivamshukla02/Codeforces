import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int a[] = new int[n];
            int o = 0;
            int p = 0;
            int q = 0;
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
                if (a[j] % 2 != 0) {
                    o++;}
            else if (a[j] % 4 == 0) {
                p++;}
        else {
            q++;}}
          System.out.println(Math.max(o, Math.max(p, q)));}}}