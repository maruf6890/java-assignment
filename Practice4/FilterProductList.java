package Practice4;

import java.util.ArrayList;

public class FilterProductList {
     static ArrayList<Product> productList;

    static void addProduct(String name,int price, String category, String brand){
        Product p= new Product(name,price,category,brand);
        productList.add(p);
    }

    public static void filterProduct(int min, int max){
        for(Product p: productList){
            if(p.price>min  && p.price<max){
                p.displayBook();
            }
        }
    }
    public static void filterProduct(String key){
        for(Product p: productList){
            if(p.category.equals(key) || p.brand.equals(key)){
                p.displayBook();
            }
        }
    }
    public static void filterProduct(String key, int min, int max){
        for(Product p: productList){
            if((p.category.equals(key) || (p.brand.equals(key)) )&& (p.price>min  && p.price<max)){
                p.displayBook();
            }
        }
    }

    public static void filterProduct(String category,String brand, int min, int max){
        for(Product p: productList){
            if(p.category.equals(category) && p.brand.equals(brand) && (p.price>min  && p.price<max)){
                p.displayBook();
            }
        }
    }
    public static void main(String[] args){

        // Adding dummy products
        addProduct("Laptop", 500, "Electronics", "Dell");
        addProduct("Smartphone", 1000, "Electronics", "Apple");
        addProduct("Jeans", 50, "Clothing", "Levi's");
        addProduct("TV", 700, "Electronics", "Samsung");
        addProduct("Shoes", 80, "Footwear", "Nike");
        addProduct("Tablet", 300, "Electronics", "Lenovo");
        addProduct("T-Shirt", 30, "Clothing", "H&M");
        addProduct("Washing Machine", 1200, "Home Appliance", "LG");
        addProduct("Refrigerator", 1500, "Home Appliance", "Samsung");
        addProduct("Smartwatch", 250, "Electronics", "Fitbit");

        // Test filtering methods
        filterProduct(100, 800); // Products with price between 100 and 800
        filterProduct("Electronics"); // Products in the "Electronics" category or brand
        filterProduct("Samsung", 200, 1500); // Products by "Samsung" in price range
        filterProduct("Clothing", "Levi's", 10, 100); // Products in "Clothing" category and brand "Levi's"


    }
}
