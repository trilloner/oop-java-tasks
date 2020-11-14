package Parser;

import Builder.Builder;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FlowerSAXParser<T> implements FlowerParser {

    private Builder<T> builder;

    public FlowerSAXParser(Builder<T> builder) {
        this.builder = builder;
    }

    @Override
    public Object parseFlower(String path) {
        SAXParserFactory factory = SAXParserFactory.newInstance();

        try {
            SAXParser parser = factory.newSAXParser();
            SAXHandler<T> handler = new SAXHandler<T>(builder);
            parser.parse(new File(path), handler);
        } catch (IOException | SAXException | ParserConfigurationException e) {
            Logger.getLogger(FlowerSAXParser.class.getName()).log(Level.INFO, "Got an exception");
        }

        return builder.getRoot();
    }

    public static class SAXHandler<T> extends DefaultHandler {
        private Builder<T> builder;

        public SAXHandler(Builder<T> builder) {
            this.builder = builder;
        }

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {
            String data = new String(ch, start, length);
            data = data.replace("\n", "").trim();
            if (!data.equals(""))
                builder.addData(data);
        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
            builder.closeTag(qName);
        }

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            builder.addTag(qName);
            for (int i = 0; i < attributes.getLength(); i++) {
                builder.addAttribute(attributes.getQName(i), attributes.getValue(i));
            }
        }
    }

}
