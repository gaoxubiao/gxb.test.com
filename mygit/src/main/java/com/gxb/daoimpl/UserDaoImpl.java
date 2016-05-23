package com.gxb.daoimpl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class UserDaoImpl extends BaseDaoImpl {

	@Override
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		// TODO Auto-generated method stub
		super.setJdbcTemplate(jdbcTemplate);
	}

	@Override
	public void add(Serializable obj) throws Exception {
		// TODO Auto-generated method stub
		super.add(obj);
	}

	@Override
	public void del(Serializable id) throws Exception {
		// TODO Auto-generated method stub
		super.del(id);
	}

	@Override
	public void update(Serializable obj) throws Exception {
		// TODO Auto-generated method stub
		super.update(obj);
	}

	@Override
	public void update(String sql) throws Exception {
		// TODO Auto-generated method stub
		super.update(sql);
	}

	@Override
	public <T> List<T> queryList(String sql, T cls) throws Exception {
		// TODO Auto-generated method stub
		return super.queryList(sql, cls);
	}

	@Override
	public <T> T queryById(Serializable id, T cls) throws Exception {
		// TODO Auto-generated method stub
		return super.queryById(id, cls);
	}

	@Override
	public List<Map<String, Object>> queryList(String sql) throws Exception {

		return super.queryList(sql);

	}

	@Override
	public Map<String, Object> getTableName() throws Exception {
		// TODO Auto-generated method stub
		return super.getTableName();
	}

}
