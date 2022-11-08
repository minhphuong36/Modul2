package point2Dpoint3D;

import java.util.Arrays;

public class Point3D extends Point2D{
    private float z = 0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = 3;
    }
    public void setXYZ(float x,float y, float z){
       super.getXY();
       this.z = z;
    }
    public float[] getXYZ(){
        return new float[]{this.getX(),this.getY(),this.z};
    }

    @Override
    public String toString() {
        super.getXY();
        return "Point3D{" +
                "x = " + getX() +
                " y = " + getY() +
                " z = " + z +
                '}';
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D(3,6,8);
        System.out.println(point3D);
//        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}
