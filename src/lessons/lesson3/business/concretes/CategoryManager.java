package lessons.lesson3.business.concretes;

import lessons.lesson3.dataAccess.concretes.CategoryDao;
import lessons.lesson3.entities.Category;

import java.util.List;

public class CategoryManager {
    CategoryDao categoryDao = new CategoryDao();
    public void add(Category category){
        categoryDao.add(category);
    }
    public List<Category> getAll(){
        return categoryDao.getAlll();
    }
}
