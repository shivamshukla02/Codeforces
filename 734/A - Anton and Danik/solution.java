import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        String s = sc.next();
 
        int x = 0;
        int y = 0;
 
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == 'A') {
                x++;
            } else if (c == 'D') {
            y++;
        }
}
 
if (x > y) {
    System.out.print("Anton");
} else if (y > x) {
System.out.print("Danik");
} else {
System.out.print("Friendship");
}
}
}