package com.somnus.service;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.somnus.model.MerAccount;

public interface MerAccountService {
	/**
	 * 根据商户号和交易商户号查询交易账户
	 * */
	MerAccount selectByConstraints(MerAccount meraccount);
	
	/**
	 * 根据交易账户号查询交易账户
	 * @param acctCode
	 * @return
	 */
	PageList<MerAccount> selectByAcctcode(String acctCode,PageBounds pageBounds);
	
}
