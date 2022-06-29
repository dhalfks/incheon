package conditions;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// 현재시간(24시간 기준)을 입력받아
		// 9시 이전이면 굿모닁 출력
		// 14시 이전이면 굿앱터눈
		// 22시 이전이면 굿나잇
		
		Scanner sc = new Scanner(System.in);
		System.out.println("현재 시간 >");
		int now = sc.nextInt();
		
		if (now < 9) {
			System.out.println("굿모닁");
		} else if(now < 14) {
			System.out.println("굿앱터눈");
		} else if(now < 22) {
			System.out.println("굿나잇");
		}else {
			System.out.println("자야지~");
		}
	}

}
