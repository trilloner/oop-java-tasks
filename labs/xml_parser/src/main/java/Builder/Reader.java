package Builder;

public enum Reader {
    Empty("empty"),
    Flower("flower"),
    Name("name"),
    Soil("soil"),
    Origin("origin"),
    VisualParameters("visual-parameters"),
    StemColor("stemColor"),
    LeaveColor("leaveColor"),
    Size("size"),
    GrowingTips("growing-tips"),
    Temperature("temperature"),
    Light("light"),
    Watering("watering"),
    Multiplying("multiplying");


    private String type;

    Reader(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return this.type;
    }
}
