package bj.bronze2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2869 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokens = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(tokens.nextToken());
		int b = Integer.parseInt(tokens.nextToken());
		int v = Integer.parseInt(tokens.nextToken());
		
		// 하루 이동 가능 거리 : (a-b)
		// 낮동안 올라가서 도착 가능 거리 : a
		// v - ((a-b)X + a) = 0
		// v = (a-b)X + a
		// v-a = (a-b)X
		// X = (v-a) / (a-b)

		double x = (double)(v-a) / (a-b);
		int result = (int)x + 1;
		if(x%1 > 0) {
			result++;
		}
		
		System.out.println(result);
	}
}
