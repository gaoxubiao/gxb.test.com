package com.gxb.daoimpl;

import java.io.Serializable;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.gxb.dao.BaseDao;

@Transactional
@Repository("baseDaoImpl")
public class BaseDaoImpl implements BaseDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void add(Serializable obj) throws Exception {
	}

	public void del(Serializable id) throws Exception {

	}

	public void update(Serializable obj) throws Exception {

	}

	public void update(String sql) throws Exception {

	}

	public <T> List<T> queryList(String sql, T cls) throws Exception {
		return null;
	}

	public <T> T queryById(Serializable id, T cls) throws Exception {
		return null;
	}

	public List<Map<String,Object>> queryList(String sql) throws Exception {
		Connection conn = jdbcTemplate.getDataSource().getConnection();
		DatabaseMetaData dataMeta = conn.getMetaData();
		System.err.println("URL:" + dataMeta.getURL() + ",----:"
				+ dataMeta.getUserName() + ",catalog="
				+ dataMeta.getCatalogSeparator());
		CallableStatement callst = conn.prepareCall(sql);
		ResultSet rs = callst.executeQuery();
		// 获取记录字段
		ResultSetMetaData rsd = rs.getMetaData();
		Set<String> colNames = new HashSet<String>();
		List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();
		for (int columns = 1; columns <= rsd.getColumnCount(); columns++) {
			colNames.add(rsd.getColumnName(columns));
		}
		System.err.println("输出查询表的字段名称：" + colNames.toString());
		String[] colStr=new String[colNames.size()];
		     Iterator<String> it=  colNames.iterator();
		     int pos=0;
		     while (it.hasNext()) {
		    	 colStr[pos]=it.next();
		    	 pos++;
			}
		while (rs.next()){
			Map<String,Object> tmp=new HashMap<String,Object>();
            for(int j=1;j<=colStr.length;j++){
            	tmp.put(colStr[j-1], rs.getString(j));
            }
            list.add(tmp);
		}

		conn.close();
		return list;
	}

	public Map<String, Object> getTableName() throws Exception {
	Connection conn=jdbcTemplate.getDataSource().getConnection();
            DatabaseMetaData database=conn.getMetaData();
            
            System.err.println(database.getDatabaseProductName());
          ResultSet rs=  database.getVersionColumns("def", "itsvr", "account");
      ResultSetMetaData rsd=rs.getMetaData();
          System.err.println(rsd.getColumnCount());
          for(int i=1;i<=rsd.getColumnCount();i++){
        	  System.err.println(rsd.getColumnClassName(i)+","+rsd.getColumnName(i)+","+rsd.getTableName(i));
          
          
          }
            
		return null;
	}

}
