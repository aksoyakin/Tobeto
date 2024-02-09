package lessons.lesson3.dataAccess.concretes;

import lessons.lesson3.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDao {
    private List<Product> products;
    public ProductDao(){
        //bellekte veri varmış gibi düşünmek için koyduk bunları
        products = new ArrayList<>();
        products.add(new Product(1,"Elma",20,10));
        products.add(new Product(2,"Armut",30,10));
        products.add(new Product(3,"Şeftali",40,10));
        products.add(new Product(4,"Çilek",50,10));
        products.add(new Product(5,"Karpuz",60,10));
        products.add(new Product(6,"Ayva",70,10));

    }
    public void add(Product product){
        products.add(product);

    }
    public List<Product> getAll(){
        return products;
    }
}
