import java.sql.Connection;

public class Conexao {
	
	public static Connection conectar() throws ClassNotFoundException {
		
		Class.forName("com.mysql.jdbc.driver");
		return null;
		
	}
	
	public static void main(String[] args) throws ClassNotFoundException {
		conectar();
	}

}
