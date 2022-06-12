package Filter;

import java.util.ArrayList;
import java.util.List;

class Product{
    int id;
    String name;
    double price;

    public Product(int id, String name, double price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
}

public class Filter2 {
    public static void main(String[] args) {

        List<Product> productList= new ArrayList<>();
        productList.add(new Product(1,"John", 25000));
        productList.add(new Product(2,"JohnWick", 50000));
        productList.add(new Product(3,"Marry", 30000));
        productList.add(new Product(4,"Janice", 35000));

        productList.stream().filter(p-> p.price>25000).forEach(pr-> System.out.print(pr.price+ " "));

    }
}
