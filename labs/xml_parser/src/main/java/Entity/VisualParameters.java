package Entity;

public class VisualParameters {
    private String stemColor;
    private String leafColor;
    private float size;


    public VisualParameters(String stemColor, String leafColor, float size) {
        this.stemColor = stemColor;
        this.leafColor = leafColor;
        this.size = size;
    }

    public VisualParameters() {
    }

    public String getStemColor() {
        return stemColor;
    }

    public void setStemColor(String stemColor) {
        this.stemColor = stemColor;
    }

    public String getLeafColor() {
        return leafColor;
    }

    public void setLeafColor(String leafColor) {
        this.leafColor = leafColor;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "VisualParameters{" +
                "stemColor='" + stemColor + '\'' +
                ", leafColor='" + leafColor + '\'' +
                ", size=" + size +
                '}';
    }
}
