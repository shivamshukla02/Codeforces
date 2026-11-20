import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String result = s.replace("WUB", " ").trim().replaceAll("\\s+", " ");
        System.out.println(result);
    }
}