package Entity;

public class Flower implements Comparable<Flower> {
    private String id;
    private String name;
    private Soil soil;
    private String origin;
    private VisualParameters parameters;
    private GrowingTips tips;
    private Multiplying multiply;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Soil getSoil() {
        return soil;
    }

    public void setSoil(Soil soil) {
        this.soil = soil;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public VisualParameters getParameters() {
        return parameters;
    }

    public void setParameters(VisualParameters parameters) {
        this.parameters = parameters;
    }

    public GrowingTips getTips() {
        return tips;
    }

    public void setTips(GrowingTips tips) {
        this.tips = tips;
    }

    public Multiplying getMultiply() {
        return multiply;
    }

    public void setMultiply(Multiplying multiply) {
        this.multiply = multiply;
    }

    public Flower() {
    }

    public Flower(String name, Soil soil, String origin, VisualParameters parameters, GrowingTips tips,
                  Multiplying multiply) {
        this.name = name;
        this.soil = soil;
        this.origin = origin;
        this.parameters = parameters;
        this.tips = tips;
        this.multiply = multiply;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", soil=" + soil +
                ", origin='" + origin + '\'' +
                ", parameters=" + parameters +
                ", tips=" + tips +
                ", multiply=" + multiply +
                "} \n";
    }




    @Override
    public int compareTo(Flower o) {

        return (int) (this.parameters.getSize() - o.parameters.getSize());
    }
}
