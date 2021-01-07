package bj.bronze5;

import java.math.BigInteger;
import java.util.Scanner;

public class Main_15740 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String tmp = sc.next();
		BigInteger a = new BigInteger(tmp);
		tmp = sc.next();
		BigInteger b = new BigInteger(tmp);
		System.out.println(a.add(b));
	}
}
