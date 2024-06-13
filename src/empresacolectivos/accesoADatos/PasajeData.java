package empresacolectivos.accesoADatos;

import empresacolectivos.Entidades.*;
import java.sql.*;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class PasajeData {
    
    private Connection con = null;
    private RutaData rd = new RutaData();
    private PasajeroData pd = new PasajeroData();
    private ColectivoData cd = new ColectivoData();
    
    public PasajeData(){
        con = Conexion.getConexion();
    }
    
    
    public void registrarPasaje(Pasaje pasaje) {
        
        String sql = "INSERT INTO pasaje (id_pasajero, id_colectivo, id_ruta, fecha_viaje, hora_viaje, asiento, precio) "
                         + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1,pasaje.getPasajero().getId_Pasajero());
            ps.setInt(2, pasaje.getColectivo().getId_Colectivo());
            ps.setInt(3, pasaje.getRuta().getId_Ruta());
            ps.setDate(4, Date.valueOf(pasaje.getFecha_Viaje()));
            ps.setTime(5, Time.valueOf(pasaje.getHora_Viaje()));
            ps.setInt(6, pasaje.getAsiento());
            ps.setDouble(7, pasaje.getPrecio());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                
                pasaje.setId_Pasaje(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Pasaje registrado."); 
            }
            
            ps.close();
            rs.close();
         
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasaje.");
        }
    }
    
    
    public void eliminarPasaje(int id) {
        
        String sql = "DELETE FROM pasaje "
                         + "WHERE id_pasaje = ?";
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, id);
            
            int f  = ps.executeUpdate();
            
            if (f > 0) {
                
                JOptionPane.showMessageDialog(null, "Pasaje eliminado.");
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasaje.");
        } 
    }
  
    
    public List<Pasaje> listarPasajes() {
        
        String sql = "SELECT id_pasaje, id_pasajero, id_colectivo, id_ruta, fecha_viaje, hora_viaje, asiento, precio "
                         + "FROM pasaje ";
           
        ArrayList<Pasaje> pasajes = new ArrayList<>();
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
                Pasaje pasaje = new Pasaje();
                
                pasaje.setId_Pasaje(rs.getInt("id_pasaje"));
                Pasajero pasajero = pd.buscarPasajero(rs.getInt("id_pasajero"));
                pasaje.setPasajero(pasajero);
                Colectivo colectivo = cd.buscarColectivo(rs.getInt("id_colectivo"));
                pasaje.setColectivo(colectivo);
                Ruta ruta = rd.buscarRuta(rs.getInt("id_ruta"));
                pasaje.setRuta(ruta);
                pasaje.setFecha_Viaje(rs.getDate("fecha_viaje").toLocalDate());
                pasaje.setHora_Viaje(rs.getTime("hora_viaje").toLocalTime());
                pasaje.setAsiento(rs.getInt("asiento"));
                pasaje.setPrecio(rs.getDouble("precio"));
                
                pasajes.add(pasaje);  
            }
            
            ps.close();
            rs.close();
                  
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasaje.");
        }

        return pasajes;
    }
    
    
    
        public List<Pasaje> listarPasajesPorPasajero(Pasajero pasajero) {
        
        String sql = "SELECT id_pasaje, id_pasajero, id_colectivo, id_ruta, fecha_viaje, hora_viaje, asiento, precio "
                         + "FROM pasaje "
                         + "WHERE id_pasajero = ?";
           
        ArrayList<Pasaje> pasajes = new ArrayList<>();
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, pasajero.getId_Pasajero());
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
                Pasaje pasaje = new Pasaje();
                
                pasaje.setId_Pasaje(rs.getInt("id_pasaje"));
                
                pasaje.setPasajero(pasajero);
                
                Colectivo colectivo = cd.buscarColectivo(rs.getInt("id_colectivo"));
                pasaje.setColectivo(colectivo);
                Ruta ruta = rd.buscarRuta(rs.getInt("id_ruta"));
                pasaje.setRuta(ruta);
                pasaje.setFecha_Viaje(rs.getDate("fecha_viaje").toLocalDate());
                pasaje.setHora_Viaje(rs.getTime("hora_viaje").toLocalTime());
                pasaje.setAsiento(rs.getInt("asiento"));
                pasaje.setPrecio(rs.getDouble("precio"));
                
                pasajes.add(pasaje);  
            }
            
            ps.close();
            rs.close();
                  
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasaje.");
        }

        return pasajes;
    }
    
        
     public List<Pasaje> listarPasajesPorRuta(Ruta ruta) {
        
        String sql = "SELECT id_pasaje, id_pasajero, id_colectivo, id_ruta, fecha_viaje, hora_viaje, asiento, precio "
                         + "FROM pasaje "
                         + "WHERE id_ruta = ?";
           
        ArrayList<Pasaje> pasajes = new ArrayList<>();
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ruta.getId_Ruta());
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
                Pasaje pasaje = new Pasaje();
                
                pasaje.setId_Pasaje(rs.getInt("id_pasaje"));
                
                Pasajero pasajero = pd.buscarPasajero(rs.getInt("id_pasajero"));
                pasaje.setPasajero(pasajero);
                Colectivo colectivo = cd.buscarColectivo(rs.getInt("id_colectivo"));
                pasaje.setColectivo(colectivo);
               
                pasaje.setRuta(ruta);
                pasaje.setFecha_Viaje(rs.getDate("fecha_viaje").toLocalDate());
                pasaje.setHora_Viaje(rs.getTime("hora_viaje").toLocalTime());
                pasaje.setAsiento(rs.getInt("asiento"));
                pasaje.setPrecio(rs.getDouble("precio"));               
                
                pasajes.add(pasaje);  
            }
            
            ps.close();
            rs.close();
                  
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasaje.");
        }

        return pasajes;
    }
     
     
     public List<Pasaje> listarPasajesPorHorario(LocalTime hora_viaje) {
        
        String sql = "SELECT id_pasaje, id_pasajero, id_colectivo, id_ruta, fecha_viaje, hora_viaje, asiento, precio "
                         + "FROM pasaje "
                         + "WHERE hora_viaje  = ?";
           
        ArrayList<Pasaje> pasajes = new ArrayList<>();
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setTime(1, Time.valueOf(hora_viaje));
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
                Pasaje pasaje = new Pasaje();
                
                pasaje.setId_Pasaje(rs.getInt("id_pasaje"));
                
                Pasajero pasajero = pd.buscarPasajero(rs.getInt("id_pasajero"));
                pasaje.setPasajero(pasajero);
                Colectivo colectivo = cd.buscarColectivo(rs.getInt("id_colectivo"));
                pasaje.setColectivo(colectivo);
                Ruta ruta = rd.buscarRuta(rs.getInt("id_ruta"));
                pasaje.setRuta(ruta);
                
                pasaje.setFecha_Viaje(rs.getDate("fecha_viaje").toLocalDate());
                pasaje.setHora_Viaje(rs.getTime("hora_viaje").toLocalTime());
                pasaje.setAsiento(rs.getInt("asiento"));
                pasaje.setPrecio(rs.getDouble("precio"));

                
                pasajes.add(pasaje);  
            }
            
            ps.close();
            rs.close();
                  
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasaje.");
        }

        return pasajes;
    }
     
     
}
