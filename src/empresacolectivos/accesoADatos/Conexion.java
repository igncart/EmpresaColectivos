package empresacolectivos.accesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    private static final String URL="jdbc:mariadb://localhost/";
    private static final String DB="empresacolectivos";
    private static final String USUARIO="root";
    private static final String PASSWORD="";
    private static Connection connection;
    
    private Conexion(){}  
                        
    public static Connection getConexion(){
        
        if(connection == null){
            
            try {
                 
                Class.forName("org.mariadb.jdbc.Driver");
                 
                connection = DriverManager.getConnection(URL+DB, USUARIO, PASSWORD);
                
                JOptionPane.showMessageDialog(null, "¡Conectado!"); 

            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los drivers.");

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos.");
            }
        }

        return connection; 
    }
}
