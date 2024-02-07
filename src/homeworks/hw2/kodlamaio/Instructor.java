package homeworks.hw2.kodlamaio;

public class Instructor {
    int id;
    private String name;
    private String surname;
    private Course course;

    public Instructor(int id,String name, String surname, Course course) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Instructor() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void printInfo(){
        System.out.println("\nName: " + name +
                "\nSurname: " + surname +
                "\nCourse: " + course.getName());
    }
}
