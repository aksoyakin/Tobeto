package lessons.lesson3.business.concretes;

import lessons.lesson3.dataAccess.concretes.ProductDao;
import lessons.lesson3.entities.Product;

import java.util.List;

public class ProductManager {
    ProductDao productDao = new ProductDao();
    public void add(Product product){
        //business rules yazılır
        //iş kurallarından geçerse dao çalışır.
        productDao.add(product);
    }
    public List<Product> getAll(){

        return productDao.getAll();
    }
}
