package Core_Java_Topics;

public class Constructors_1 {
    private String column1;
    private String column2;
    private String column3;

    public Constructors_1() {
        this("No FirstName ", "No FatherName ", "No LastName ");
    } // <-- default constructor

    public Constructors_1(String column1, String column2, String column3) { // <-- Constructor can store more than one values
        this.column1 = column1;
        this.column2 = column2;
        this.column3 = column3;
    }

    public String getColumn1() {
        return column1;
    }

    public void setColumn1(String column1) {
        this.column1 = column1;
    }

    public String getColumn2() {
        return column2;
    }

    public void setColumn2(String column2) {
        this.column2 = column2;
    }

    public String getColumn3() {
        return column3;
    }

    public void setColumn3(String column3) {
        this.column3 = column3;
    }

}
