package org.example;

public class Wall {

    //instance variable
    double width;
    double height;


    //constructor
    public Wall(double width, double height ){
        this.height = height;
        this.width = width;
    }

    //width değerini döndüren method
    public double getWidth() {
        return width;
    }

    // height değerini döndüren method
    public double getHeight() {
        return height;
    }

    // width değerini set eden method
    public void setWidth(double width) {
        this.width = (width < 0) ? 0 : width;
    }

    // height değerini set eden method
    public void setHeight(double height) {
        this.height = (height < 0) ? 0 : height;
    }

    // Alanı hesaplayan method
    public double getArea() {
        return width * height;
    }
}
