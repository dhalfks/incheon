package quiz;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		int[] nums = getNums();
		int select = getSelection();
		switch (select) {
			case 1: getSumResult(nums); break;
			case 2: getSubResult(nums); break;
			case 3: getMultiResult(nums); break;
			case 4: getDivResult(nums); break;
			case 5: getModResult(nums); break;
			default: break;
		}
		
	}

	private static void getModResult(int[] nums) {
		System.out.println(nums[0] + " % " + nums[1] + " = " + (nums[0]%nums[1]));
		
	}

	private static void getDivResult(int[] nums) {
		System.out.println(nums[0] + " / " + nums[1] + " = " + ((double)nums[0]/nums[1]));
		
	}

	private static void getMultiResult(int[] nums) {
		System.out.println(nums[0] + " x " + nums[1] + " = " + (nums[0]*nums[1]));
	}

	private static void getSubResult(int[] nums) {
		int result = nums[0] - nums[1];
		System.out.println(nums[0] + " - " + nums[1] + " = " + result);
	}

	private static void getSumResult(int[] nums) {
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			result += nums[i];
		}
		System.out.println(nums[0] + " + " + nums[1] + " = " + result);
	}

	private static int getSelection() {
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 계산을 선택하세요 > ");
		System.out.println("1:덧셈, 2:뺄셈, 3:곱셈, 4:나눗셈, 5:나머지");
		int select = sc.nextInt();
		return select;
	}

	private static int[] getNums() {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[2];
		for (int i = 0; i < nums.length; i++) {
			System.out.println((i+1) + "번째 숫자를 입력하세요 > ");
			nums[i] = sc.nextInt();
		}
		return nums;
	}

}
