package JavaQuestions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        boolean isValid = validatePassword(password);
        
        if (isValid) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
        
        sc.close();
    }
    
    public static boolean validatePassword(String password) {
        if (password == null) {
            return false;
        }
        
        String regex = "^(?=.*[0-9])(?=.*[a-zA-Z])(?=.*[@#%]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
/*The ^ and $ characters represent the start and end of the string, respectively. 
 * The (?=.*[0-9]), (?=.*[a-zA-Z]), and (?=.*[@#%]) parts of the regex represent 
 * positive lookaheads that check if the string contains at least one digit, 
 * \one letter, and one special character, respectively.
 *  The .{8,} part of the regex represents any character that occurs 8 or more times.*/


