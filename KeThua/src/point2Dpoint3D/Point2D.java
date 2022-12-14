package point2Dpoint3D;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Point2D {
    private float x = 0f;
    private  float y = 0f;

    public Point2D(){
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){
        return new float[]{this.x, this.y};
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
        Point2D point2D = new Point2D(3,5);
        System.out.println(point2D);
//        System.out.println(Arrays.toString(point2D.getXY()));
    }
}
