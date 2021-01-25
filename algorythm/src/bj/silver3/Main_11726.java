package bj.silver3;

import java.math.BigInteger;
import java.util.Scanner;

public class Main_11726 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		// ���� �����϶� = 1
		// �ϳ��� �����϶� = n-1 C 1
		// �Ѹ� �����϶� = n-2 C 2
		// �¸� �����϶� = n-3 C 3
		// ...
		// n/2 ���� �ݺ�
		// 5�϶� 2
		// 6�϶� 3
		int sum = 1;
		for(int i=1; i<=n/2; i++) {
			// n-i! / (n-i-i)! i!
			BigInteger a = fact(n-i);
			BigInteger b = fact(n-i-i).multiply(fact(i));

			int tmp = Integer.parseInt(a.divide(b).mod(new BigInteger("10007")).toString());
			sum += tmp;
			sum %= 10007;
//			System.out.println(i + " " + a + " " + b + " " + sum);
		}
		
		System.out.println(sum);
	}
	public static BigInteger fact(int a) {
		if(a <= 1) {
			return new BigInteger("1");
		}
		return fact(a-1).multiply(new BigInteger(Integer.toString(a)));
	}
}
