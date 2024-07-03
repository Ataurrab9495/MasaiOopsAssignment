public class MainClass {
    public static void main(String[] args){
        Car car = new Car();
        car.move();

        Bicycle by = new Bicycle();
        by.move();
    }
}

interface Movable {
    public void move();
}

class Car implements Movable {
    @Override
    public void move() {
        System.out.println("Car is moving.");
    }
}

class Bicycle implements Movable {
    @Override
    public void move() {
        System.out.println("Bicycle is moving.");
    }
}
