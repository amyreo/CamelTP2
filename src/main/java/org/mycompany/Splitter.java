package org.mycompany;

import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.mycompany.model.PDV;
import org.mycompany.model.PDV_liste;


public class Splitter implements Processor{

	
	@Override
	public void process(Exchange exchange) throws Exception {
		PDV_liste PDVl = (PDV_liste) exchange.getIn().getBody(List.class);
		List<PDV> lisOrderItems = PDVl.getListePDV();
		exchange.getIn().setBody(lisOrderItems);
		
	}
}
