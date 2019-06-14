/**
 * <p> Title : Client.java </p>
 * <p> Description : TODO </p>
 * <p> Package : com.garen.ui </p>
 * CreateDate : 2019年6月13日 下午5:19:19 </p>
 * Author : 0283000196 
 *
 * @Version V1.0.0 </p> 
*/

package com.garen.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.garen.dao.IAccountDao;
import com.garen.service.IAccountService;

/**
 * <p> ClassName : Client </p>
 * <p> Description : TODO </p>
 * CreateDate : 2019年6月13日 下午5:19:19
 * Author : 0283000196
 */

public class Client {
	
	/**
	 * 获取spring的IOC核心容器对象，并根据id获取bean对象。
	 * ApplicationContext的三个常用实现类：
	 * 1. ClasspathXmlApplicationContext     它可以加载类路径下的配置文件，要求配置文件必须在类路径下，不在的话，加载不了.(实际应用中更常用)
	 * 2. FileSystemXmlApplicationContext    加载磁盘任意路径下的配置文件(必须有访问权限)
	 * 3. AnnotationConfigApplicationContext 它是用于读取注解创建容器的。
	 * 
	 * 核心容器的两个接口引发的问题；
	 * 1. ApplicationContext:   单例模式适用
	 * 	  它在构建容器时，创建对象采取的策略是立即加载的方式，也就是说一读取完配置文件就马上创建配置文件中配置的对象
	 * 2. BeanFactory			多例模式适用
	 * 	 它在构建容器时，创建对象采取的策略是延迟加载的方式，也就是说，什么时候根据id获取对象了，什么时候才真正的创建对象。
	 * 
	 * 验证方法，通过在实现类中添加构造方法，同时打印一句话，然后在加载配置文件的地方设置断点，查看控制台的输出
	 * 
	 * 无论是ApplicationContext还是BeanFactory接口，Spring都能根据配置来决定到底是单例模式还是多例模式，而不是说，ApplicationContext只能是单例，BeanFactory只能是多例。
	 * 
	 * <p> Title : main </p>
	 * <p> Description : TODO </p>
	 * CreateDate : 2019年6月13日 下午5:37:22
	 * Author : 0283000196
	 * @param @param args
	 * @return void
	 * @throws
	 */
	public static void main(String[] args) {
		// 1. 获取核心容器对象
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		// 2. 根据id获取bean对象
		IAccountService as1 = (IAccountService) ac.getBean("accountService");
		IAccountService as2 = (IAccountService) ac.getBean("accountService");
		IAccountDao ao = ac.getBean("accountDao", IAccountDao.class);
		
		System.out.println(as1);
		
		// 手动关闭容器
		ac.close();
//		System.out.println(as2);
//		System.out.println(ao);
		
		
		// ---------------BeanFactory-------------------------------
//		Resource resource = new ClassPathResource("bean.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);
//		IAccountService as1 = (IAccountService) factory.getBean("accountService");
//		System.out.println(as1);
//		
//		IAccountService as2 = (IAccountService) factory.getBean("accountService");
//		System.out.println(as2);
		
	}
	
}
