package empresacolectivos.accesoADatos;

import empresacolectivos.Entidades.Pasajero;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class PasajeroData {
     
    private Connection con = null;
    
    public PasajeroData(){
        con = Conexion.getConexion();
    }
    


    public void registrarPasajero(Pasajero pasajero) {
        
        String sql = "INSERT INTO pasajero(nombre, apellido, dni, correo, telefono, estado) "
                         + "VALUE(?, ?, ?, ?, ?, ?)";
        
            try {
          
           PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
           
           ps.setString(1, pasajero.getNombre());
           ps.setString(2, pasajero.getApellido());
           ps.setString(3, pasajero.getDni());
           ps.setString(4, pasajero.getCorreo());
           ps.setString(5, pasajero.getTelefono());
           ps.setBoolean(6, pasajero.isEstado());
           ps.executeUpdate();
           
           ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                pasajero.setId_Pasajero(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Pasajero registrado.");
            }
            ps.close();
            
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasajero.");
    }
    
  }
    
    

    
    public void eliminarPasajero(int id) {
       
       String sql = "UPDATE pasajero "
                        + "SET estado = 0 "
                        + "WHERE id_pasajero = ?";
       
       try {
           
           PreparedStatement ps = con.prepareStatement(sql);
           
           ps.setInt(1, id);
           
           int update = ps.executeUpdate(); 
           
           if (update == 1) { 
                 
               JOptionPane.showMessageDialog(null, "Pasajero eliminado.");
               
            }

       } catch (SQLException ex) {
           
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasajero.");
       }
   }
    
   


   public void modificarPasajero(Pasajero pasajero) {
String sql = "UPDATE pasajero "
                 + "SET nombre = ?, apellido = ?, dni = ?, correo = ?, telefono = ?, estado = ? "
                 + "WHERE id_pasajero = ?";
       
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, pasajero.getNombre());
        ps.setString(2, pasajero.getApellido());
        ps.setString(3, pasajero.getDni());
        ps.setString(4, pasajero.getCorreo());
        ps.setString(5, pasajero.getTelefono());
        ps.setBoolean(6, pasajero.isEstado());
        ps.setInt(7, pasajero.getId_Pasajero());
           
        int update = ps.executeUpdate();
           
        if (update == 1) {
            System.out.println("Los datos del pasajero fueron modificados.");
        } else {
            System.out.println("No se pudo modificar el pasajero.");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al modificar el pasajero.");
    }
}
   


   public List<Pasajero> listarPasajeros() {
       
       String sql = "SELECT id_pasajero, nombre, apellido, dni, correo, telefono "
                        + "FROM pasajero "
                        + "WHERE estado = 1";

       ArrayList<Pasajero> pasajeros = new ArrayList<>();
       
       try {
           
           PreparedStatement ps = con.prepareStatement(sql);
           
           ResultSet rs = ps.executeQuery();
           
           while (rs.next()) {
               
               Pasajero pasajero = new Pasajero();

               pasajero.setId_Pasajero(rs.getInt("id_pasajero"));
               pasajero.setNombre(rs.getString("nombre"));
               pasajero.setApellido(rs.getString("apellido"));
               pasajero.setDni(rs.getString("dni"));
               pasajero.setCorreo(rs.getString("correo"));
               pasajero.setTelefono(rs.getString("telefono"));
               pasajero.setEstado(true);
               
               pasajeros.add(pasajero);
               
           }
           
           ps.close();
           
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasajero.");
       }
       
       return pasajeros;
   }
   


   public Pasajero buscarPasajero(int id) {
       
       String sql = "SELECT nombre, apellido, dni, correo, telefono "
                        + "FROM pasajero "
                        + "WHERE id_pasajero = ? AND estado = 1";
       
       Pasajero pasajero = null;
       
       try {
           
           PreparedStatement ps = con.prepareStatement(sql);
           
           ps.setInt(1, id);
           ResultSet rs = ps.executeQuery();
           
           if (rs.next()) {
               
               pasajero = new Pasajero();
               
               pasajero.setId_Pasajero(id);
               pasajero.setNombre(rs.getString("nombre"));
               pasajero.setApellido(rs.getString("apellido"));
               pasajero.setDni(rs.getString("dni"));
               pasajero.setCorreo(rs.getString("correo"));
               pasajero.setTelefono(rs.getString("telefono"));
               pasajero.setEstado(true);
               
           } else {
               JOptionPane.showMessageDialog(null, "El pasajero que busca no existe.");
           }
           
       ps.close();
       
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasajero.");
       }

       return pasajero;
   }




   public Pasajero buscarPasajeroPorDni(String dni) {
       
       String sql = "SELECT id_pasajero, nombre, apellido, dni, correo, telefono "
                        + "FROM pasajero "
                        + "WHERE dni = ? AND estado = 1";
       
       Pasajero pasajero = null;
       
       try {
           
           PreparedStatement ps = con.prepareStatement(sql);
           
           ps.setString(1, dni);
           ResultSet rs = ps.executeQuery();
           
           if (rs.next()) {
               
               pasajero = new Pasajero();
               
               pasajero.setDni(dni);
               pasajero.setId_Pasajero(rs.getInt("id_pasajero"));
               pasajero.setNombre(rs.getString("nombre"));
               pasajero.setApellido(rs.getString("apellido"));
               
               pasajero.setCorreo(rs.getString("correo"));
               pasajero.setTelefono(rs.getString("telefono"));
               pasajero.setEstado(true);
               
           } else {
               JOptionPane.showMessageDialog(null, "El pasajero que busca no existe.");
           }
           
       ps.close();
       
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasajero.");
       }

       return pasajero;
   }
   
   
   
public List<Pasajero> buscarPasajerosPorNombre(String nombre) {
        String sql = "SELECT id_pasajero, nombre, apellido, dni, correo, telefono FROM pasajero WHERE nombre = ? AND estado = 1";
        List<Pasajero> pasajeros = new ArrayList<>();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Pasajero pasajero = new Pasajero();
                pasajero.setId_Pasajero(rs.getInt("id_pasajero"));
                pasajero.setNombre(rs.getString("nombre"));
                pasajero.setApellido(rs.getString("apellido"));
                pasajero.setDni(rs.getString("dni"));
                pasajero.setCorreo(rs.getString("correo"));
                pasajero.setTelefono(rs.getString("telefono"));
                pasajero.setEstado(true);
                
                pasajeros.add(pasajero);
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasajero.");
        }

        return pasajeros;
    }
      
      
      
      
   public List<Pasajero> buscarPasajerosPorApellido(String apellido) {
        String sql = "SELECT id_pasajero, nombre, apellido, dni, correo, telefono FROM pasajero WHERE apellido = ? AND estado = 1";
        List<Pasajero> pasajeros = new ArrayList<>();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, apellido);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Pasajero pasajero = new Pasajero();
                pasajero.setId_Pasajero(rs.getInt("id_pasajero"));
                pasajero.setNombre(rs.getString("nombre"));
                pasajero.setApellido(rs.getString("apellido"));
                pasajero.setDni(rs.getString("dni"));
                pasajero.setCorreo(rs.getString("correo"));
                pasajero.setTelefono(rs.getString("telefono"));
                pasajero.setEstado(true);
                
                pasajeros.add(pasajero);
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasajero.");
        }

        return pasajeros;
    }
}
