public class practice18_2 {
    public static void main(String[] args) {
        practice18_1 VipCustomer = new practice18_1();
        System.out.println(VipCustomer.getName() + VipCustomer.getCredit_limit() + VipCustomer.getEmail_id() + "\n");

        practice18_1 VipCustomer1 = new practice18_1("Rishikesh Krishna Patil", 10);
        System.out.println(VipCustomer1.getName() + "\n" + VipCustomer1.getCredit_limit() + "\n" + VipCustomer1.getEmail_id() + "\n");

        practice18_1 VipCustomer2 = new practice18_1("Rishikesh Krishna Patil", 10, "rishikeshpatil400@gmail.com");
        System.out.println(VipCustomer2.getName() + "\n" + VipCustomer2.getCredit_limit() + "\n" + VipCustomer2.getEmail_id() + "\n");

    }
}