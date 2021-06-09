package point;

import java.util.Arrays;

public class MoveablePoint extends Point{
    private float xSpped = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint(){

    }

    public MoveablePoint(float x, float y, float xSpped, float ySpeed){
        super(x,y);
        this.xSpped = xSpped;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float xSpped, float ySpeed){
        this.xSpped = xSpped;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed(){
        return xSpped;
    }

    public void setXSpped(float xSpped){
        this.xSpped = xSpped;
    }

    public float getYSpeed(){
        return ySpeed;
    }

    public void setYSpeed(float ySpeed){
        this.ySpeed =  ySpeed;
    }

    public void setSpeed(float xSpped, float ySpeed){
        this.xSpped = xSpped;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        float[] arr = new float[2];
        arr[0] = getXSpeed();
        arr[1] = getYSpeed();
        return arr;
    }

    public String toString(){
        return String.format("(%.1f,%.1f), speed = %s",getX(),getY(), Arrays.toString(getSpeed()));

    }

    public MoveablePoint move(){
        super.setX(super.getX() + xSpped);
        super.setY(super.getY() + ySpeed);
        return this;

    }


}
