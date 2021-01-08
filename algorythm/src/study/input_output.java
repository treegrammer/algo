package study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class input_output{
	
	public static void main(String[] args) throws IOException {
		
// input -> Scanner < BufferedReader
	
	// Scanner : 버퍼사이즈 1024
	Scanner sc = new Scanner(System.in);	// 선언
	String sc_line = sc.nextLine();			// 한줄씩
	String sc_word = sc.next();				// 한 단어씩
	int sc_num = sc.nextInt();				// 숫자씩
	
	// BufferedReader : 버퍼사이즈 8192
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	// 선언
	String br_line = br.readLine();												// 한줄씩
	while((br_line=br.readLine())!=null) {										// 마지막을 모를때
	}
	StringTokenizer st = new StringTokenizer(br_line);							// 파싱위한 선언(띄어쓰기 기준 자르기)
	int br_num = Integer.parseInt(st.nextToken());								// 파싱
	
// output -> println < BufferedWriter
	
	// println : println -> print -> write() + newLine() 순서로 처리
	System.out.println("println");
	
	// BufferedWriter : write 한다고 바로 출력되지 않음(flush or close 될 때 한번에 출력 stream에 반영)
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	bw.write("Buffered Writer!\n");
	bw.flush();		// 버퍼가 가득차지 않았지만 강제로 버퍼의 내용 전송, 비움
	bw.write("flush!");
	bw.newLine();	// 줄바꿈
	bw.close();		// 버퍼 닫기
	
// 문자열 포맷팅 -> String < StringBuffer < StringBuilder
	
	// String : 내부적으로 boxing과정 거쳐 느림 -> immutable(불변) 객체로, 연산 시 새로운 객체를 생성하는 과정을 거쳐 느림
	String a = "";
	String b = "";
	String c = a + b;
	
	// StringBuffer : thread-safe 특징
	StringBuffer sf = new StringBuffer();
	sf.append("String\n");
	sf.append("Buffer\n");
	System.out.println(sf);

	// StringBuilder : mutable한 객체로, boxing과정을 거치지 않아 속도적으로 빠르게 사용 가능
	StringBuilder sb = new StringBuilder();
	sb.append("String\n");
	sb.append("Builder\n");
	System.out.println(sb);

	}
	
}