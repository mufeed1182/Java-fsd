package week3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntegerAsce {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(12,10,34,24,45,78,60,90,86,98,110,94);
		List<Integer> result=numbers.stream()
				.sorted((a,b)->b-a)
				//.filter(c->c >80)
				.collect(Collectors.toList());
		System.out.println(result);

	}

}
