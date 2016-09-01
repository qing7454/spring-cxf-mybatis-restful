package com.somnus.ws.impl;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.somnus.model.MerAccount;
import com.somnus.rs.MerAccountResource;
import com.somnus.service.MerAccountService;

@WebService(endpointInterface = "com.somnus.ws.MerAccountResource", serviceName = "merAccountResource")
public class MerAccountResourceImpl implements MerAccountResource{
	
	@Autowired
	private MerAccountService merAccountService;

	@Override
	public MerAccount selectByCondition(MerAccount meraccount) {
		return merAccountService.selectByCondition(meraccount);
	}

}
