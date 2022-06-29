package object;
class BankAccount {
	String owner = "Park";
	int accNum = 1234567;
	double deposit = 0.0;
	
	void getAccInfo() {
		System.out.println("예금주 : " + owner);
		System.out.println("계좌번호 : " + accNum);
		System.out.println("잔액 : " + deposit);
	}
	void saving(int money) {
		deposit += money;
	}
	void withdraw(int money) {
		if(money > deposit) {
			System.out.println("잔액부족");
		}else {
			deposit -= money;
		}
	}
}

public class BankingService {

	public static void main(String[] args) {
		// BankAccount 클래스를 정의한다
		// BackAccount에는 예금주(owner), 계좌번호(accNum), 계좌잔액(deposit)
		// 계좌현황조회, 입금, 출금을 할 수 있다 (메서드)
		
		BankAccount myBA = new BankAccount();
		myBA.getAccInfo();
		System.out.println("----------------");
		myBA.saving(100000);		
		myBA.getAccInfo();
		System.out.println("----------------");
		myBA.withdraw(50000);
		myBA.getAccInfo();
		System.out.println("----------------");
		myBA.withdraw(60000);
		myBA.getAccInfo();
	}
}
