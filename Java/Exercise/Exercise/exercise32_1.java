package Exercise;

public class exercise32_1 {
    private int x;
    private int y;

    public exercise32_1(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public exercise32_1() {
        this(00, 00);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return distance(0, 0);
    }

    public double distance(int x, int y) {
        return Math.sqrt((this.x - x) * (this.x -x) + (this.y - y) * (this.y - y));
    }

    public double distance(exercise32_1 aonther) {
        return distance(aonther.x, aonther.y);
    }
}
