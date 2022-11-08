package pointAndmoveablepoint;


import java.util.Arrays;

public class MoveablePoint extends Point{
    private float xSpeed = 0f;
    private float ySpeed = 0f;


    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(){
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        return new float[]{this.xSpeed, this.ySpeed};
    }

    @Override
    public String toString() {
        super.getXY();
        return "MoveablePoint{" +
                "x=" + getX()  +
                ", y=" + getY()  +
                " xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
    public MoveablePoint move(){

       super.setX(super.getX() + xSpeed); // x += xSpeed
        super.setY(super.getY() + ySpeed);// y += ySpeed

        return this;
    }

    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(1,1,2,2);
//        System.out.println(Arrays.toString(moveablePoint.move());
        System.out.println(moveablePoint.move());
    }
}
