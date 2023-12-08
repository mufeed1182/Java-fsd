package JavaQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class StatesAndCapitals {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Map<String, String> capital=new HashMap<>();
		for (int i=0;i<n;i++) {
			capital.put(sc.next(), sc.next());
		}
		String state=sc.next();
		for (Map.Entry<String, String> map:capital.entrySet()) {
			if (map.getKey().equals(state)) {
				System.out.println(map.getValue()+"$"+map.getKey());
			}
		}

	}

}
