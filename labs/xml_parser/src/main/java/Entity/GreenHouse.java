package Entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GreenHouse {
    private List<Flower> flowers;

    public GreenHouse(List<Flower> flowers) {
        this.flowers = flowers;
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public void addFlower(Flower flower) {
        this.flowers.add(flower);
    }

    public GreenHouse() {
        flowers = new ArrayList<>();
    }

    public void sortFlowers(){
        Collections.sort(flowers);
    }

    @Override
    public String toString() {
        return "Greenhouse{" +
                "flowers=" + flowers +
                "}";
    }
}
