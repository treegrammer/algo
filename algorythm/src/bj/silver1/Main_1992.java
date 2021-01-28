package bj.silver1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1992 {
	static StringBuilder result;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n =  Integer.parseInt(br.readLine());
		char[][] crr = new char[n][n];
		for(int i=0; i<n; i++) {
			crr[i] = br.readLine().toCharArray();
		}
		
		result = new StringBuilder();
		
		findresult(crr);
		
		System.out.println(result);
	}
	public static void findresult(char[][] crr) {
		// 압축 가능한지 확인
		char tmp = crr[0][0];
		boolean mixed = false;
		for(int i=0; i<crr.length; i++) {
			for(int j=0; j<crr[0].length; j++) {
				if(tmp != crr[i][j]) {
					mixed = true;
					break;
				}
			}
			if(mixed) {
				break;
			}
		}
		
		// !mixed인 경우 해당 숫자 추가
		if(!mixed) {
			result.append(tmp);
			return;
		}
		
		// mixed인 경우 crr 4등분해서 재호출
		if(mixed) {
			result.append("(");
			for(int ii=0; ii<2; ii++) {
				for(int jj=0; jj<2; jj++) {
					char[][] nrr = new char[crr.length/2][crr[0].length/2];
					for(int i=0; i<crr.length/2; i++) {
						for(int j=0; j<crr[i].length/2; j++) {
							nrr[i][j] = crr[crr.length*ii/2+i][crr[0].length*jj/2+j];
						}
					}
					findresult(nrr);
				}
			}
			result.append(")");
		}
	}
}
