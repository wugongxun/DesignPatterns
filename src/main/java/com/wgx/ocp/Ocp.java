package com.wgx.ocp;

/**
 * @author wgx
 * @since 2023/4/11 14:38
 */
public class Ocp {
    public static void main(String[] args) {
        GraphicEditor editor = new GraphicEditor();
        editor.drawShape(new Rectangle());
        editor.drawShape(new Circle());
    }
}

abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}

class GraphicEditor {
    public void drawShape(Shape shape) {
        shape.draw();
    }
}