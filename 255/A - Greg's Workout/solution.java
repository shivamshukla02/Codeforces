import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int chest = 0, biceps = 0, back = 0;
        for (int i = 0; i < n; i++) {
            int reps = sc.nextInt();
            if (i % 3 == 0) {
                chest += reps;
            } else if (i % 3 == 1) {
            biceps += reps;
        } else {
        back += reps;
    }
}
 
if (chest > biceps && chest > back) {
    System.out.println("chest");
} else if (biceps > chest && biceps > back) {
System.out.println("biceps");
} else {
System.out.println("back");
}}}