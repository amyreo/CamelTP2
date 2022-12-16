package org.mycompany;

import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.mycompany.model.PDV;
import org.mycompany.model.PDV_liste;



public class ProcessorChoice implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		
		PDV pdv = exchange.getIn().getBody(PDV.class);
		String ville = "file:" + pdv.getVille().getVille().toUpperCase();
		System.out.println(ville);
		exchange.getIn().setHeader("file", ville);
		
	}

}
