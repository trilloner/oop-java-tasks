package Builder;

import Entity.*;

public class GreenHouseBuilder implements Builder<GreenHouse> {

    private Reader state = Reader.Empty;

    private GreenHouse greenHouse = new GreenHouse();
    private Flower flower = null;
    private VisualParameters visualParameters= new VisualParameters();
    private GrowingTips growingTips = new GrowingTips();

    public GreenHouseBuilder addTag(String tag) {

        state = getReader(tag);

        switch (state) {
            case Flower:
                this.flower = new Flower();
                break;
            case VisualParameters:
                this.visualParameters = new VisualParameters();
                break;
            case GrowingTips:
                this.growingTips = new GrowingTips();
                break;
            default:
                break;

        }
        return this;
    }

    public Builder closeTag(String tag) {
       Reader endTag = getReader(tag);
       switch (endTag){
           case Flower:
               greenHouse.addFlower(flower);
               break;
           case VisualParameters:
               flower.setParameters(visualParameters);
               break;
           case GrowingTips:
               flower.setTips(growingTips);
               break;
           default:
               break;
       }
        return this;

    }

    public Builder addAttribute(String name, String value) {
    if (name == null) return this;
    if (value == null) value = "";
    if (name.equalsIgnoreCase("id"))
        flower.setId(value);
    return this;

    }

    public Builder addData(String data) {
        switch (state){
            case Name:
                flower.setName(data);
                break;
            case Soil:
                flower.setSoil(Soil.valueOf(data));
                break;
            case Origin:
                flower.setOrigin(data);
                break;
            case Size:
                visualParameters.setSize(Float.parseFloat(data));
                break;
            case StemColor:
                visualParameters.setStemColor(data);
                break;
            case LeaveColor:
                visualParameters.setLeafColor(data);
                break;
            case Temperature:
                growingTips.setTemperature(Float.parseFloat(data));
                break;
            case Light:
                growingTips.setHeliophilous(Boolean.parseBoolean(data));
                break;
            case Watering:
                growingTips.setWatering(Integer.parseInt(data));
                break;
            case Multiplying:
                flower.setMultiply(Multiplying.valueOf(data));
                break;
            default:
                break;
        }
        return this;
    }

    public GreenHouse getRoot() {
        return greenHouse;
    }

    private Reader getReader(String tag){
        Reader[] readers = Reader.values();

        for (Reader temp : readers){
            if(tag.equalsIgnoreCase(temp.toString())){
                state = temp;
                return temp;
            }
        }
        return Reader.Empty;
    }
}
