package homeworks.hw2.kodlamaio;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course(1,"Java & React","08.02.2024","Java öğrenmek için bizi seçin.","08.08.2024",0);
        Course course2 = new Course(2,"Phyton","08.02.2024","Denize phyton'a sarılır.", "08.10.2024",0);
        Course course3 = new Course(3,"Micro-services","08.02.2024","Micro-service öğren.","08.11.2024",0);
        Course course4 = new Course(4,"Javascript","08.02.2024","JS Öğren.","08.10.2024",100);

        Category category1 = new Category(1,"Backend",course1);
        Category category2 = new Category(2,"Frontend",course2);
        Category category3 = new Category(3,"Fullstack",course3);
        Category category4 = new Category(4,"Yazilim Gelistirme",course4);

        Instructor teacher1 = new Instructor(1,"Engin","Demiroğ",course1);
        Instructor teacher2 = new Instructor(2,"Halit Enes", "Kalaycı",course2);
        Instructor teacher3 = new Instructor(3,"İrem","Balcı",course3);

        course1.setCategory(category1);
        course2.setCategory(category2);
        course3.setCategory(category3);
        course4.setCategory(category4);

        course1.setInstructor(teacher1);
        course2.setInstructor(teacher2);
        course3.setInstructor(teacher3);

        course1.printInfo();
    }
}
