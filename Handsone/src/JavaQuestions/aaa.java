package JavaQuestions;

import java.io.CharConversionException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class aaa {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		String str=sc.next();
		
		System.out.println(reduceString(k, str));
	}
	
	public static String reduceString(int K, String str) {
        StringBuilder reduced = new StringBuilder();

        for (char ch : str.toCharArray()) {
            int len = reduced.length();
            
            // If the current character is the same as the last K-1 characters in the reduced string,
            // remove those last K-1 characters.
            if (len >= K - 1 && ch == reduced.charAt(len - (K - 1))) {
                int count = 0;
                while (len > 0 && reduced.charAt(len - 1) == ch) {
                    len--;
                    count++;
                }
                reduced.setLength(len);
                
                // If we've removed K-1 characters, we don't add the current character to the reduced string.
                if (count < K - 1) {
                    reduced.append(ch);
                }
            } else {
                reduced.append(ch);
            }
        }
        
        return reduced.toString();
    }

}
