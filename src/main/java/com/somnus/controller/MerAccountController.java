package com.somnus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.somnus.model.MerAccount;
import com.somnus.service.MerAccountService;

@Controller
@RequestMapping(value = "meraccount")
public class MerAccountController {
	
	@Autowired
	private MerAccountService merAccountService;
	
	@RequestMapping(value="selectByCondition", method = {RequestMethod.POST})
    @ResponseBody
	public MerAccount selectByCondition(@RequestBody MerAccount meraccount) {
		return merAccountService.selectByCondition(meraccount);
	}
}
