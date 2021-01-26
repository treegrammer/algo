package bj.silver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1018 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokens  = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(tokens.nextToken());
		int m = Integer.parseInt(tokens.nextToken());
		char[][] crr = new char[n][m];
		for(int i=0; i<n; i++) {
			crr[i] = br.readLine().toCharArray();
		}
		
		int cnt1 = 0;
		int cnt2 = 0;
		int result = Integer.MAX_VALUE;
		boolean isB = true;
		boolean isW = true;
		for(int ii=0; ii<=n-8; ii++) {
			for(int jj=0; jj<=m-8; jj++) {
				for(int i=ii; i<ii+8; i++) {
					for(int j=jj; j<jj+8; j++) {
						if(crr[i][j] == 'B') {
							if(!isB) {
								cnt1++;
							}
							if(isW) {
								cnt2++;						
							}
						}
						else if(crr[i][j] == 'W') {
							if(isB) {
								cnt1++;
							}
							if(!isW) {
								cnt2++;
							}
						}
						isB = !isB;
						isW = !isW;
					}
					isB = !isB;
					isW = !isW;
				}
				if(result > Integer.min(cnt1, cnt2)) {
					result = Integer.min(cnt1, cnt2);
				}
				cnt1 = 0;
				cnt2 = 0;
			}
		}
		
		System.out.println(result);
	}
}
