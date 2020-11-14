package Parser;

import Entity.GreenHouse;
import validator.ValidatorXML;

public class GreenHouseParser {
    private FlowerParser<GreenHouse> parser;

    public GreenHouseParser(FlowerParser<GreenHouse> parser) {
        this.parser = parser;
    }

    public GreenHouse parse (String xml, String xsd){
        if (!ValidatorXML.validate(xml, xsd)){
            return null;
        }
        try{
            return parser.parseFlower(xml);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

}
