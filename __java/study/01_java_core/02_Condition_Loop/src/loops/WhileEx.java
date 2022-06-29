package loops;

public class WhileEx {

	public static void main(String[] args) {
		// 1부터 20까지 합 구하기 while 이용하기
		int i = 1;
		int sum1 = 0;
		while (i < 21) {
			sum1 += i;
			i++;			
		}
		System.out.println(sum1);
		
		// 1부터 100까지 홀수의 합 구하기 do while 이용하기
		int j = 1;
		int sum2 = 0;
		do {
			if(j % 2 == 1) {
				sum2 += j;
			}
			j++;
		} while (j < 101);
		System.out.println(sum2);
	}
}
