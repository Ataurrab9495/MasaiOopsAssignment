/* 2. **Method Overriding:**
    - Create a superclass `Shape` with a method `draw()`. 
    Extend this class with `Circle` and `Rectangle`, each overriding the `draw()` method. 
    Write a main method to create an array of `Shape` objects and call `draw()` on each, 
    demonstrating runtime polymorphism. */


class Shape {
    public void draw() {
        System.out.println("This is Shape.");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("This is Circle.");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("This is Rectangle.");
    }
}

public class Overloading {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];

        shape[0] = new Circle();
        shape[1] = new Rectangle();
        shape[2] = new Circle();


        for(Shape s : shape){
            s.draw();
        }
    }    
}
