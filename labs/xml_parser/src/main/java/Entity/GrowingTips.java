package Entity;

import java.util.Objects;

public class GrowingTips {
    private float temperature;
    private boolean heliophilous;
    private int watering;

    public GrowingTips() {
    }

    public GrowingTips(float temperature, boolean heliophilous, int watering) {
        this.temperature = temperature;
        this.heliophilous = heliophilous;
        this.watering = watering;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public void setHeliophilous(boolean heliophilous) {
        this.heliophilous = heliophilous;
    }

    public void setWatering(int watering) {
        this.watering = watering;
    }

    public float getTemperature() {
        return temperature;
    }

    public boolean isHeliophilous() {
        return heliophilous;
    }

    public int getWatering() {
        return watering;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GrowingTips that = (GrowingTips) o;
        return Float.compare(that.temperature, temperature) == 0 &&
                heliophilous == that.heliophilous &&
                watering == that.watering;
    }

    @Override
    public int hashCode() {
        return Objects.hash(temperature, heliophilous, watering);
    }

    @Override
    public String toString() {
        return "VisualParameters{" +
                "temperature=" + temperature +
                ", heliophilous=" + heliophilous +
                ", watering=" + watering +
                '}';
    }
}
