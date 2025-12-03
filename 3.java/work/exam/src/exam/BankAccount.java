package exam;

public class BankAccount {

	String owner;
	int balance;

	
	public BankAccount(String owner, int balance) {
	       this.owner = owner;
	       this.balance = balance;
	   }

	public void deposit(int amount) {
	       balance = balance + amount;
	   }
	
	public void withdraw(int amount) {
		if (amount > balance) {
	           System.out.println("잔액 부족");
		}
	}
}


	  

//10번. 상속 + 오버라이딩 – 은행 계좌 (10점)
//요구사항
//
//BankAccount 클래스를 작성한다
//필드
//- String owner
//- int balance
//생성자
//- 소유자 이름과 초기 잔액을 받는다

//메서드
//void deposit(int amount) → amount만큼 잔액 증가
//void withdraw(int amount) → 잔액이 충분하면 잔액 감소, 부족하면 "잔액 부족" 출력, 잔액은 그대로 유지


//main 메서드에서
//잔액 100000원인 SavingsAccount를 하나 만들고
//30000원 출금 시도, 80000원 출금 하는 메서드를 만들어서 결과를 출력하세요.