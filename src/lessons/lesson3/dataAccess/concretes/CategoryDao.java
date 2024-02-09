package lessons.lesson3.dataAccess.concretes;

import lessons.lesson3.entities.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryDao {
    private List<Category> categories;

    public CategoryDao(){
        //hazir kategoriler varmiş gibi düşün
        categories = new ArrayList<>();
        categories.add(new Category(1,"Elektronik"));
        categories.add(new Category(2,"Mufak Eşyaları"));

    }
    public void add(Category category){
        categories.add(category);
    }
    public List<Category> getAlll(){
        return categories;
    }
}
