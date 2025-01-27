package Practice4;

public class Product {
   String _id;
    String name;
    int price;
    String category;
    String brand ;
    public Product(String name,int price,String category,String brand){
        this.name= name;
        this.price=price;
        this.category= category;
        this.brand= brand;
    }


    void displayBook(){
        System.out.println("Book Description: \n name"+this.name+"\n  price: \n"+this.price+"\n  category: \n"+this.category+" \n Brand: "+this.brand);
    }
}
