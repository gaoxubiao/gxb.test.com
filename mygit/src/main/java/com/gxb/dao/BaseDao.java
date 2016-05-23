package com.gxb.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface BaseDao {
	public void add(Serializable obj) throws Exception;

	public void del(Serializable id) throws Exception;

	public void update(Serializable obj) throws Exception;

	public void update(String sql) throws Exception;

	public <T> List<T> queryList(String sql, T cls) throws Exception;

	public <T> T queryById(Serializable id, T cls) throws Exception;

	public List<Map<String,Object>> queryList(String sql) throws Exception;

	public Map<String, Object> getTableName() throws Exception;

}
