package Ecommerce;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Product pr1 = new Product(1, "Macbook Air", 99999.00);
        Product pr2 = new Product(2, "Iphone", 89999.00);
        Product pr3 = new Product(3, "Redmi", 9999.00);
        Product pr4 = new Product(4, "keyboard", 999.00);
        Product pr5 = new Product(5, "MousePad", 99.00);
        
        Orders order = new Orders("111");

        order.addproduct(pr1);
        order.addproduct(pr2);
        order.addproduct(pr3);
        order.addproduct(pr4);
        order.addproduct(pr5);

        System.out.println();
        order.displayProducts();
    }
}


class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price){
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

   

    // getter functions
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "ProductId:- " + productId + ", Name: " + name + ", Price: " +price ;
    }
};

class Orders {
    private String orderId;
    private ArrayList<Product> products;

    public Orders(String orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    // adding product
    public void addproduct(Product product){
        products.add(product);
    }

    public void displayProducts(){
        System.out.println("orderId:- "+ orderId);
        for(int i=0; i<products.size(); i++){
            System.out.println(products);
        }
    }
};