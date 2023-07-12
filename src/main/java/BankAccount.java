public class BankAccount {

    private int accountNumber;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int balance;

    public BankAccount() {
        this.firstName = "Rebecca";
        this.lastName = "Walker";
        this.dateOfBirth = "18th November 1998";
        this.accountNumber = 1234; //enum?
        this.balance = 0;
    }

    String getFirstName(){return this.firstName;}
    String getLastName(){return this.lastName;}
    String getDateOfBirth(){return this.dateOfBirth;}
    int getAccountNumber(){return this.accountNumber;}
    int getBalance(){return this.balance;}

    public String setFirstName(){return this.firstName = "Noelia";}
    public String setLastName(){return this.lastName = "Benson";}
    public String setDateOfBirth(){return this.dateOfBirth = "18th November 2000";}
    public int setAccountNumber(){return this.accountNumber = 5678;}
    public int setBalance(){return this.balance = 12;}

public int deposit(int deposit){
        return balance+deposit;
}
public int withdrawal(int withdrawl){
        return balance-withdrawl;
}
}
