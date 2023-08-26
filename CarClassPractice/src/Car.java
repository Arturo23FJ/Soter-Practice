public class Car {
    private String type;
    private int speed;
    private int direction;
    private int price;

    Car(String type, int speed, int direction, int price) {
        this.type = type;
        this.speed = Math.max(speed, 0);
        this.direction = Math.abs(direction % 360);
        this.price = Math.max(price, 0);
    }

    public String toString() {
        return "Type: " + this.type + ", Speed: " + this.speed + ", Direction: " + this.direction
                + ", Price: " + this.price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = Math.max(speed, 0);
    }

    public void setDirection(int direction) {
        this.direction = direction % 360;
        if (direction < 0) {
            this.direction = 360 - Math.abs(direction);
        }
    }

    public int getDirection() {
        return this.direction;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = Math.max(price, 0);
    }
}
