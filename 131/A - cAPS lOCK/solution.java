import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
 
        boolean allRestUpper = true;
        for (int i = 1; i < s.length(); i++) {
            if (Character.isLowerCase(s.charAt(i))) {
                allRestUpper = false;
                break;
            }
    }
 
if (allRestUpper) {
    StringBuilder ans = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (Character.isUpperCase(c)) {
            ans.append(Character.toLowerCase(c));
        } else {
        ans.append(Character.toUpperCase(c));
    }
}
System.out.println(ans.toString());
} else {
System.out.println(s);
}
}
}