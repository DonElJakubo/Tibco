package rekru.rozmowy.Tibco;
// Importowanie klas do obsługi XML
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;

public class parsowaniePlikuXML {
    // Tworzenie parsera XML
    SAXParserFactory factory = SAXParserFactory.newInstance();
    SAXParser saxParser = factory.newSAXParser();

    // Definiowanie obsługi zdarzeń dla parsera
    DefaultHandler handler = new DefaultHandler() {
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            System.out.println("Element: " + qName);
        }
    };

// Parsowanie pliku XML
saxParser.parse(new File("file.xml"), handler);
}
