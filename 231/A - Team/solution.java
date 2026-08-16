import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 0;
 
        for (int i = 0; i < n; i++) {
            int count = 0;
 
            for (int j = 0; j < 3; j++) {
                int x = sc.nextInt();
                if (x == 1) {
                    count++;}}
    if (count >= 2) {
        k++;}}
System.out.println(k);}}