package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MYSQLConexion {

    public static Connection getConexion(){ 
         /*Connection con = null;
         try { Class.forName("com.mysql.cj.jdbc.Driver");
         String url = "jdbc:mysql://localhost:3306/BD_Biblioteca?useSSL=false&useTimezone=true&serverTimezone=UTC";
         String usr = "root";
         String psw = "admin";
         con = DriverManager.getConnection(url,usr,psw); 
         System.out.println("conexion ok");
         } catch (ClassNotFoundException ex)
         { System.out.println("No hay Driver!!"); } 
         
         catch (SQLException ex) { System.out.println("Error con esta BD "); }
         return con; 
         }
            
    	public static void closeConexion(Connection con) {
         try {
         con.close();
         }catch(SQLException e) {
         System.out.println("Problemas al cerrar la conexión");
         }*/
    	
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost/BD_Biblioteca?useTimezone=true&serverTimezone=UTC";
			String usr = "root";
			String psw = "admin";
			con = DriverManager.getConnection(url, usr, psw);
			System.out.println("Conexión establecida correctamente");
		} catch (ClassNotFoundException ex) {
			System.out.println("No se encontró el controlador JDBC");
		} catch (SQLException ex) {
			System.out.println("Error al conectar con la base de datos");
		}
		return con;
	}

	public static void closeConexion(Connection con) {
		try {
			if (con != null) {
				con.close();
				System.out.println("Conexión cerrada correctamente");
			}
		} catch (SQLException e) {
			System.out.println("Problemas al cerrar la conexión");
		}
	}
    	

}