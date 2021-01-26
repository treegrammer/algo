package bj.bronze3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1085 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokens = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(tokens.nextToken());
		int y = Integer.parseInt(tokens.nextToken());
		int w = Integer.parseInt(tokens.nextToken());
		int h = Integer.parseInt(tokens.nextToken());
		
		int ck1 = x<w-x?x:w-x;
		int ck2 = y<h-y?y:h-y;
		int result = ck1<ck2?ck1:ck2;
		
		System.out.println(result);
	}
}
