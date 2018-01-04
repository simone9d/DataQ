package tesi.dataQuality.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

/**
 * Classe per l'accesso al database
 * @author PC-Simone
 *
 */
public class MySqlDao {
	private static MySqlDao dao=new MySqlDao();


	private MySqlDao() {
	}

	public static MySqlDao getIstance(){
		return dao;
	}
	
	public static ResultSet getSentences() {
		MysqlDataSource d = new MysqlDataSource();
	    d.setUser(Configurator.getUser());
	    d.setPassword(Configurator.getPw());
	    d.setUrl("jdbc:mysql://localhost:3306");
	    d.setDatabaseName(Configurator.getDb());
	    Statement stmt;
	    ResultSet rs = null;
		try {
			Connection conn = (Connection)d.getConnection();
			stmt = conn.createStatement();
			stmt.executeQuery("Use "+Configurator.getDb()+";");
			rs=stmt.executeQuery("Select * from " + Configurator.getTable() + ";");
			return rs;
		} catch (SQLException e) {
			System.out.println("SQL Error");
		}
		return rs;
		
	}
	
	public static ResultSet getDatabases() {
		MysqlDataSource d = new MysqlDataSource();
	    d.setUser(Configurator.getUser());
	    d.setPassword(Configurator.getPw());
	    d.setUrl("jdbc:mysql://localhost:3306");
	    d.setDatabaseName(Configurator.getDb());
	    Statement stmt;
	    ResultSet rs = null;
	    try {
			Connection conn =  (Connection) d.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("show databases;");
		} catch (SQLException e) {}
	    return rs;
	}
	
	public static ResultSet getTable() {
		MysqlDataSource d = new MysqlDataSource();
	    d.setUser(Configurator.getUser());
	    d.setPassword(Configurator.getPw());
	    d.setUrl("jdbc:mysql://localhost:3306");
	    d.setDatabaseName(Configurator.getDb());
	    Statement stmt;
	    ResultSet rs = null;
		try {
			Connection conn =  (Connection) d.getConnection();
			stmt = conn.createStatement();
			stmt.executeQuery("Use "+Configurator.getDb()+";");
			rs = stmt.executeQuery("show tables;");
			return rs;
		} catch (SQLException e) {
			System.out.println("SQL Error");
		}
		return rs;
		
	}
	
	public static ResultSetMetaData getColumn() {
		MysqlDataSource d = new MysqlDataSource();
	    d.setUser(Configurator.getUser());
	    d.setPassword(Configurator.getPw());
	    d.setUrl("jdbc:mysql://localhost:3306");
	    d.setDatabaseName(Configurator.getDb());
	    Statement stmt;
	    ResultSet rs = null;
	    ResultSetMetaData rsmd = null;
		try {
			Connection conn =  (Connection) d.getConnection();
			stmt = conn.createStatement();
			stmt.executeQuery("Use "+Configurator.getDb()+";");
			rs = stmt.executeQuery("select * from "+Configurator.getTable()+ ";");
			rsmd = rs.getMetaData();
			return rsmd;
		} catch (SQLException e) {
			System.out.println("SQL Error");
		}
		return rsmd;
		
	}
	
	public static String getPKcol() {
		MysqlDataSource d = new MysqlDataSource();
	    d.setUser(Configurator.getUser());
	    d.setPassword(Configurator.getPw());
	    d.setUrl("jdbc:mysql://localhost:3306");
	    d.setDatabaseName(Configurator.getDb());
	    Statement stmt;
	    ResultSet rs = null;
	    ResultSetMetaData rsmd = null;
		try {
			Connection conn =  (Connection) d.getConnection();
			stmt = conn.createStatement();
			stmt.executeQuery("Use "+Configurator.getDb()+";");
			rs = stmt.executeQuery("select * from "+Configurator.getTable()+ ";");
			rsmd = rs.getMetaData();
			return rsmd.getColumnLabel(1);
		} catch (SQLException e) {
			System.out.println("SQL Error");
		}
		return null;
		
	}
	
}