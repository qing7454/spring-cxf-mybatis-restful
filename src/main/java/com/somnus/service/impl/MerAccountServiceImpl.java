package com.somnus.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.somnus.dao.MerAccountDao;
import com.somnus.model.MerAccount;
import com.somnus.service.MerAccountService;

@Service
public class MerAccountServiceImpl implements MerAccountService{
	
	@Autowired
	private MerAccountDao merAccountDao;

	@Override
	public MerAccount selectByConstraints(MerAccount meraccount) {
		return merAccountDao.selectByConstraints(meraccount);
	}

	@Override
	public PageList<MerAccount> selectByAcctcode(String acctCode,
			PageBounds pageBounds) {
		return merAccountDao.selectByAcctcode(acctCode, pageBounds);
	}

}
