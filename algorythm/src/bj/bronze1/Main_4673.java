package bj.bronze1;

public class Main_4673 {
	static boolean[] ck;
	public static void main(String[] args) {
		StringBuilder result = new StringBuilder();
		ck = new boolean[10001];

		for(int i=1; i<10001; i++) {
			if(!ck[i]) {
				d(i);
			}
		}
		for(int i=1; i<10001; i++) {
			if(!ck[i]) {
				result.append(i).append("\n");
			}
		}
		System.out.println(result);
	}
	static void d(int n) {
		n += n/1000 + n%1000/100 + n%100/10 + n%10;
		if(n > 10000) {
			return;
		}
		ck[n] = true;
		d(n);
	}
}
