package composition;

class Engine {
    private int horsePower;
    private String type;

    public Engine(int horsePower, String type){
        this.horsePower = horsePower;
        this.type = type;
    }
    public void displayEngineDetails() {
        System.out.println("Engine HorsePower: " + horsePower);
        System.out.println("Engine Type: " + type);
    }
}

class Car {
    private String model;
    private Engine engine;

    public Car(String model, Engine engine){
        this.model = model;
        this.engine = engine;
    }

    public void displayCarDetails() {
        System.out.println("Car Model:- " + model);
        engine.displayEngineDetails();
    }
}

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(200, "V6");

        
        Car car = new Car("Toyota Camry", engine);

        
        car.displayCarDetails();
    }
}
