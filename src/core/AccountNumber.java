package core;

public class AccountNumber extends  NewCustomer{
    private final long accountNumber;
    public AccountNumber(String name, String lastName, int age, String address,  long accountNumber) {
        super(name, lastName, age, address);
        if(accountNumber<0){
            throw new IllegalArgumentException("Account number can't be negative"+accountNumber);
        }
       this.accountNumber=accountNumber;
    }
}
