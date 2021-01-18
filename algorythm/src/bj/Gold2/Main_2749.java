package bj.Gold2;

import java.math.BigInteger;
import java.util.Scanner;

public class Main_2749 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(new BigInteger(sc.next()).mod(new BigInteger("1500000")).toString());

		int[] fibo = new int[1500000];
		fibo[0] = 0;
		fibo[1] = 1;
		for(int i=2; i<1500000; i++) {
			fibo[i] = (fibo[i-1]%1000000 + fibo[i-2]%1000000) %1000000;
		}
		
		System.out.println(fibo[n]);
	}
}
