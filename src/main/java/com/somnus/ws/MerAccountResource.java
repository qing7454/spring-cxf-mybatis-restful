package com.somnus.ws;

import javax.jws.WebService;

import com.somnus.model.MerAccount;

@WebService
public interface MerAccountResource {
	MerAccount selectByCondition(MerAccount meraccount);
}
