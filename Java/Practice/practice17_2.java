public class practice17_2 {
    public static void main(String[] args) {
        practice17_1 bank = new practice17_1();
        bank.setCustomerName("Rishikesh Krishna Patil");
        System.out.println(bank.getCustomerName());

        bank.setAccountNumber(123);
        System.out.println(bank.getAccounNumber());

        bank.setBalance(12345);
        System.out.println(bank.getbalance());

        bank.setDeposit(50000);
        System.out.println(bank.getDeposit());

        System.out.println(bank.getbalance()); // getbalance stored new amount.
        
        bank.setWithdrawal(50000);
        System.out.println(bank.getWithdrawal());

        bank.setWithdrawal(12346);
        System.out.println(bank.getWithdrawal());
    }
}
