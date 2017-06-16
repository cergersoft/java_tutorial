package conexionBd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author virus_testing
 */
public class bdConexion {
    
    private static Connection conex;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static String user = "root";
    private static String password = "geraldine2016";
    private static String url = "jdbc:mysql://127.0.0.1/lizsalon";
    

// conexion a la base de datos 
    
public bdConexion(){
    conex = null;
    
    try{
        Class.forName(driver);
        conex = DriverManager.getConnection(url, user, password);
            if (conex != null){
                System.out.print("conexion establecida... ;) ");
            }
    } catch (ClassNotFoundException | SQLException e){
        System.out.print("error de conexion favor revisar.... :( " +e);
    }
}

public Connection getConnection(){
    return conex;
}


public void desconectar(){
    conex = null;
        if (conex == null){
            System.out.print(" ");
            System.out.print("conexion finalizada ");
        }
}
    
}
