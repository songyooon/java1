package sec2;

public class Account {
	private String account;
	private String owner;
	private int balance;
	private int money;
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public void runDeposit(int money){
		this.balance+=money;
	}
	public void runWithdraw(int money){
		if(this.balance-money>0){
			this.balance-=money;	
		} else {
			System.out.println("잔액 부족 - 출금액이 잔액을 초과합니다.");
		}
	}
	public int runBlance(){
		return balance;
	}
	public void printAccount(){
		System.out.println("계좌번호 : "+account);
		System.out.println("예금주 : "+owner);
		System.out.println("잔액 : "+balance);
	}
}