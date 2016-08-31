package com.somnus.ws.impl;

import javax.jws.WebService;

import com.somnus.model.MerAccount;
import com.somnus.resource.MerAccountResource;
import com.somnus.service.MerAccountService;

@WebService(endpointInterface = "com.somnus.ws.MerAccountResource", serviceName = "merAccountResource")
public class MerAccountResourceImpl implements MerAccountResource{
	
	private MerAccountService merAccountService;

	public MerAccount selectByConstraints(MerAccount meraccount) {
		return merAccountService.selectByConstraints(meraccount);
	}

}
