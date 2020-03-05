package com.epam.lab.hw_14_xml.task5;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.task5("src/main/java/com/epam/lab/hw_14_xml/task1_2/file.xml",
                "src/main/java/com/epam/lab/hw_14_xml/task1_2/file.xsd"));
    }

    private boolean task5(String xml, String xsd) {
        SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        try {
            Schema schema = factory.newSchema(new File(xsd));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(new File(xml)));
        } catch (SAXException | IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
