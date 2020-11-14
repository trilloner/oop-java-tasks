import Builder.GreenHouseBuilder;
import Entity.GreenHouse;
import Parser.FlowerSAXParser;
import Parser.GreenHouseParser;

public class Main {
    public static void main(String[] args) {

        String xml = "src\\main\\resources\\GreenHouse.xml";
        String xsd = "src\\main\\resources\\GreenHouse.xsd";
        String novalid = "src\\main\\resources\\NotValidXML.xml";
        FlowerSAXParser<GreenHouse> saxParser = new FlowerSAXParser<GreenHouse>(new GreenHouseBuilder());
        GreenHouseParser parser = new GreenHouseParser(saxParser);
        GreenHouse greenHouse = parser.parse(xml,xsd);
        System.out.println(greenHouse);
        greenHouse.sortFlowers();
        System.out.println(greenHouse);

    }
}
