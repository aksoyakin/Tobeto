package homeworks.hw2.kodlamaio;

public class Category {
    int id;
    String name;
    Course course;


    public Category(int id,String name, Course course) {
        this.name = name;
        this.course = course;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
