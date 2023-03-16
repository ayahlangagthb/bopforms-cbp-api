
package com.crossborder.payments.bopforms.service;

import org.springframework.stereotype.Service;
import org.json.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class BopFormService {
	private static final Logger LOGGER = LoggerFactory.getLogger(BopFormService.class);

	static String bopformreq;

	public void addBopForm(String bopformreqJSON) {
		LOGGER.info(" aaaaaa : \n"+ bopformreqJSON);
        String xml = XML.toString(bopformreqJSON);
		LOGGER.info(" MY XML : \n"+ xml);

	}
}
