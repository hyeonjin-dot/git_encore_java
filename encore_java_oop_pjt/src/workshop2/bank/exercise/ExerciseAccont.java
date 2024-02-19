package workshop2.bank.exercise;

import workshop2.bank.entity.Account;

public class ExerciseAccont {

	public static void main(String[] args) {
		Account ant = new Account("CUST01", "소지섭", "1-22-333", 100000);
		
		System.out.println("=====================");
		System.out.println("고객번호 : " + ant.getCustId());
		System.out.println("고객명 : " + ant.getCustName());
		System.out.println("계좌번호 : " + ant.getAccountNumber());
		System.out.println("잔액 : " + ant.getBalance() +"원");
		System.out.println("=====================");
		
		int addB = 10000;
		System.out.println(addB +"원을 입금합니다.");
		ant.addBalance(addB);
		System.out.println("증가 후 잔액 : "+ant.getBalance()+"원");
		int subB = 20000;
		System.out.println(subB +"원을 출금합니다.");
		ant.subtractBalance(subB);
		System.out.println("감소 후 잔액 : "+ant.getBalance()+"원");
		
	}

}
