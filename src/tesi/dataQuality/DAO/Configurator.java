package tesi.dataQuality.DAO;

public class Configurator {

	private static String db="";
	private static String us="";
	private static String table=""; 
	private static String connessione="jdbc:mysql://localhost:3306/world?useSSL=true";
									//jdbc:mysql://localhost:3306/Peoples?verifyServerCertificate=false&useSSL=true
									//jdbc:mysql://localhost:3306
	private static String pw="";
	
	public static String getDb() {
		return db;
	}
	public static void setDb(String db) {
		Configurator.db = db;
	}
	public static String getUser() {
		return us;
	}
	public static void setUser(String us) {
		Configurator.us = us;
	}
	public static String getTable() {
		return table;
	}
	public static void setTable(String table) {
		Configurator.table = table;
	}
	public static String getConnessione() {
		return connessione;
	}
	public static void setConnessione(String connessione) {
		Configurator.connessione = connessione;
	}
	public static String getPw() {
		return pw;
	}
	public static void setPw(String pw) {
		Configurator.pw = pw;
	}
	
}
