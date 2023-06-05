package farmaciacrud.Conexion;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionBD{ 

    protected Connection conexion = null;
    private final String driver = "com.mysql.cj.jdbc.Driver";
    private final String url = "jdbc:mysql://localhost:3306/farmaciaDB";
    
    private final String USER = "";
    private final String PASSWORD = "";
    
    
    public void Conectar() throws ClassNotFoundException{
        try {
            conexion = DriverManager.getConnection(url, USER, PASSWORD);
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        Class.forName(driver);

    }
    
    public void Cerrar() throws SQLException{
        if(conexion != null){
            if(!conexion.isClosed()){
                conexion.close();
            }
            
        }
    }
 
    

}
