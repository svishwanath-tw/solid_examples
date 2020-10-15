package com.dnivra26;

public class L_Rectangle {
    int width;
    int height;

    public L_Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        L_Rectangle rectangle = new L_Rectangle(5, 6);
        System.out.println(rectangle.getArea());
        Square square = new Square(4);
        square.setHeight(5);
        System.out.println(square.getArea());

        L_Rectangle re = new Square(4);
        re.setWidth(4);
        re.setHeight(5);
    }
}

class Square extends L_Rectangle {

    public Square(int side) {
        super(side, side);
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width;
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
        this.width = height;
    }
}
