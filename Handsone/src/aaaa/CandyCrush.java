package aaaa;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CandyCrush {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TreeMap<String, Integer> scoreBoard=new TreeMap<String, Integer>();
		scoreBoard.put("Muneesh", 254634);
		scoreBoard.put("Ajay", 395653);
		scoreBoard.put("Abin James", 874566);
		scoreBoard.put("Vishnu", 954673);
		scoreBoard.put("Sidharth", 375676);
		scoreBoard.put("Ashwin", 385657);
		scoreBoard.put("Antu Jilson", 253440);
		scoreBoard.put("Karthik", 223784);
		scoreBoard.put("Kalyan", 367535);
		scoreBoard.put("Fibin", 274633);
		
		System.out.println("SCORCOARD");
		for (Map.Entry<String, Integer> e:scoreBoard.entrySet()) {
			System.out.printf("%-15s %d%n", e.getKey(), e.getValue());
		}

	}

}
