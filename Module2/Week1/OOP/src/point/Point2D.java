package point;

import java.util.Arrays;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D(){

    }

    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX(){
        return x;
    }

    public void setX(float x){
        this.x = x;
    }

    public float getY(){
        return y;
    }

    public void setY(float y){
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){
        float arr[] = new float[2];
        arr[0] = getX();
        arr[1] = getY();
        return arr;
    }

    public String toString(){
        return String.format("X = %f\t Y = %f\n%s",getX(),getY(), Arrays.toString(getXY()));
    }
}
