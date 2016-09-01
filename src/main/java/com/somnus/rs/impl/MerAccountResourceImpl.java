package com.somnus.rs.impl;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.somnus.model.MerAccount;
import com.somnus.rs.MerAccountResource;
import com.somnus.service.MerAccountService;

@Path("/com.somnus.rs.MerAccountResource")
@Component
public class MerAccountResourceImpl implements MerAccountResource{
	
	@Autowired
	private MerAccountService merAccountService;

	@Path("/selectByConstraints")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public MerAccount selectByConstraints(MerAccount meraccount) {
		return merAccountService.selectByConstraints(meraccount);
	}

}
