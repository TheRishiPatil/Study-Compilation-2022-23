package Exercise;

public class exercise33_3 { // Calculator
    private exercise33_1 floor;
    private exercise33_2 carpet;

    

    public exercise33_3(exercise33_1 floor, exercise33_2 carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }



    public double getTotalCost(){
        return carpet.getCost() * floor.getArea();
    }
}
