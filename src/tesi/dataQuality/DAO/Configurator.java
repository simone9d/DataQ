package tesi.dataQuality.DAO;

/**
 * Classe che contiene le informazioni
 * necessarie per la connesione al db
 * @author PC-Simone
 *
 */
public class Configurator {

	
	private static String us=""; 
	private final static String connessione="jdbc:mysql://localhost:3306/world?useSSL=true";
									//jdbc:mysql://localhost:3306/Peoples?verifyServerCertificate=false&useSSL=true
									//jdbc:mysql://localhost:3306
	private static String pw="";
	

	public static String getUser() {
		return us;
	}
	public static void setUser(String us) {
		Configurator.us = us;
	}
	public static String getConnessione() {
		return connessione;
	}
	public static String getPw() {
		return pw;
	}
	public static void setPw(String pw) {
		Configurator.pw = pw;
	}
	
}
