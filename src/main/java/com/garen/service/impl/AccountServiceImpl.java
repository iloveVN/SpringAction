/**
 * <p> Title : AccountServiceImpl.java </p>
 * <p> Description : TODO </p>
 * <p> Package : com.garen.service.impl </p>
 * CreateDate : 2019年6月13日 下午5:17:23 </p>
 * Author : 0283000196 
 *
 * @Version V1.0.0 </p> 
*/

package com.garen.service.impl;

import com.garen.dao.IAccountDao;
import com.garen.dao.impl.AccountDaoImpl;
import com.garen.service.IAccountService;

/**
 * <p> ClassName : AccountServiceImpl </p>
 * <p> Description : TODO </p>
 * CreateDate : 2019年6月13日 下午5:17:23
 * Author : 0283000196
 */

public class AccountServiceImpl implements IAccountService{
	
	private IAccountDao dao;
	
	public AccountServiceImpl () {
		System.out.println("对象创建了。。。");
	}

	/* (non-Javadoc)
	 * <p> Title : saveAccount </p>
	 * <p> Description : TODO </p>
	 * @Param : 
	 * @see com.garen.service.IAccountService#saveAccount()
	 */
	public void saveAccount() {
		dao.account();
	}
	
	public void init() {
		System.out.println("对象初始化了。。。");
	}
	
	public void destroy() {
		System.out.println("对象销毁了。。。");
	}

}
