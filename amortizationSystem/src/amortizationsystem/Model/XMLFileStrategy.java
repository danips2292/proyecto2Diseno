
package amortizationsystem.Model;

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
    public String createFile(LoanDTO loanDTO) {
        DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance(); 
        DocumentBuilder db; 
        try {
            db = dbf.newDocumentBuilder();
            // Read books.xml file 
        Document dct; 
        try {
            //dct = db.parse("C:\\Users\\aleja\\Desktop\\proyecto2Diseno\\amortizationSystem1\\XMLFile.xml");
            dct = db.parse("C:\\Users\\familia\\Beto\\Cursos\\I Semestre 2016\\Diseño de Software\\proyecto2Diseno\\amortizationSystem\\XMLFile.xml");
            Element child1 = dct.createElement("Cliente"); 
            Element root = dct.getDocumentElement();
            root.appendChild(child1); 
            // Get the element from the user.. 
            Text dueno = dct.createTextNode(loanDTO.getOwner()); 
            // Append the element to existing XML file 
            root.getLastChild().appendChild(dueno);
            //agregamos nuevo elemento
            
            Element tipoCambio = dct.createElement("TipoCambio");
            root.appendChild(tipoCambio);
            Text tipoC = dct.createTextNode(loanDTO.getResourceManagerList().get(1).getResource()+" BCCR");
            root.getLastChild().appendChild(tipoC);
                    
            Element montoAhorro = dct.createElement("MontoPrestamo");
            root.appendChild(montoAhorro);
            Double amount = loanDTO.getAmount();
            Text monto = dct.createTextNode(amount.toString());
            root.getLastChild().appendChild(monto);
            
            Element plazoInversion = dct.createElement("PlazoPrestamo");
            root.appendChild(plazoInversion);
            int plazo = loanDTO.getTerm();
            Text plazoInv = dct.createTextNode(Integer.toString(plazo));
            root.getLastChild().appendChild(plazoInv);
            
            Element tipoCuenta = dct.createElement("SistemaAmortizacion");
            root.appendChild(tipoCuenta);
            Text tipoCuent = dct.createTextNode(loanDTO.getAmortizationSystem());
            root.getLastChild().appendChild(tipoCuent);
            
            Element interesAnual = dct.createElement("InteresAnual");
            root.appendChild(interesAnual);
            float interesA = loanDTO.getAnualInterest();
            Text interes = dct.createTextNode(Float.toString(interesA));
            root.getLastChild().appendChild(interes);
            
            Element tablaCompleta = dct.createElement("TablaAmortizacion");
            root.appendChild(tablaCompleta);
            AmortizationTable tab = loanDTO.getTable();
            Text tablaAmorti = dct.createTextNode(tab.toString(plazo));
            root.getLastChild().appendChild(tablaAmorti);

            // Create blank document 
            Document mainDoc = db.newDocument(); 
            Element root1 = mainDoc.createElement("DatosCliente");
            mainDoc.appendChild(root1);
            

            // Copy the existing XML file with newly created element 
            root1.appendChild(mainDoc.importNode(root, true)); 

            // Save the created DOM tree to XML file... 

            Transformer transformer = TransformerFactory.newInstance().newTransformer(); 
            transformer.setOutputProperty(OutputKeys.INDENT, "yes"); 
            //StreamResult result = new StreamResult(new FileWriter("C:\\Users\\Daniel\\Documents\\TEC\\I Semestre 2016\\Diseno\\Proyecto2\\proyecto2Diseno\\amortizationSystem\\XMLFile.xml"));
            StreamResult result = new StreamResult(new FileWriter("C:\\Users\\familia\\Beto\\Cursos\\I Semestre 2016\\Diseño de Software\\proyecto2Diseno\\amortizationSystem\\XMLFile.xml"));
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



            return loanDTO.getOwner();
        } 
     } 

    
