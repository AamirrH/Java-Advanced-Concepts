package Inheritance;


interface Shape {
    void draw();
    default void exist(){
        System.out.println("Shape is existing");

    }
    static void print(){
        System.out.println("Shape is printing");
    }
}


class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Circle");
    }

    public void radius() {
        System.out.println("Radius");
    }
}


public class Interfaces {
    void main(){
        Shape shape = new Circle();
        shape.draw(); // We can only access the overridden or default methods of the interface
        shape.exist();
        Circle circle = new Circle();
        circle.radius();
        circle.draw();
        circle.exist();
        /*By using circle as reference variable we can call all methods of circle as well as default methods of
        interface since the class implements the interface */



    }

}
