package com.somnus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.somnus.model.MerAccount;
import com.somnus.service.MerAccountService;

@Controller
@RequestMapping(value = "meraccount")
public class MerAccountController {
	
	private MerAccountService merAccountService;
	
	@RequestMapping(value="selectByConstraints", method = {RequestMethod.POST})
    @ResponseBody
	public MerAccount selectByConstraints(MerAccount meraccount) {
		return merAccountService.selectByConstraints(meraccount);
	}
}
