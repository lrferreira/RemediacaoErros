package module.author.expertise.creation.sorters;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import module.author.expertise.creation.sorters.entity.ErrorType;
import module.author.expertise.creation.sorters.entity.ItemSorter;
import module.author.expertise.creation.sorters.entity.Sorter;
import module.author.expertise.creation.sorters.entity.SubErrorType;
import module.entity.MERFunction;
import module.entity.MultipleExternalRepresentation;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.thoughtworks.xstream.XStream;

public class XMLManager {

	public static Sorter parserSorter(File file) throws JAXBException, ParserConfigurationException, SAXException, IOException {
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        DocumentBuilder builder = factory.newDocumentBuilder();

         // Load the input XML document, parse it and return an instance of the

         // Document class.

         Document document = builder.parse(file);
//         List<Sorter> sorters = new ArrayList<Sorter>();
         Sorter sorter = new Sorter(null, null, null);

         NodeList nodeList = document.getDocumentElement().getChildNodes();

         for (int i = 0; i < nodeList.getLength(); i++) {

              Node node = nodeList.item(i);

              if (node.getNodeType() == Node.ELEMENT_NODE) {
            	  

                   Element elem = (Element) node;

                   // Get the value of the ID attribute.
                   Long idSorter = Long.parseLong(node.getAttributes().getNamedItem("id").getNodeValue());
           
                   // Get the value of all sub-elements.
                   //Integer id = Integer.parseInt(elem.getElementsByTagName("id")
                	//	   .item(0).getChildNodes().item(0).getNodeValue());
                   
                   String descriptionSorter = elem.getElementsByTagName("description")
                                       .item(0).getChildNodes().item(0).getNodeValue();
                   
                   sorter.setId(idSorter);
                   sorter.setDescription(descriptionSorter);
                   sorter.setItensSorter(new ArrayList<ItemSorter>());
                   
                  NodeList nodeListItens = elem.getElementsByTagName("itensSorter").item(0).getChildNodes();
                  for (int j = 0; j < nodeListItens.getLength(); j++){
                	  Node nodeItem = nodeListItens.item(j);
                	  if (nodeItem.getNodeType() == Node.ELEMENT_NODE) {
                		  ItemSorter item = new ItemSorter(idSorter, sorter, null, null, null, descriptionSorter);
                		  
                          Element elemItem = (Element) nodeItem;
                          Long idItem = Long.parseLong(elemItem.getElementsByTagName("id").item(0).getChildNodes().item(0).getNodeValue());
                          String statedError = elemItem.getElementsByTagName("statedError").item(0).getChildNodes().item(0).getNodeValue();
                          
                          item.setId(idItem);
                          //item.getRemediation().setStatedError(statedError);
                          
                          Node nodeErrorType = elemItem.getElementsByTagName("errorType").item(0);
                          Element elemErrorType = (Element) nodeErrorType;
                          Long idErrorType = Long.parseLong(elemErrorType.getElementsByTagName("id").item(0).getChildNodes().item(0).getNodeValue());
                          String descriptionErrorType = elemErrorType.getElementsByTagName("description").item(0).getChildNodes().item(0).getNodeValue();
                          
                          item.setErrorType(new ErrorType(idErrorType, descriptionErrorType, new ArrayList<SubErrorType>()));
                          
                          Node nodeSubErrorType = elemErrorType.getElementsByTagName("subErrorType").item(0);
                          Element elemSubErrorType = (Element) nodeSubErrorType;
                          if (elemSubErrorType.getElementsByTagName("id").getLength() > 0 ) {
                        	  Long idSubErrorType = Long.parseLong(elemSubErrorType.getElementsByTagName("id").item(0).getChildNodes().item(0).getNodeValue());
                        	  String descriptionSubErrorType = elemSubErrorType.getElementsByTagName("description").item(0).getChildNodes().item(0).getNodeValue();
                        	  item.getErrorType().getSubErrorTypes().add(new SubErrorType(idSubErrorType, descriptionSubErrorType, item.getErrorType()));
                          }
                          
                          Node nodeMerFunction = elemItem.getElementsByTagName("merFunction").item(0);
                          Element elemMerFunction = (Element) nodeMerFunction;
                          Long idMerFunction = Long.parseLong(elemMerFunction.getElementsByTagName("id").item(0).getChildNodes().item(0).getNodeValue());
                          String descriptionMerFunction = elemMerFunction.getElementsByTagName("description").item(0).getChildNodes().item(0).getNodeValue();                        	  
                          
                          item.setMerFunction(new MERFunction(idMerFunction, descriptionMerFunction));
                          
                          Node nodeRemediation = elemItem.getElementsByTagName("remediation").item(0);
                          Element elemRemediation = (Element) nodeRemediation;
                          Long idRemediation = Long.parseLong(elemRemediation.getElementsByTagName("id").item(0).getChildNodes().item(0).getNodeValue());
                          String descriptionRemediation = elemRemediation.getElementsByTagName("description").item(0).getChildNodes().item(0).getNodeValue();
                          
                          //item.setRemediation(new Remediation(idRemediation, descriptionRemediation, new ArrayList<MultipleExternalRepresentation>()));

                          
                          NodeList nodeListMers = elemItem.getElementsByTagName("mers").item(0).getChildNodes(); 
                          for (int k = 0; k < nodeListMers.getLength(); k++){
                        	  Node nodeMer = nodeListMers.item(k);
                        	  if (nodeMer.getNodeType() == Node.ELEMENT_NODE) {
                        		  Element elemMer = (Element) nodeMer;
                        		  Long idMer = Long.parseLong(elemMer.getElementsByTagName("id").item(0).getChildNodes().item(0).getNodeValue());
                                  String descriptionMer = elemMer.getElementsByTagName("description").item(0).getChildNodes().item(0).getNodeValue();
                                  String imageNameMer = elemMer.getElementsByTagName("imageName").item(0).getChildNodes().item(0).getNodeValue();
                                  
                                  MultipleExternalRepresentation mer = new MultipleExternalRepresentation();
                                  //mer.setTags(new ArrayList<String>());
                                  
                                  NodeList nodeListTags = elemMer.getElementsByTagName("tags").item(0).getChildNodes();
                                  for (int l = 0; l < nodeListTags.getLength(); l++){
                                	  Node nodeTag = nodeListTags.item(l);
                                	  if (nodeTag.getNodeType() == Node.ELEMENT_NODE) {
                                		  Element elemTag = (Element) nodeTag;
                                          String nameTag = elemTag.getElementsByTagName("name").item(0).getChildNodes().item(0).getNodeValue();
                                          //Tag tag = new Tag(nameTag);
                                          //mer.getTags().add(tag);
                                	  }
                                  }
                                  
                                  //item.getRemediation().getMers().add(mer);
                        	  }
                          }
                          sorter.getItensSorter().add(item);
                	  }
                  }

              }

         }


         return(sorter);

	}
	
	public static ArrayList<MERFunction> parserMERFunction(File file) throws JAXBException, ParserConfigurationException, SAXException, IOException {
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        DocumentBuilder builder = factory.newDocumentBuilder();

         // Load the input XML document, parse it and return an instance of the

         // Document class.

         Document document = builder.parse(file);
         ArrayList<MERFunction> merFunctions = new ArrayList<MERFunction>();

         NodeList nodeList = document.getDocumentElement().getChildNodes();

         for (int i = 0; i < nodeList.getLength(); i++) {

              Node node = nodeList.item(i);

              if (node.getNodeType() == Node.ELEMENT_NODE) {
            	  

                   Element elem = (Element) node;

                   // Get the value of the ID attribute.
                   Long id = Long.parseLong(node.getAttributes().getNamedItem("id").getNodeValue());
           
                   // Get the value of all sub-elements.
                   //Integer id = Integer.parseInt(elem.getElementsByTagName("id")
                	//	   .item(0).getChildNodes().item(0).getNodeValue());
                   
                   String description = elem.getElementsByTagName("description")
                                       .item(0).getChildNodes().item(0).getNodeValue();
                   
                   MERFunction merFunction = new MERFunction(id, description);
                   merFunctions.add(merFunction);
              }

         }
		return merFunctions;
	}

	
	public static ArrayList<ErrorType> parserErrorType(File file) throws JAXBException, ParserConfigurationException, SAXException, IOException {
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        DocumentBuilder builder = factory.newDocumentBuilder();

         // Load the input XML document, parse it and return an instance of the

         // Document class.

         Document document = builder.parse(file);
         ArrayList<ErrorType> errorTypes = new ArrayList<ErrorType>();

         NodeList nodeList = document.getDocumentElement().getChildNodes();

         for (int i = 0; i < nodeList.getLength(); i++) {

              Node node = nodeList.item(i);

              if (node.getNodeType() == Node.ELEMENT_NODE) {
            	  

                   Element elem = (Element) node;

                   // Get the value of the ID attribute.
                   Long id = Long.parseLong(node.getAttributes().getNamedItem("id").getNodeValue());
           
                   // Get the value of all sub-elements.
                   //Integer id = Integer.parseInt(elem.getElementsByTagName("id")
                	//	   .item(0).getChildNodes().item(0).getNodeValue());
                   
                   String description = elem.getElementsByTagName("description")
                                       .item(0).getChildNodes().item(0).getNodeValue();

                   ErrorType errorType = new ErrorType(id, description, new ArrayList<SubErrorType>());
                   if (elem.getElementsByTagName("subErrorTypes").getLength() > 0){
                	   NodeList listSubErrorTypes = elem.getElementsByTagName("subErrorTypes").item(0).getChildNodes();
                	   for (int j = 0; j < listSubErrorTypes.getLength(); j++){
                		   Node nodeSubError = listSubErrorTypes.item(j);
                		   if (nodeSubError.getNodeType() == Node.ELEMENT_NODE) {
                			   Element elemSubErrorType = (Element) nodeSubError;
                			   Long idSubErrorType = Long.parseLong(nodeSubError.getAttributes().getNamedItem("id").getNodeValue());
                			   String descriptionSubErrorType = elemSubErrorType.getElementsByTagName("description").item(0).getChildNodes().item(0).getNodeValue();
                			   errorType.getSubErrorTypes().add(new SubErrorType(idSubErrorType, descriptionSubErrorType, errorType));
                		   }
                	   
                	   }
                   }
                   errorTypes.add(errorType);
              }

         }
		return errorTypes;
	}

	public static void modifyXMLFile(Sorter sorter, File file){
		   try {
				
				DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
				Document doc = docBuilder.parse(file.getPath());
		 
				// Get the root element
				Node nodeSorters = doc.getFirstChild();
		 
				// Get the staff element , it may not working if tag has spaces, or
				// whatever weird characters in front...it's better to use
				// getElementsByTagName() to get it directly.
				// Node staff = company.getFirstChild();
		 
				// Get the node sorter element by tag name directly
				Node nodeSorter = doc.getElementsByTagName("sorter").item(0);
		 
				// update node sorter attribute
				NamedNodeMap attr = nodeSorter.getAttributes();
				Node nodeAttr = attr.getNamedItem("id");
				nodeAttr.setTextContent(sorter.getId().toString());
				
				NodeList listSorter = nodeSorter.getChildNodes();
				for (int i = 0; i < listSorter.getLength(); i++) {
					Node node = listSorter.item(i);
					System.out.println(node.getNodeName() + " - " + node.getNodeValue());
					if ("description".equals(node.getNodeName())){
						node.setTextContent(sorter.getDescription());
					}
					if ("itensSorter".equals(node.getNodeName())){
						NodeList itensList = node.getChildNodes();
						for (int j = 0; j < itensList.getLength(); j++) {
							Node nodeItem = itensList.item(j);
							
						}
					}
				}
/*		 
				// append a new node to staff
				Element age = doc.createElement("age");
				age.appendChild(doc.createTextNode("28"));
				staff.appendChild(age);
		 
				// loop the staff child node
				NodeList list = staff.getChildNodes();
		 
				for (int i = 0; i < list.getLength(); i++) {
		 
		                   Node node = list.item(i);
		 
				   // get the salary element, and update the value
				   if ("salary".equals(node.getNodeName())) {
					node.setTextContent("2000000");
				   }
		 
		                   //remove firstname
				   if ("firstname".equals(node.getNodeName())) {
					staff.removeChild(node);
				   }
		 
				}
*/		 
				// write the content into xml file
				TransformerFactory transformerFactory = TransformerFactory.newInstance();
				Transformer transformer = transformerFactory.newTransformer();
				DOMSource source = new DOMSource(doc);
				StreamResult result = new StreamResult(new File(file.getPath()));
				transformer.transform(source, result);
		 
				System.out.println("Done");
		 
			   } catch (ParserConfigurationException pce) {
				pce.printStackTrace();
			   } catch (TransformerException tfe) {
				tfe.printStackTrace();
			   } catch (IOException ioe) {
				ioe.printStackTrace();
			   } catch (SAXException sae) {
				sae.printStackTrace();
			   }
			}		


	public static void testeXstream(Sorter s, File f){
		XStream xs = new XStream();
		 
		// OBJECT --> XML
		String xml = xs.toXML(s);
		 
		// XML --> OBJECT
		Sorter sorter = (Sorter) xs.fromXML(xml);
		System.out.print("teste");
	}
}



