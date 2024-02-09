package lessons.lesson3;

import lessons.lesson3.business.concretes.CategoryManager;
import lessons.lesson3.business.concretes.ProductManager;
import lessons.lesson3.entities.Category;
import lessons.lesson3.entities.Product;

public class Main {
    public static void main(String[] args) {
        //productlar
        Product product1 = new Product();
        product1.setId(7);
        product1.setName("Laptop");
        product1.setUnitPrice(20000);
        product1.setDiscountRate(10);
        Product product2 = new Product(8,"GSM",25000,15);
        Product product3 = new Product(8,"Mutfak Robotu", 1200,10);

        //categoriler
        Category category1 = new Category(3,"Beyaz Eşya");
        Category category2 = new Category(4,"Meyve ve Sebze");

        //product manageri çağırdım ve ürünü ekledim
        ProductManager productManager = new ProductManager();
        productManager.add(product1);

        //kategori manageri çağırdım ve kategori ekledim
        CategoryManager categoryManager = new CategoryManager();
        categoryManager.add(category1);

        //productları yazdirma
        for (Product product : productManager.getAll()){
            System.out.println(product.getName());
        }

        //categorileri yazdirma
        for (Category category : categoryManager.getAll()){
            System.out.println(category.getName());
        }

    }
}
