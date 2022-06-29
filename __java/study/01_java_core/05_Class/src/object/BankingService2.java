package object;
class BankAccount2 {
	String owner;
	int accNum;
	double deposit;
	
	void getAccInfo() {
		System.out.println("예금주 : " + getOwner());
		System.out.println("계좌번호 : " + getAccNum());
		System.out.println("잔액 : " + getDeposit());
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
	// setters
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	// getters
	public String getOwner() {
		return this.owner;
	}
	public int getAccNum() {
		return this.accNum;
	}
	public double getDeposit() {
		return this.deposit;
	}
}

public class BankingService2 {

	public static void main(String[] args) {
		// BankAccount 클래스를 정의한다
		// BackAccount에는 예금주(owner), 계좌번호(accNum), 계좌잔액(deposit) 세팅하는 메서드
		// 위의 정보를 조회할 수 있는 메서드
		// 계좌현황조회(변경), 입금, 출금을 할 수 있다 (메서드)
		
		BankAccount2 myBA = new BankAccount2();
		myBA.setOwner("Kim");
		myBA.setAccNum(1234567);
		myBA.setDeposit(0.0);
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
