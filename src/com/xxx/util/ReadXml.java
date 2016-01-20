package com.xxx.util;

import org.dom4j.io.SAXReader;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Attribute;

import java.util.Iterator;
import java.io.File;

//Read xml file
public class ReadXml {
	public static Document parse2Document(String xmlFilePath) {
		SAXReader reader = new SAXReader();
		Document doc = null;
		try {
			doc = reader.read(new File(xmlFilePath));
		} catch (DocumentException e) {
			
		}
		return doc;
	}

	public static String readname(String xmlFilePath, String type) {
		// take xml to Document object
		Document doc = ReadXml.parse2Document(xmlFilePath);
		// get the root of the file
		Element root = doc.getRootElement();
		String returnstr = new String();
		for (Iterator<?> i_action = root.elementIterator(); i_action.hasNext();) {
			Element e_action = (Element) i_action.next();
			for (Iterator<?> a_action = e_action.attributeIterator(); a_action
					.hasNext();) {
				Attribute attribute = (Attribute) a_action.next();
				if (attribute.getName().equals(type)) {
					returnstr = attribute.getValue();
				}
			}
		}
		return returnstr;
	}
}
