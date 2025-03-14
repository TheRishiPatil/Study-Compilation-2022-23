public class practice18_1 {
    private String name;
    private int credit_limit;
    private String email_id;

    public practice18_1() {
        this("Enter Name\n", 00, "\nEnter Email Address");
    }

    public practice18_1(String name, int credit_limit, String email_id) {
        this.name = name;
        this.credit_limit = credit_limit;
        this.email_id = email_id;
    }

    public practice18_1(String name, int credit_limit) {
        this(name, credit_limit, "Enter Email Address");
    }

    public String getName() {
        return name;
    }

    public int getCredit_limit() {
        return credit_limit;
    }

    public String getEmail_id() {
        return email_id;
    }
}