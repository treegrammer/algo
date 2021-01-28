package bj.silver1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1389 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokens = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(tokens.nextToken());
		int m = Integer.parseInt(tokens.nextToken());
		
		int[][] arr = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==j) {
					arr[i][j] = 0;
					continue;
				}
				arr[i][j] = n;
			}
		}
		for(int i=0; i<m; i++) {
			tokens = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(tokens.nextToken())-1;
			int b = Integer.parseInt(tokens.nextToken())-1;
			arr[a][b] = 1;
			arr[b][a] = 1;
		}

		// �÷��̵� - �ͼ�
		for(int k=0; k<n; k++) {	// ���� ����Ʈ
			for(int i=0; i<n; i++) {	// ��� ����Ʈ
				for(int j=0; j<n; j++) {	// ���� ����Ʈ
					if(arr[i][k] + arr[k][j] < arr[i][j]) {
						arr[i][j] = arr[i][k] + arr[k][j];
					}
				}
			}
		}
		
		// �ɺ� ������ �� ī����
		int[] result = new int[n];
		for(int j=0; j<n; j++) {
			for(int i=0; i<n; i++) {
				result[j] += arr[i][j];
			}
		}
		
		// �ּҰ� ã��
		int minnum = Integer.MAX_VALUE;
		int minidx = -1;
		for(int i=0; i<n; i++) {
			if(minnum > result[i]) {
				minnum = result[i];
				minidx = i;
			}
		}
		
		System.out.println(minidx+1);
	}
}
