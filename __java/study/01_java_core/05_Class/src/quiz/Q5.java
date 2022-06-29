package quiz;

import java.util.Scanner;

class Store {
	String[] items;
	
	public Store() {

	}
	void setItem(String[] items) {
		this.items = items;
	}
	void viewItem() {
		for (String item : items) {
			System.out.print("item : " + item + " ");
		}
	}
	String getItem(int i) {
		return items[i];
	}
}

public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Store foodStore = new Store();
		Store shoesStore = new Store();
		Store toyStore = new Store();
		
		foodStore.setItem(new String[] {"쌀국수", "백반", "해물탕"});
		shoesStore.setItem(new String[] {"나이키", "아디다스", "뉴밸런스"});
		toyStore.setItem(new String[] {"로봇", "인형", "레고"});
		
		int selMenu = 0, storeNum = 0;
		while (true) {
			System.out.println("1: 음식점, 2: 신발가게, 3: 장난감가게");
			storeNum = sc.nextInt();
			
			System.out.println("1: 상품리스트, 2:상품구입");
			selMenu = sc.nextInt();
			
			if(selMenu == 1) {
				switch (storeNum) {
				case 1:
					foodStore.viewItem();
					break;
				case 2:
					shoesStore.viewItem();
					break;
				case 3:
					toyStore.viewItem();
					break;
				default:
					break;
				}
			}else if(selMenu == 2) {
				int idx = 0;
				switch (storeNum) {
				case 1:
					System.out.println("상품 번호(index)를 입력 > ");
					idx = sc.nextInt();
					System.out.println(foodStore.getItem(idx) + "을 주문하였습니다.");
					break;
				case 2:
					System.out.println("상품 번호(index)를 입력 > ");
					idx = sc.nextInt();
					System.out.println(shoesStore.getItem(idx) + "을 구매하였습니다.");
					break;
				case 3:
					System.out.println("상품 번호(index)를 입력 > ");
					idx = sc.nextInt();
					System.out.println(toyStore.getItem(idx)+ "을 득템하였습니다.");
					break;

				default:
					break;
				}
			}else {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
