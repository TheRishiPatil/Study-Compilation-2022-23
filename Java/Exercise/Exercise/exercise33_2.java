package Exercise;

public class exercise33_2 { // Carpet
    private double cost;

    public exercise33_2(double cost) {
        if (this.cost < 0) {
            this.cost = 0;
        } else {
            this.cost = cost;
        }
    }

    public double getCost() {
        return this.cost;
    }
}
