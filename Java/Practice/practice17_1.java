public class practice17_1 {
    private int account_number;
    private int balance;
    private String customer_name;
    private String email;
    private int phone_number;
    // private int deposit_funds;
    // private int withdrawal_funds;

    public String getAccounNumber() {
        return ("Your account number is: " + this.account_number) 
        // + ("\nYour name is: " + this.customer_name + ".")
        // + ("\nYour Total balance is: " + this.balance)
        ;
        
    }

    public String getbalance() {
        return ("Your Total balance is: " + this.balance);
    }

    public String getCustomerName() {
        return ("Your name is: " + this.customer_name + ".");
    }

    public String getEmail() {
        return this.email;
    }

    public int getPhoneNumber() {
        return this.phone_number;
    }

    public void setAccountNumber(int account_number) {
        this.account_number = account_number;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customer_name) {
        this.customer_name = customer_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phone_number) {
        this.phone_number = phone_number;
    }

    public String getDeposit() {
        return ("Your Total balance after Deposit is " + this.balance);
    }

    public void setDeposit(int deposit_funds) {
        this.balance = balance + deposit_funds;
    }

    public String getWithdrawal() {
        return ("Your Total balance after Withdrawal is " + this.balance);
    }

    public void setWithdrawal(int withdrawal_funds) {
        if (balance - withdrawal_funds < 0) {
            System.out.println("Not Possible!! \nYour Current Amount is " + this.balance);
        }
        else{
            this.balance = balance - withdrawal_funds;
        }
    }
}
