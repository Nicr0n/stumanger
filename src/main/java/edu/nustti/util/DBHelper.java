package edu.nustti.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSourceFactory;

public class DBHelper {
	static DataSource ds;
	static Properties p = null;
	static {
		p = new Properties();
		InputStream is = DBHelper.class.getClassLoader().getResourceAsStream("jdbc.properties");
		try {
			p.load(is);
			//Class.forName(p.getProperty("driver"));
			ds = BasicDataSourceFactory.createDataSource(p);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 获取数据库连接
	 * @return
	 */
	public static Connection getConnection() {
		try {
			//Connection conn = DriverManager.getConnection(p.getProperty("url"), p.getProperty("username"), p.getProperty("password"));
			Connection conn = ds.getConnection();
			System.out.println("获取数据库连接成功！....Properties");
			return conn;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 通用的查询
	 * @param sql
	 * @param params
	 * @return ResultSet
	 */
	public static ResultSet get(String sql, Object... params) {
		// 获取数据库连接
		Connection conn = getConnection();
		// 获取SQL语句声明对象
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(sql);
			if (params != null) {
				for (int i = 0; i < params.length; i++) {
					ps.setObject(i + 1, params[i]);
				}
			}
			rs = ps.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
			free(rs, ps, conn);
		}
		return rs;
	}

	/**
	 * 通用的更新方法
	 * @param sql
	 * @param params
	 */
	public static void update(String sql, Object... params) {
		// 获取数据库连接
		Connection conn = getConnection();
		// 获取SQL语句声明对象
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			if (params != null) {
				for (int i = 0; i < params.length; i++) {
					ps.setObject(i + 1, params[i]);
				}
			}
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			free(null, ps, conn);
		}
	}

	/**
	 * 释放资源
	 * @param rs
	 * @param st
	 * @param conn
	 */
	public static void free(ResultSet rs, Statement st, Connection conn) {
		if(rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(st!=null) {
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
