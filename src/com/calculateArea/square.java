package com.calculateArea;

public class square {
    public square(int x, int y){
        height = x;
        width = y;
    }

    public int getHeight() {

        return height;
    }

    public void setHeight(int height) {

        height = height;
    }

    public int getWidth() {

        return width;
    }

    public void setWidth(int width) {

    }

    private int height, width;

    public int calculateArea(){
        return height*width ;
    }
}
