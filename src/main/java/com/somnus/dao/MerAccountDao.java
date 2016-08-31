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
	MerAccount selectByConstraints(MerAccount meraccount);
	
	/**
	 * 新增交易账户
	 * @param meraccount
	 */
	void insert(MerAccount meraccount);
	
	/**
	 * 更新交易账户
	 * @param meraccount
	 */
	void updateByPrimaryKeySelective(MerAccount meraccount);
	
	/**
	 * 根据交易账户号查询交易账户
	 * @param acctCode
	 * @return
	 */
	PageList<MerAccount> selectByAcctcode(String acctCode,PageBounds pageBounds);
	
	/**
	 * 根据主键删除数据
	 * @param acctId
	 */
	void deleteByPrimaryKey(Long acctId);

}
