public class Rectangle {
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = checkValueOfParameter(sideA);
        this.sideB = checkValueOfParameter(sideB);
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = checkValueOfParameter(sideA);
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = checkValueOfParameter(sideB);
    }

    private int checkValueOfParameter(int side){
        if (side < 0){
            side = 1;
        }
        return side;
    }

    public int area(){
        return this.sideA * this.sideB;
    }

    public int perimeter(){
        return 2 * (this.sideA + this.sideB);
    }
}
