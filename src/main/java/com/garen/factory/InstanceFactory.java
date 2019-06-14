/**
 * <p> Title : InstanceFactory.java </p>
 * <p> Description : TODO </p>
 * <p> Package : com.garen.factory </p>
 * CreateDate : 2019年6月13日 下午7:24:06 </p>
 * Author : 0283000196 
 *
 * @Version V1.0.0 </p> 
*/

package com.garen.factory;

import com.garen.service.IAccountService;
import com.garen.service.impl.AccountServiceImpl;

/**
 * 模拟一个工厂类(该类可能存在于jar包中，我们无法通过修改源码的方式来提供构造函数)
 * <p> ClassName : InstanceFactory </p>
 * <p> Description : TODO </p>
 * CreateDate : 2019年6月13日 下午7:24:06
 * Author : 0283000196
 */

public class InstanceFactory {
	
	public IAccountService getAccountService() {
		return new AccountServiceImpl();
	}
}
