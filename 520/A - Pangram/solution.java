import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        String s = sc.next();
 
        
        if (n < 26) {
            System.out.println("NO");
            return;
        }
 
   
    s = s.toLowerCase();
 
    
    Set<Character> uniqueLetters = new HashSet<>();
    for (int i = 0; i < s.length(); i++) {
        uniqueLetters.add(s.charAt(i));
    }
 
 
if (uniqueLetters.size() == 26) {
    System.out.println("YES");
} else {
System.out.println("NO");
}
}
}