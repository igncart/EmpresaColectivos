package empresacolectivos.accesoADatos;

import empresacolectivos.Entidades.Ruta;
import empresacolectivos.Entidades.Horario;
import java.sql.*;
import java.time.LocalTime;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class HorarioData {
    
private Connection con = null;
private RutaData rd = new RutaData();
    
    public HorarioData(){
        con = Conexion.getConexion();
    }
    

public void registrarHorario(Horario horario) {
    
    String sql = "INSERT INTO horario (id_ruta, hora_salida, hora_llegada, estado) "
                     + "VALUES (?, ?, ?, ?)";
            
    try {

    PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
    
    ps.setInt(1, horario.getRuta().getId_Ruta());
    ps.setTime(2, Time.valueOf(horario.getHora_Salida()));
    ps.setTime(3, Time.valueOf(horario.getHora_Llegada()));
    ps.setBoolean(4, horario.isEstado());
    
    ps.executeUpdate();
    
    ResultSet rs = ps.getGeneratedKeys();
    
    if (rs.next()) {
        
        horario.setId_Horario(rs.getInt(1));
        JOptionPane.showMessageDialog(null, "Horario registrado.");
    }
    ps.close();
    
    } catch (SQLException ex) {
        
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla horario.");
    }
}
    

public void eliminarHorario(int id) {
    
    String sql = "UPDATE horario "
                     + "SET estado = 0 "
                     + "WHERE id_horario = ?";
    
    try {
        
        PreparedStatement ps = con.prepareStatement(sql);
        
        ps.setInt(1,id);
        
        int update = ps.executeUpdate();
        
        if (update == 1) {
            
            JOptionPane.showMessageDialog(null, "Horario eliminado.");
        }

    } catch (SQLException ex) {
        
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla horario.");
    }
}

public void modificarHorario(Horario horario) {
    
    String sql = "UPDATE horario "
            + "SET id_ruta = ?, hora_salida = ?, hora_llegada = ? "
            + "WHERE id_horario = ?";
    
    try {
        
        PreparedStatement ps = con.prepareStatement(sql);
        
        ps.setInt(1, horario.getRuta().getId_Ruta());
        ps.setTime(2, Time.valueOf(horario.getHora_Salida()));
        ps.setTime(3, Time.valueOf(horario.getHora_Llegada()));
        ps.setInt(4,horario.getId_Horario());
        
        int update = ps.executeUpdate();
        
        if (update == 1) {
            
            JOptionPane.showMessageDialog(null, "Horario modificado.");
        }
        
        
    } catch (SQLException ex) {
        
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla horario.");
    }   
}


public List<Horario> listarHorarios() {
    
    String sql = "SELECT id_horario, id_ruta, hora_salida, hora_llegada "
                     + "FROM horario "
                     + "WHERE estado = 1";
    
    ArrayList<Horario> horarios = new ArrayList<>();
    
    try {
        
        PreparedStatement ps = con.prepareStatement(sql);
        
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            
            Horario horario = new Horario();
            
            horario.setId_Horario(rs.getInt("id_horario"));
            Ruta ruta = rd.buscarRuta(rs.getInt("id_ruta"));
            horario.setRuta(ruta);
            horario.setHora_Salida(rs.getTime("hora_salida").toLocalTime());
            horario.setHora_Llegada(rs.getTime("hora_llegada").toLocalTime());
            
            horarios.add(horario);
        }
        
        ps.close();
        rs.close();
        
        
    } catch (SQLException ex) {
        
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla horario.");
    }
    
    
    return horarios;
}


public Horario buscarHorario(int id) {
    
    String sql = "SELECT id_horario, id_ruta, hora_salida, hora_llegada "
                     + "FROM horario "
                     + "WHERE id_horario = ? AND estado = 1";
    
    Horario horario = null;
    
   try {
       
       PreparedStatement ps = con.prepareStatement(sql);
       
       ps.setInt(1, id);
       ResultSet rs = ps.executeQuery();
       
       if (rs.next()) {
           
           horario = new Horario();
           
           horario.setId_Horario(id);
           Ruta ruta = rd.buscarRuta(rs.getInt("id_ruta"));
           horario.setRuta(ruta);
           horario.setHora_Salida(rs.getTime("hora_salida").toLocalTime());
           horario.setHora_Llegada(rs.getTime("hora_llegada").toLocalTime());
           horario.setEstado(true);
           
       } else {
           
           JOptionPane.showMessageDialog(null, "El horario que busca no existe.");
       }
       
        ps.close();
        rs.close();

   } catch (SQLException ex) {
       
       JOptionPane.showMessageDialog(null, "Error al acceder a la tabla horario.");
   }

    return horario;
}


public List<Horario> buscarHorariosPorRuta(Ruta ruta) {
    List<Horario> horarios = new ArrayList<>();
    String sql = "SELECT id_horario, hora_salida, hora_llegada "
                 + "FROM horario "
                 + "WHERE id_ruta = ? AND estado = 1";
    
    try (PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setInt(1, ruta.getId_Ruta());
        try (ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Horario horario = new Horario();
                horario.setId_Horario(rs.getInt("id_horario"));
                horario.setRuta(ruta);
                horario.setHora_Salida(rs.getTime("hora_salida").toLocalTime());
                horario.setHora_Llegada(rs.getTime("hora_llegada").toLocalTime());
                horario.setEstado(true);
                horarios.add(horario);
            }
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla horario: ");
    }
    
    if (horarios.isEmpty()) {
        JOptionPane.showMessageDialog(null, "No se encontraron horarios para la ruta seleccionada.");
    }
    
    return horarios;
}


public List<Horario> buscarHorariosPorSalida(LocalTime hora_salida) {
    String sql = "SELECT id_horario, id_ruta, hora_salida, hora_llegada "
                 + "FROM horario "
                 + "WHERE hora_salida = ? AND estado = 1";
    
    List<Horario> horarios = new ArrayList<>();
    
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setTime(1, Time.valueOf(hora_salida));
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            Horario horario = new Horario();
            horario.setId_Horario(rs.getInt("id_horario"));
            Ruta ruta = rd.buscarRuta(rs.getInt("id_ruta"));
            horario.setRuta(ruta);
            horario.setHora_Salida(hora_salida);
            horario.setHora_Llegada(rs.getTime("hora_llegada").toLocalTime());
            horario.setEstado(true);
            
            horarios.add(horario);
        }
        
        ps.close();
        rs.close();
        
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla horario.");
    }
    
    if (horarios.isEmpty()) {
        JOptionPane.showMessageDialog(null, "No se encontraron horarios para la hora seleccionada.");
    }
    
    return horarios;
}



}
