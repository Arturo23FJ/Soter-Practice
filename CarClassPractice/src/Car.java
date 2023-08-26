public class Car {
    private String type;
    private int speed;
    private int direction;

    Car(String type, int speed, int direction) {
        this.type = type;
        if (speed < 0) {
            this.speed = 0;
        } else {
            this.speed = speed;
        }
        this.direction = Math.abs(direction % 360);
    }

    public String toString() {
        return "Type: " + type + ", Speed: " + speed + ", Direction: " + direction;
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
        if (speed < 0) {
            this.speed = 0;
        } else {
            this.speed = speed;
        }
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
}
