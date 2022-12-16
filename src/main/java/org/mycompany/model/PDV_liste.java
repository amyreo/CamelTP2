package org.mycompany.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PDV_liste {
	
	private List<PDV> listePDV;

	public List<PDV> getListePDV() {
		return listePDV;
	}

	public void setListePDV(List<PDV> listePDV) {
		this.listePDV = listePDV;
	}
	
	

}
