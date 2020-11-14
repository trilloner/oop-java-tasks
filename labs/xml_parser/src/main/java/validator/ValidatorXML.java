package validator;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

public class ValidatorXML {

    public static boolean validate(String pathXml , String pathXsd){
        SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

        try{
            Schema schema = factory.newSchema(new File(pathXsd));
             Validator validator = schema.newValidator();
            validator.validate(new StreamSource(new File(pathXml)));
        }catch (IOException | SAXException e){
            System.out.println("Error: " + e.getMessage());
            return false;
        }
        return true;
    }
}
