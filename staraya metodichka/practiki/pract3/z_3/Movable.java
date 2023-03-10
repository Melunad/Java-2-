package z_3;

public abstract class Movable {
    public abstract void moveUp();
    public abstract void moveDown();
    public abstract void moveRite();
    public abstract void moveLeft();
}


class MovblePoint extends Movable{
    public int x;
    public int y;
    public int xSpeed;
    public int ySpeed;

    public MovblePoint() {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovblePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void moveUp() {

    }

    public void moveDown() {

    }

    public void moveRite() {

    }

    public void moveLeft() {

    }

    public String toString() {
        return "MovblePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}

class MovbleCircle extends Movable{
    private int radius;
    private MovblePoint centr = new MovblePoint();

    public MovbleCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        centr = new MovblePoint(x,y,xSpeed,ySpeed);
    }

    public void moveUp() {

    }

    public void moveDown() {

    }

    public void moveRite() {

    }

    public void moveLeft() {

    }
}