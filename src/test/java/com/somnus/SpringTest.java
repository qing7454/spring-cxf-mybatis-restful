package com.somnus;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.miemiedev.mybatis.paginator.domain.Order;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.somnus.model.MerAccount;
import com.somnus.service.MerAccountService;

public class SpringTest extends AbstractTestSupport{
	
	@Autowired
	private  MerAccountService merAccountService;
	
    @Test
    public void selectByAcctcode(){
        int page = 1;
        int pageSize = 5;
        String sortString = "bank_code.asc,bank_acct_no.desc";
        PageBounds pageBounds = new PageBounds(page, pageSize , Order.formString(sortString));
        PageList<MerAccount> pagelist = merAccountService.selectByAcctcode("1020550016", pageBounds);
        
        //总记录数
        int total = pagelist.getPaginator().getTotalCount();
        System.out.println(total);
        
        for(MerAccount account:pagelist){
            System.out.println(account.getBankName());
        }
    }
}
