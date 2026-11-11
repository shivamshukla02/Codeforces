import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();}
    int l = 1;
    int max = 1;
    for (int i = 0; i < n - 1; i++) {
        if (a[i + 1] > a[i]) {
            l++; 
        } else {
        l = 1; }
if (l > max) {
    max = l;}}
System.out.print(max);}}