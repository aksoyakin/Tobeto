package homeworks.hw2.youtube.oop.oopdersi;

public class MilitaryCreditManager implements ICreditManager {
    @Override
    public void calculate() {
        System.out.println("Asker kredisi hesaplandi.");
    }

    @Override
    public void save() {
        System.out.println("Asker kredisi verildi.");
    }
}