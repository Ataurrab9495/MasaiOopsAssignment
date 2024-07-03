package EmployeeManagementSystem;

import java.util.*;

public class Main {
    public static void main(String[] args){
        List<Employee> emp = new ArrayList<Employee>();

        emp.add(new Developer("Md Ataurrab", 100000));
        emp.add(new Manager("Dean", 100000));

        for (Employee employee : emp) {
            System.out.println(employee);
            System.out.println("Bonus:- ₹ " + employee.CalculateBonus());
            System.out.println();
        }
    }
};

class Employee {
    public String name;
    public int salary;

    public Employee(String name, int salary){
        this.name =name;
        this.salary = salary;
    }

    public int CalculateBonus(){
        return salary + 1000;
    }

    @Override
    public String toString() {
        return "Employee's Name: " + name + ", and Salary: ₹" + salary ;
    }
};

class Manager extends Employee {
    public Manager(String name, int salary){
        super(name, salary);
    }

    @Override
    public int CalculateBonus(){
        return salary + 10000;
    }
};


class Developer extends Employee {
    public Developer(String name, int salary){
        super(name, salary);
    };

    @Override
    public int CalculateBonus(){
        return salary + 100000;
    }
}
