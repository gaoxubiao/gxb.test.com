package com.gxb.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gxb.daoimpl.AnmialsImpl;

/*
 *  在类上 ，使用以下注解，实现bean 的声明

 @Component 泛指组件，当组件不好归类的时候，我们可以使用这个注解进行标注。

 @Service 用于标注业务层组件

 @Controller 用于标注控制层组件（如srping mvc的controller,struts中的action）

 @Repository 用于标注数据访问组件，即DAO组件
 @Autowired : 按类 的 类型进行装配

 @Resource (推荐) : 1 如果同时指定了name和type，则从spring上下文中找到唯一匹配的bean进行装配，找不到则抛出异常

 2. 如果指定了name，则从上下文中查找名称（id）匹配的bean进行装配，找不到则抛出异常 

 3.如果指定了type，则从上下文中找到类型匹配的唯一bean进行装配，找不到或者找到多个，都会抛出异常 

 4.如果既没有指定name，又没有指定type，则自动按照byName方式进行装配；如果没有匹配，则回退为一个原始类型进行匹配，如果匹配则自动装配；

 @Resource注解在字段上，这样就不用写setter方法了，并且这个注解是属于J2EE的，减少了与spring的耦合。 
 * 
 * 
 * */

public class Animails {
     
	private String name;
	private String name2;



	public String getStringName(String str) {
		System.err.println("输出：" + str);
		return str;
	}

	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		AnmialsImpl ai = (AnmialsImpl) context.getBean("anmialsImpl");
		String sr = ai.getName("ssss");
		System.err.println("mmmmm===" + sr);


	}
}
