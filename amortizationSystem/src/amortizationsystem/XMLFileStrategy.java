
package amortizationsystem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

public class XMLFileStrategy implements SaveStrategy{
    
    @Override
    public String createFile(String datos) {
        
        /*try {

          DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
          DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

          // elemento raiz
          Document doc = docBuilder.newDocument();
          Element rootElement = doc.createElement("compania");
          doc.appendChild(rootElement);

          // empleado
          Element empleado = doc.createElement("empleado");
          rootElement.appendChild(empleado);

          // atributo del elemento empleado
          Attr attr = doc.createAttribute("id");
          attr.setValue("1");
          empleado.setAttributeNode(attr);

          // nombre
          Element nombre = doc.createElement("nombre");
          nombre.appendChild(doc.createTextNode("Daniel"));
          empleado.appendChild(nombre);

          // apellidos
          Element apellidos = doc.createElement("appellidos");
          apellidos.appendChild(doc.createTextNode("Pacheco"));
          empleado.appendChild(apellidos);

          // seccion
          Element seccion = doc.createElement("seccion");
          seccion.appendChild(doc.createTextNode("Archivos"));
          empleado.appendChild(seccion);

          // salario
          Element salario = doc.createElement("salario");
          salario.appendChild(doc.createTextNode("5000"));
          empleado.appendChild(salario);
          
          NodeList rootList = doc.getElementsByTagName("compania");
          Node root = rootList.item(0);
          
          Element user = doc.createElement("holaaaaa");
          root.appendChild(user);
          // append nuevo user
          /*Element dataTag = doc.getDocumentElement();
          Element peopleTag =  (Element) dataTag.getElementsByTagName("compania").item(0);

          Element newPerson = doc.createElement("person");

          Element firstName = doc.createElement("firstName");
          firstName.setTextContent("Tom");

          Element lastName = doc.createElement("lastName");
          lastName.setTextContent("Hanks");

          newPerson.appendChild(firstName);
          newPerson.appendChild(lastName);

          peopleTag.appendChild(newPerson);*/
          
          // escribimos el contenido en un archivo .xml
          /*TransformerFactory transformerFactory = TransformerFactory.newInstance();
          Transformer transformer = transformerFactory.newTransformer();
          DOMSource source = new DOMSource(doc);
          StreamResult result = new StreamResult(new File("C:\\Users\\Daniel\\Documents\\TEC\\I Semestre 2016\\Diseno\\Proyecto2\\proyecto2Diseno\\amortizationSystem\\XMLFile.csv"));
          //StreamResult result = new StreamResult(new File("archivo.xml"));
          
          
          
          // Si se quiere mostrar por la consola...
          // StreamResult result = new StreamResult(System.out);

          transformer.transform(source, result);

          System.out.println("File saved!");

          } catch (ParserConfigurationException pce) {
                  pce.printStackTrace();
          } catch (TransformerException tfe) {
                  tfe.printStackTrace();
          }
   return datos;
    }*/
        
        DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance(); 
        DocumentBuilder db; 
        try {
            db = dbf.newDocumentBuilder();
            // Read books.xml file 
        Document dct; 
        try {
            dct = db.parse("C:\\Users\\Daniel\\Documents\\TEC\\I Semestre 2016\\Diseno\\Proyecto2\\proyecto2Diseno\\amortizationSystem\\XMLFile.xml");
            Element child1 = dct.createElement("Banco"); 
        //	Get the root node so we can explore its children 

            Element root = dct.getDocumentElement(); 
            root.appendChild(child1); 
            // Get the element from the user.. 
            Text banco = dct.createTextNode("Nacional"); 
            // Append the element to existing XML file 
            root.getLastChild().appendChild(banco);
            //agregamos nuevo elemento
            Element moneda = dct.createElement("Moneda");
            root.appendChild(moneda);
            Text tipoMoneda = dct.createTextNode("Dolares");
            root.getLastChild().appendChild(tipoMoneda);


            // Create blank document 
            Document mainDoc = db.newDocument(); 
            Element root1 = mainDoc.createElement("Root");
            mainDoc.appendChild(root1);
            

            // Copy the existing XML file with newly created element 
            root1.appendChild(mainDoc.importNode(root, true)); 

            // Save the created DOM tree to XML file... 

            Transformer transformer = TransformerFactory.newInstance().newTransformer(); 
            transformer.setOutputProperty(OutputKeys.INDENT, "yes"); 
            StreamResult result = new StreamResult(new FileWriter("C:\\Users\\Daniel\\Documents\\TEC\\I Semestre 2016\\Diseno\\Proyecto2\\proyecto2Diseno\\amortizationSystem\\XMLFile.xml")); 
            DOMSource source = new DOMSource(mainDoc); 
            transformer.transform(source, result); 
            System.out.println("File saved!"); 

            } catch (SAXException ex) {
                Logger.getLogger(XMLFileStrategy.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(XMLFileStrategy.class.getName()).log(Level.SEVERE, null, ex);
            } catch (TransformerException ex) {
                Logger.getLogger(XMLFileStrategy.class.getName()).log(Level.SEVERE, null, ex);
            }
            } catch (ParserConfigurationException ex) {
                Logger.getLogger(XMLFileStrategy.class.getName()).log(Level.SEVERE, null, ex);
            }



            return datos;
        } 
     } 

    
