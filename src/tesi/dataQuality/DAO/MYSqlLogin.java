package tesi.dataQuality.DAO;

/**
 * Classe che contiene le informazioni
 * necessarie per la connesione al db
 * @author PC-Simone
 *
 */
public class MYSqlLogin {

	
	private static String us="";
	private static String pw="";
	

	public static String getUser() {
		return us;
	}
	public static void setUser(String us) {
		MYSqlLogin.us = us;
	}
	public static String getPw() {
		return pw;
	}
	public static void setPw(String pw) {
		MYSqlLogin.pw = pw;
	}
	
}
