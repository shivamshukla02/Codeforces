import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
        String st = "codeforces";
 
        while (t-- > 0) {
            String str = sc.next();
 
            if (st.contains(str)) {
                System.out.println("YES");
            } else {
            System.out.println("NO");
        }
}
}
}