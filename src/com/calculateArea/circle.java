package com.calculateArea;

public class circle {
    public circle(int x){

        radius= x;
    }

    public int getRadios() {

        return radius;
    }

    public void setRadios(int radius) {
        this.radius = radius;
    }


    private int radius;

    public double calculateArea(){

        return Math.PI*radius*radius ;
    }
}
