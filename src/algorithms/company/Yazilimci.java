package algorithms.company;

public class Yazilimci extends BeyazYaka{

    private String pcModel;

    public String getPcModel() {
        return pcModel;
    }

    public void setPcModel(String pcModel) {
        this.pcModel = pcModel;
    }

    public String getUzmanlikAlani() {
        return uzmanlikAlani;
    }

    public void setUzmanlikAlani(String uzmanlikAlani) {
        this.uzmanlikAlani = uzmanlikAlani;
    }

    private String uzmanlikAlani;
    public Yazilimci(String pcModel, String uzmanlikAlani,String name, int id) {
        super(name, id);
        this.pcModel = pcModel;
        this.uzmanlikAlani = uzmanlikAlani;
    }


    @Override
    public void calisiyor() {
        System.out.println("yazilimci çalişiyor");
    }
}
