class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name:- " + name);
        System.out.println("Age:- " + age);
    }
}


public class Employee extends Person {
    private int id;

    Employee(String name, int age) {
        super(name, age);
    }

    @Override
    public void displayDetails() {
        id = (int) Math.floor(Math.random()*1000);
        super.displayDetails();

        System.out.println("id:- " + id);
    }
    

    public static void main(String[] args){
        Employee employee = new Employee("Md Ataurrab", 23);
        employee.displayDetails();
    }
}
