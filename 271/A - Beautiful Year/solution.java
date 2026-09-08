import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        while (true) {
            y++;
            int temp = y;
            int a[] = new int[4];
            int c = 0;
            int k = 0;
            while (temp > 0) {
                int d = temp % 10;
                a[k] = d;
                k++;
                temp = temp / 10;}
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                if (a[i] == a[j]) {
                    c++;
                    break;}}
    if (c != 0) {
        break;}}
if (c == 0) {
    System.out.print(y);
    break;}}}}