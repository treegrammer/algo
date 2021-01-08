package bj.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_4344 {
	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int c = Integer.parseInt(br.readLine());
		for(int tc=1; tc<=c; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int[] arr = new int[n];
			int sum = 0;
			for(int i=0; i<n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				sum += arr[i];
			}
			
			// ��� ���ϱ�
			float avg = (float)sum/n;
//			System.out.println(avg);
			
			// ��� �Ѵ� �л� �� ���ϱ�
			int cnt = 0;
			for(int i=0; i<n; i++) {
				if(arr[i] > avg) {
					cnt++;
				}
			}
//			System.out.println(cnt);
			
			// ���� ���ϱ�
			float result = (float)cnt*100/n;
			sb.append(String.format("%.3f", result)).append("%\n");
		}
		System.out.println(sb);
	}
}
