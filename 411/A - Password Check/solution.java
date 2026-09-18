import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
 
        boolean hasLength = s.length() >= 5;
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
 
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (Character.isLowerCase(c)) {
            hasLower = true;
        } else if (Character.isDigit(c)) {
        hasDigit = true;
    }
}
 
if (hasLength && hasUpper && hasLower && hasDigit) {
    System.out.println("Correct");
} else {
System.out.println("Too weak");
}
}
}