package Exercise;

public class exercise30_1 {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return this.firstName;
    }

    public String getlastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int setAge(int age) {
        if (age < 0 || age > 100) {
            return this.age = 0;
        }
            return this.age = age;
    }

    public boolean isTeen() {
        if (age < 20 && age > 12) {
            return true;
        }
        return false;
    }

    public String getFullName() {
        if (lastName == null && firstName != null) {
            return firstName;
        } else if (firstName == null && lastName != null) {
            return lastName;
        } else if (firstName == null && lastName == null) {
            return ":/";
        }
        return firstName + " " + lastName;
    }


}