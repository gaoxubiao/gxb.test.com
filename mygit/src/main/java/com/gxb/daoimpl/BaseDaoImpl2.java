package com.gxb.daoimpl;

import java.io.Serializable;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.sql.ConnectionEvent;
import javax.sql.ConnectionEventListener;
import javax.sql.StatementEvent;
import javax.sql.StatementEventListener;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.gxb.dao.BaseDao;

@Repository
public class BaseDaoImpl2 implements BaseDao {
	private static Logger log = Logger.getLogger(BaseDaoImpl2.class);
	private DruidDataSource dataSource;

	// ½«dataSource×¢Èëµ½baseDao
	@Resource(name = "dataSource")
	public void setDataSource(DruidDataSource dataSource) {
		this.dataSource = dataSource;
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

	public List queryList(String sql) throws Exception {
		log.info(BaseDaoImpl2.class.getName() + "=queryList--sql=" + sql);
		DatabaseMetaData dataMetdata = dataSource.getConnection().getMetaData();
		System.err.println("2----------:" + dataMetdata.getURL());
		return null;
	}

	public Map<String, Object> getTableName() throws Exception {
		DruidPooledConnection connPool = dataSource.getConnection();
		connPool.addConnectionEventListener(new ConnectionEventListener() {

			public void connectionErrorOccurred(ConnectionEvent event) {
				log.error(event.getSQLException());

			}

			public void connectionClosed(ConnectionEvent event) {
				log.info(event.getSQLException());

			}
		});
		connPool.addStatementEventListener(new StatementEventListener() {

			public void statementErrorOccurred(StatementEvent event) {
				try {
					log.info(event.getStatement().getMetaData().getColumnCount());
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			public void statementClosed(StatementEvent event) {
			}
		});
		System.err.println("catalog:" + connPool.getCatalog());
		return null;
	}
	public String[] getDataBase() {
		Connection con=null;
		String []tmp=null;
		try {
			con = dataSource.getConnection().getConnection();
			CallableStatement callstat = con.prepareCall("show databases");
			ResultSet rs=  callstat.executeQuery();
			while (rs.next()) {
			String s=rs.getString("database");
				System.err.println("s===============:"+s);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return tmp;

	}

}
