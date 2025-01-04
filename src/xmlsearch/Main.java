package xmlsearch;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a DocumentBuilderFactory
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            
            // Create a DocumentBuilder
            DocumentBuilder builder = factory.newDocumentBuilder();
            
            // Parse the XML file and build the Document
            Document document = builder.parse("employees.xml");
            
            // Normalize the XML structure
            document.getDocumentElement().normalize();
            
            // Get all elements with the tag name "Emp_Name"
            NodeList nodeList = document.getElementsByTagName("Emp_Name");
            
            // Loop through the NodeList and print the content of each element
            for (int i = 0; i < nodeList.getLength(); i++) {
                Element element = (Element) nodeList.item(i);
                System.out.println("Employee Name: " + element.getTextContent());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}