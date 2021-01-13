package bj.bronze3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10250 {
	public static void main(String[] args) throws Exception {
		StringBuilder result = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		for(int tc=1; tc<=t; tc++) {
			StringTokenizer tokens = new StringTokenizer(br.readLine());
			int h = Integer.parseInt(tokens.nextToken());
			int w = Integer.parseInt(tokens.nextToken());
			int n = Integer.parseInt(tokens.nextToken());
			
			// YY XX
			/*
			 6 6:601 12
			 5 5:501 11
			 4 4:401 10
			 3 3:301 9:302
			 2 2:201 8:202
			 1 1:101 7:102 13
			 */
			int yy = n%h;			
			int xx = n/h + 1;
			if(yy == 0) {
				yy = h;
				xx--;
			}
			result.append(yy);
			if(xx < 10) {
				result.append("0");
			}
			result.append(xx).append("\n");
			
		}
		System.out.println(result);
	}
}
