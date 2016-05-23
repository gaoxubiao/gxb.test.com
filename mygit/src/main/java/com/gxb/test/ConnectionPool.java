package com.gxb.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;



/*
 * ��Ԫģʽ��Flyweight��
 * ��Ԫģʽ����ҪĿ����ʵ�ֶ���Ĺ���������أ���ϵͳ�ж�����ʱ����Լ����ڴ�Ŀ�����ͨ���빤��ģʽһ��ʹ��
 * �������������һЩ������������һЩ���е����ԣ�
 * �������ݿ����ӳ���˵��url��driverClassName��username��password��dbname��
 * ��Щ���Զ���ÿ��������˵����һ���ģ����Ծ��ʺ�����Ԫģʽ��������һ�������࣬����������������Ϊ�ڲ����ݣ�
 * ��������Ϊ�ⲿ���ݣ��ڷ�������ʱ�����������������������ͽ�ʡ�˿ռ䣬������ʵ��������
 * ͨ�����ӳصĹ���ʵ�������ݿ����ӵĹ�������Ҫÿһ�ζ����´������ӣ�
 * ��ʡ�����ݿ����´����Ŀ�����������ϵͳ������
 * */
public class ConnectionPool {
	private Vector<Connection> pool;
	private String url="jdbc:mysql://localhost:3306/itsvr";
	private String username="root";
	private String pwd="111111";
	private String driverClassName="com.mysql.jdbc.Driver";
	private int poolSize=100;
	private static ConnectionPool instance=null;
	Connection conn=null;
	
	private ConnectionPool(){
		pool=new Vector<Connection>(poolSize);
		for (int i = 0; i < poolSize; i++) {
			try {
				Class.forName(driverClassName);
				conn=DriverManager.getConnection(url, username, pwd);
				pool.add(conn);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	/*
	 * �������ӵ����ӳ�
	 * */
	public synchronized void release(){
		pool.add(conn);
	}
	
	public synchronized Connection getConnection(){
		if(pool.size()>0){
			conn=pool.get(0);
			pool.remove(conn);
			return conn;
		}else{
			return null;
		}
	}

}
