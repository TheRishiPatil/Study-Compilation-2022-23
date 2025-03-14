package Core_Java_Topics;

public class Class_1 {
    private String model; 

    public void setModel(String model){

        String validModel = model.toLowerCase();

        if (validModel.equals("rishi") || validModel.equals("joker")) {
        this.model = model;
        } 
        else {
        this.model = "Unknown :/";
        }
    }

    public String getModel(){
        return this.model;
    }
}