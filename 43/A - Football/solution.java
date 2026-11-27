import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
 
        String team1 = "";
        String team2 = "";
        int score1 = 0;
        int score2 = 0;
 
        while (n-- > 0) {
            String current = sc.next();
 
            if (team1.isEmpty() || team1.equals(current)) {
                team1 = current;
                score1++;
            } else {
            team2 = current;
            score2++;
        }
}
 
System.out.println(score1 > score2 ? team1 : team2);
}
}