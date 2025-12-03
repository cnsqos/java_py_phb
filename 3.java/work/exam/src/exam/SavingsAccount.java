package exam;

public class SavingsAccount extends BankAccount{

	public SavingsAccount(String owner, int balance) {
	       super(owner, balance);
	}

	@Override
	public void withdraw(int amount) {
	
	}
}


//SavingsAccount 클래스
//BankAccount를 상속
//withdraw 메서드를 오버라이딩하여 출금 시 항상 현재 잔액의 50% 이하만 출금 가능하게 한다(balance / 2)
//50%를 초과하는 금액을 출금 요청하면 "적금 계좌는 한번에 잔액의 50%만 출금 가능합니다" 출력, 잔액은 변경하지 않는다