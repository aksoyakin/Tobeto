package homeworks.hw2.kodlamaio;

public class Course {
    int id;
    String name;
    String description;
    String startDate;
    String endDate;
    int price;
    Category category;
    Instructor instructor;

    public Course(int id, String name, String startDate, String description, String endDate, int price) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
        this.description = description;
        this.id = id;
        // printInfo();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public void printInfo(){
        System.out.println("\nName: " + name +
                "\nDescription: " + description +
                "\nIntsructor: " + instructor.getName() + " " + instructor.getSurname() +
                "\nStart Date: " + startDate +
                "\nEnd Date: " + endDate +
                "\nPrice: " + price +
                "\nCategory: " + category.getName());
    }
}
