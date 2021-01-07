package bj.bronze3;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main_15792 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String tmp = sc.next();
		BigDecimal a = new BigDecimal(tmp);
		tmp = sc.next();
		BigDecimal b = new BigDecimal(tmp);
		System.out.println(a.divide(b, 2000,BigDecimal.ROUND_DOWN));
	}
}
