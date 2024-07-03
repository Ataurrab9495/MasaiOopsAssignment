// Polymorphism
/* 1. **Method Overloading:**
    - Create a class `MathOperations` with overloaded methods `multiply(int a, int b)`,
     `multiply(int a, int b, int c)`, and `multiply(double a, double b)`. Write a main method to 
     test these methods. */

public class MathOperations {
    public void multiply(int a, int b){
        System.out.println("2 digits multiply:- "+ a*b);
    }

    public void multiply(int a , int b, int c){
        System.out.println("3 digits multiply:- "+ a*b*c);
    }

    public void multiply(double a, double b){
        System.out.println("double multiply:- "+ (double) a*b);
    }



    public static void main(String[] args){
        MathOperations mp = new MathOperations();

        mp.multiply(2,3);
        mp.multiply(2,3 ,4);
        mp.multiply(5,6);
    }
}
