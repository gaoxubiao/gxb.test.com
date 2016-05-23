package com.gxb.test;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;

import com.gxb.daoimpl.BaseDaoImpl;
import com.gxb.daoimpl.BaseDaoImpl2;

public class BaseDaoImplTestCase extends TestCase {

	@Resource
	private BaseDaoImpl baseDaoImpl;
	@Resource
	private BaseDaoImpl2 baseDaoImpl2;

	@Test
	public void test() {
		// List list=baseDaoImpl.queryList("select * from account");
		//BaseDao dao = applicationContext.getBean("baseDaoImpl", BaseDao.class);
		List<?> list = null;
		try {
			list = baseDaoImpl.queryList("select * from account limit 10 ");
			StringBuffer buffer = null;
			for (int i = 0; i < list.size(); i++) {
				Map<String, Object> map = (Map<String, Object>) list.get(i);

				buffer = new StringBuffer();
				for (Map.Entry<String, Object> entry : map.entrySet()) {
					buffer.append("field="+entry.getKey()+",value="+entry.getValue() +":");
					
				}
				System.err.println(buffer.toString());
				//baseDaoImpl.getTableName();
				baseDaoImpl2.getDataBase();
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		// System.err.println("list:"+list.size());

	}
}
