package AbsFile;

abstract class Appliance {
    public abstract void turnOn();
}

class WashingMachine extends Appliance {
    @Override
    public void turnOn() {
        System.out.println("Washing Machine is turned on.");
    }
}

class Refrigerator extends Appliance {
    @Override
    public void turnOn() {
        System.out.println("Refrigerator is turned on.");
    }
}


public class Main {
    public static void main(String[] args) {
        Refrigerator ref = new Refrigerator();
        ref.turnOn();


        WashingMachine ws = new WashingMachine();
        ws.turnOn();
    }
}
