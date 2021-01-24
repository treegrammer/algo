package bj.bronze2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2920 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokens = new StringTokenizer(br.readLine());
		boolean ckas = false;
		boolean ckde = false;
		int past = Integer.parseInt(tokens.nextToken());
		while(tokens.hasMoreTokens()) {
			int now = Integer.parseInt(tokens.nextToken());
			if(past - now == -1) {
				ckas = true;
				past = now;
				continue;
			}
			else if(past - now == 1) {
				ckde = true;
				past = now;
				continue;
			}
			ckas = false;
			ckde = false;
			break;
		}
		if(ckas) {
			System.out.println("ascending");
		}
		else if(ckde) {
			System.out.println("descending");
		}
		else {
			System.out.println("mixed");
		}
	}
}
