package printEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputData {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String data = sc.next();
		System.out.println("숫자를 입력하세요! >");
		int data = sc.nextInt();
		System.out.println("연산결과 : " + (100 + data)); // 연산은 괄호가 중요
		
//		InputStreamReader isr = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(isr);
//		String datas = "";
//		try {
//			System.out.println("숫자를 입력하세요! >");
//			datas = br.readLine();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		System.out.println(datas);
		
	}

}
