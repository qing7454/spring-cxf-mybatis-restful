package com.somnus.dao;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.somnus.model.MerAccount;
import com.somnus.support.mybatis.annotation.MyBatisRepository;

@MyBatisRepository
public interface MerAccountDao {
	
	/**
	 * 根据商户号和交易商户号查询交易账户
	 * */
	MerAccount selectByCondition(MerAccount meraccount);
	
	
	/**
	 * 根据交易账户号查询交易账户
	 * @param acctCode
	 * @return
	 */
	PageList<MerAccount> selectByAcctcode(String acctCode,PageBounds pageBounds);
	
}
