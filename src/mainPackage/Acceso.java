package mainPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Acceso {

    static String nombreBD = "inventario";
    static String login = "root";
    static String password = "4839";
    static String url = "jdbc:mysql://localhost/" + nombreBD;
    Connection conexion = null;

    public Acceso() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url, login, password);
            if(conexion != null){
                System.out.println("Conextion con la BD exitosa");
            }
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Error en el driver "+ex.getMessage());
        } catch (SQLException e) {
            System.out.println("Error "+e.getMessage());
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }
        
    }
    
    public Connection getConexion(){
        return conexion;
    }
    public void desconectar(){
        conexion = null;
    }

}
