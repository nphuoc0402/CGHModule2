package QuadraticEquation;

import java.util.Scanner;

public class QuadraticEquation {
    private double a,b,c;

    public QuadraticEquation(double a, double b, double c){
        this.a =a;
        this.b = b;
        this.c = c;
    }

    public void setA(double a){
        this.a = a;
    }

    public void setB(double b){
        this.b = b;
    }

    public void setC(double c){
        this.c = c;
    }
    public double getA(){return a;}
    public double getB(){return b;}
    public double getC(){return c;}

    public double getDiscriminant(){
        double delta = Math.pow(this.b,2)-4*this.a*this.c;
        return delta;
    }
    public double getRoot1(){
        double r1 = 0;
        if(this.getDiscriminant()>=0){
            r1 = (-b-(Math.pow(getDiscriminant(),0.5)))/(a*2);
        }
        return r1;
    }

    public double getRoot2(){
        double r2 = 0;
        if(this.getDiscriminant()>=0){
            r2 = (-b+(Math.pow(getDiscriminant(),0.5)))/(a*2);
        }
        return r2;
    }
    public static class Quadratic{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            double a,b,c;
            System.out.println("Enter the number a:");
            a = input.nextDouble();
            System.out.println("Enter the number b: ");
            b = input.nextDouble();
            System.out.println("Enter the number c: ");
            QuadraticEquation pt2 = new QuadraticEquation(a,b,c);
            System.out.println(pt2.getDiscriminant());
            if(pt2.getDiscriminant()>0){
                System.out.printf("The equation has two roots %f and %.1f",pt2.getRoot1(),pt2.getRoot2());
            }else if(pt2.getDiscriminant()==0){
                System.out.printf("The equation has one root %.1f",pt2.getRoot1());
            }else{
                System.out.printf("The equation has no real roots ");
            }
        }
    }
}
