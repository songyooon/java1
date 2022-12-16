package sec1;

public class Account {
    private String accnum;
    private String owner;
    private int balance;
 
    public Account(String accnum, String owner, int balance) {
        this.accnum = accnum;
        this.owner = owner;
        this.balance = balance;
    }
 
    public String getAno() { return accnum; }
    public void setAno(String accnum) { this.accnum = accnum; }
    public String getOwner() { return owner; }
    public void setOwner(String owner) { this.owner = owner; }
    public int getBalance() { return balance; }
    public void setBalance(int balance) { this.balance = balance; }
}
