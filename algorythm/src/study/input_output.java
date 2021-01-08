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
	
	// Scanner : ���ۻ����� 1024
	Scanner sc = new Scanner(System.in);	// ����
	String sc_line = sc.nextLine();			// ���پ�
	String sc_word = sc.next();				// �� �ܾ
	int sc_num = sc.nextInt();				// ���ھ�
	
	// BufferedReader : ���ۻ����� 8192
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	// ����
	String br_line = br.readLine();												// ���پ�
	while((br_line=br.readLine())!=null) {										// �������� �𸦶�
	}
	StringTokenizer st = new StringTokenizer(br_line);							// �Ľ����� ����(���� ���� �ڸ���)
	int br_num = Integer.parseInt(st.nextToken());								// �Ľ�
	
// output -> println < BufferedWriter
	
	// println : println -> print -> write() + newLine() ������ ó��
	System.out.println("println");
	
	// BufferedWriter : write �Ѵٰ� �ٷ� ��µ��� ����(flush or close �� �� �ѹ��� ��� stream�� �ݿ�)
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	bw.write("Buffered Writer!\n");
	bw.flush();		// ���۰� �������� �ʾ����� ������ ������ ���� ����, ���
	bw.write("flush!");
	bw.newLine();	// �ٹٲ�
	bw.close();		// ���� �ݱ�
	
// ���ڿ� ������ -> String < StringBuffer < StringBuilder
	
	// String : ���������� boxing���� ���� ���� -> immutable(�Һ�) ��ü��, ���� �� ���ο� ��ü�� �����ϴ� ������ ���� ����
	String a = "";
	String b = "";
	String c = a + b;
	
	// StringBuffer : thread-safe Ư¡
	StringBuffer sf = new StringBuffer();
	sf.append("String\n");
	sf.append("Buffer\n");
	System.out.println(sf);

	// StringBuilder : mutable�� ��ü��, boxing������ ��ġ�� �ʾ� �ӵ������� ������ ��� ����
	StringBuilder sb = new StringBuilder();
	sb.append("String\n");
	sb.append("Builder\n");
	System.out.println(sb);

	}
	
}