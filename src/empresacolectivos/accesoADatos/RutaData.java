package empresacolectivos.accesoADatos;

import empresacolectivos.Entidades.Ruta;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class RutaData {
    
    private Connection con = null;
    
    public RutaData(){
        con = Conexion.getConexion();
    }


public void registrarRuta(Ruta ruta) {
    
    String sql = "INSERT INTO ruta(origen, destino, duracion_estimada, estado) "
                     + "VALUES (?, ?, ?, ?)";
    
    try {
        
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, ruta.getOrigen());
            ps.setString(2, ruta.getDestino());
            ps.setTime(3, Time.valueOf(ruta.getDuracion_Estimada()));
            ps.setBoolean(4, ruta.isEstado());
            
            ps.executeUpdate();
           
            ResultSet rs = ps.getGeneratedKeys();
   
            if (rs.next()) {
                ruta.setId_Ruta(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Ruta registrada.");
            }
            ps.close();            
            

            } catch (SQLException ex) {
                
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ruta.");
            }
}


public void eliminarRuta(int id) {
    
    String sql = "UPDATE ruta "
                     + "SET estado = 0 "
                     + "WHERE id_ruta = ?";
    
    try {
        
        PreparedStatement ps = con.prepareStatement(sql);
        
        ps.setInt(1, id);
        
        int update = ps.executeUpdate();
        
        if (update == 1) {
            
            JOptionPane.showMessageDialog(null, "Ruta eliminada.");     
        }
  
    } catch (SQLException ex) {
        
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ruta.");
    }
 
}

public void modificarRuta(Ruta ruta) {
 
    String sql = "UPDATE ruta "
                     + "SET origen = ?, destino = ?, duracion_estimada = ? "
                     + "WHERE id_ruta = ?";
    
    try {
        
        PreparedStatement ps = con.prepareStatement(sql);
        
        ps.setString(1, ruta.getOrigen());
        ps.setString(2, ruta.getDestino());
        ps.setTime(3, Time.valueOf(ruta.getDuracion_Estimada()));
        ps.setInt(4, ruta.getId_Ruta());
        
        int update = ps.executeUpdate();
        
        if (update == 1) {
            
            JOptionPane.showMessageDialog(null, "Los datos de la ruta fueron modificados.");
        }
         
    } catch (SQLException ex) {
        
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ruta.");
    }  
}

public List<Ruta> listarRutas() {
    String sql = "SELECT id_ruta, origen, destino, duracion_estimada "
               + "FROM ruta "
               + "WHERE estado = 1";
    
    List<Ruta> rutas = new ArrayList<>();
    
    try (PreparedStatement ps = con.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {
        
        while (rs.next()) {
            Ruta ruta = new Ruta();
            ruta.setId_Ruta(rs.getInt("id_ruta"));
            ruta.setOrigen(rs.getString("origen"));
            ruta.setDestino(rs.getString("destino"));
            ruta.setDuracion_Estimada(rs.getTime("duracion_estimada").toLocalTime());
            ruta.setEstado(true);
            
            rutas.add(ruta);
        }
        
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ruta");
    }
    
    return rutas;
}


public List<Ruta> buscarRutasPorOrigen(String origen) {
    List<Ruta> rutas = new ArrayList<>();
    
    String sql = "SELECT id_ruta, origen, destino, duracion_estimada "
                 + "FROM ruta "
                 + "WHERE origen = ? AND estado = 1";
    
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, origen);
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            Ruta ruta = new Ruta();
            ruta.setId_Ruta(rs.getInt("id_ruta"));
            ruta.setOrigen(origen);
            ruta.setDestino(rs.getString("destino"));
            ruta.setDuracion_Estimada(rs.getTime("duracion_estimada").toLocalTime());
            ruta.setEstado(true);
            
            rutas.add(ruta);
        }
        
        ps.close();
        rs.close();

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ruta.");
    }

    return rutas;
}


public List<Ruta> buscarRutasPorDestino(String destino) {
    List<Ruta> rutas = new ArrayList<>();
    
    String sql = "SELECT id_ruta, origen, destino, duracion_estimada "
                 + "FROM ruta "
                 + "WHERE destino = ? AND estado = 1";
    
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, destino);
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            Ruta ruta = new Ruta();
            ruta.setId_Ruta(rs.getInt("id_ruta"));
            ruta.setOrigen(rs.getString("origen"));
            ruta.setDestino(destino);
            ruta.setDuracion_Estimada(rs.getTime("duracion_estimada").toLocalTime());
            ruta.setEstado(true);
            
            rutas.add(ruta);
        }
        
        ps.close();
        rs.close();

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ruta.");
    }

    return rutas;
}

public Ruta buscarRuta(int id) {
    
    String sql = "SELECT id_ruta, origen, destino, duracion_estimada "
                     + "FROM ruta "
                     + "WHERE id_ruta = ? AND estado = 1";
    
    Ruta ruta = null;
    
   try {
       
       PreparedStatement ps = con.prepareStatement(sql);
       
       ps.setInt(1, id);
       ResultSet rs = ps.executeQuery();
       
       if (rs.next()) {
           
           ruta = new Ruta();
           
           ruta.setId_Ruta(id);
           ruta.setOrigen(rs.getString("origen"));
           ruta.setDestino(rs.getString("destino"));
           ruta.setDuracion_Estimada(rs.getTime("duracion_estimada").toLocalTime());
           ruta.setEstado(true);
           
       } else {
           
           JOptionPane.showMessageDialog(null, "La ruta que busca no existe.");
       }
       
        ps.close();
        rs.close();

   } catch (SQLException ex) {
       
       JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ruta.");
   }

    return ruta;
}

}
