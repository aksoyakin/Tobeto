package tobetocalisma;

public abstract class BeyazYaka implements Calisan{
    // abstact == soyut.
    // abstract classlar newlenemez.
    // nesnesi/objesi oluşturulamaz.
    // instance oluşturulamaz.
    // abstract

    private String name;
    private int id;
    @Override
    public void calis() {

    }

    @Override
    public void izneCik() {

    }

    public BeyazYaka(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public abstract void calisiyor();

    public void yemegeCikar(){
        System.out.println("yemekteyim.");
    }
}
