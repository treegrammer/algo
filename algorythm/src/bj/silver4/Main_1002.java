package bj.silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1002 {
	public static void main(String[] args) throws Exception {
		StringBuilder result = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int tc=1; tc<=t; tc++) {
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(tokens.nextToken());
			int y1 = Integer.parseInt(tokens.nextToken());
			int r1 = Integer.parseInt(tokens.nextToken());
			int x2 = Integer.parseInt(tokens.nextToken());
			int y2 = Integer.parseInt(tokens.nextToken());
			int r2 = Integer.parseInt(tokens.nextToken());

			double d = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
			int cnt = 0;
			if(x1==x2 && y1==y2 && r1==r2) {
				cnt = -1;
			}
			else {
				// 두 원의 접점의 갯수 구하기
				if(r1 + r2 == d) {
					// 외접
					cnt = 1;
				}
				else if(Math.abs(r1 - r2) == d) {
					// 내접
					cnt = 1;
				}
				else if(Math.abs(r1 - r2) < d && r1+r2 > d) {
					// 두 점에서 만남
					cnt = 2;
				}
			}
			
			result.append(cnt).append("\n");
		}
		
		System.out.println(result);
	}
}
