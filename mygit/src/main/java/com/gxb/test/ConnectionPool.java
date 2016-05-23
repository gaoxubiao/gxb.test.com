package com.gxb.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;



/*
 * 享元模式（Flyweight）
 * 享元模式的主要目的是实现对象的共享，即共享池，当系统中对象多的时候可以减少内存的开销，通常与工厂模式一起使用
 * 适用于作共享的一些个对象，他们有一些共有的属性，
 * 就拿数据库连接池来说，url、driverClassName、username、password及dbname，
 * 这些属性对于每个连接来说都是一样的，所以就适合用享元模式来处理，建一个工厂类，将上述类似属性作为内部数据，
 * 其它的作为外部数据，在方法调用时，当做参数传进来，这样就节省了空间，减少了实例的数量
 * 通过连接池的管理，实现了数据库连接的共享，不需要每一次都重新创建连接，
 * 节省了数据库重新创建的开销，提升了系统的性能
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
	 * 返回连接到连接池
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
