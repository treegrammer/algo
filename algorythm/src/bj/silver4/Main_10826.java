package bj.silver4;

import java.math.BigInteger;
import java.util.Scanner;

public class Main_10826 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		BigInteger[] fibo = new BigInteger[10001];
		fibo[0] = new BigInteger("0");
		fibo[1] = new BigInteger("1");
		for(int i=2; i<10001; i++) {
			fibo[i] = fibo[i-1].add(fibo[i-2]);
		}

		System.out.println(fibo[n].toString());
	}
}
