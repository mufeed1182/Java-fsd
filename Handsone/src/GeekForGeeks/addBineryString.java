package GeekForGeeks;

import java.util.Scanner;
import java.math.BigInteger;

public class addBineryString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String A=sc.next();
		String B=sc.next();
		String result=addBinery(A, B);
		System.out.println(result);
	}
	
	static String addBinery(String A,String B) {
//		Long numA = Long.valueOf(A,2);
//        Long numB = Long.valueOf(B,2);
//
//        Long bNum = numA + numB;
//
//        String bResult = Long.toBinaryString(bNum);
//
//        return bResult;
//		/ Convert binary strings to BigIntegers
        BigInteger numA = new BigInteger(A, 2);
        BigInteger numB = new BigInteger(B, 2);

        
        BigInteger bResult = numA.add(numB);

        String rBinary = bResult.toString(2);

        return rBinary;
			
	}
	}

