class Animal {
    public void makeSound() {
        System.out.println("Animals makes sound.");
    }
}

class Mammal extends Animal {
    public void walk() {
        System.out.println("Animals walks.");
    }
}

class Dog extends Mammal {
    @Override
    public void makeSound(){
       /*  super.makeSound(); */
        System.out.println("Dog barks.");
    }
}



public class MultilevelInheritence {
    public static void main(String[] args){
        Dog dog = new Dog();

        dog.makeSound();
        dog.walk();
    }
};
