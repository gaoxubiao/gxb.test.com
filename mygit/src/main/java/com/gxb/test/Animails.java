package com.gxb.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gxb.daoimpl.AnmialsImpl;

/*
 *  ������ ��ʹ������ע�⣬ʵ��bean ������

 @Component ��ָ�������������ù����ʱ�����ǿ���ʹ�����ע����б�ע��

 @Service ���ڱ�עҵ������

 @Controller ���ڱ�ע���Ʋ��������srping mvc��controller,struts�е�action��

 @Repository ���ڱ�ע���ݷ����������DAO���
 @Autowired : ���� �� ���ͽ���װ��

 @Resource (�Ƽ�) : 1 ���ͬʱָ����name��type�����spring���������ҵ�Ψһƥ���bean����װ�䣬�Ҳ������׳��쳣

 2. ���ָ����name������������в������ƣ�id��ƥ���bean����װ�䣬�Ҳ������׳��쳣 

 3.���ָ����type��������������ҵ�����ƥ���Ψһbean����װ�䣬�Ҳ��������ҵ�����������׳��쳣 

 4.�����û��ָ��name����û��ָ��type�����Զ�����byName��ʽ����װ�䣻���û��ƥ�䣬�����Ϊһ��ԭʼ���ͽ���ƥ�䣬���ƥ�����Զ�װ�䣻

 @Resourceע�����ֶ��ϣ������Ͳ���дsetter�����ˣ��������ע��������J2EE�ģ���������spring����ϡ� 
 * 
 * 
 * */

public class Animails {
     
	private String name;
	private String name2;



	public String getStringName(String str) {
		System.err.println("�����" + str);
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
