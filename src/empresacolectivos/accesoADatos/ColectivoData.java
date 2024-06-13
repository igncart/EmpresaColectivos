package empresacolectivos.accesoADatos;

import empresacolectivos.Entidades.Colectivo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ColectivoData {
    private Connection con=null;
    
    public ColectivoData(){
        con = Conexion.getConexion();
    }
    
    public void registrarColectivo(Colectivo colectivo){
        String sql = "INSERT INTO colectivo(matricula, marca, modelo, capacidad, estado) "
                + "VALUE (?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, colectivo.getMatricula());
            ps.setString(2, colectivo.getMarca());
            ps.setString(3, colectivo.getModelo());
            ps.setInt(4, colectivo.getCapacidad());
            ps.setBoolean(5, colectivo.isEstado());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                colectivo.setId_Colectivo(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Colectivo Registrado!");
            }
            ps.close();
            
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la Tabla Colectivo");
        }
        
    }
    
    public void eliminarColectivo(int id){
        String sql = "UPDATE colectivo SET estado = 0 WHERE id_colectivo = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            
            int update = ps.executeUpdate();
            
            if(update == 1){
                JOptionPane.showMessageDialog(null, "Colectivo dado de baja");
            }
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la Tabla Colectivo");
        }
    }
    
    public void modificarColectivo(Colectivo colectivo){
        String sql = "UPDATE colectivo SET matricula= ?, marca= ?, modelo= ?, capacidad= ? "
                + " WHERE id_colectivo= ? ";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, colectivo.getMatricula());
            ps.setString(2, colectivo.getMarca());
            ps.setString(3, colectivo.getModelo());
            ps.setInt(4, colectivo.getCapacidad());
            //ps.setBoolean(5, colectivo.isEstado());
            ps.setInt(5, colectivo.getId_Colectivo());
            
            int update = ps.executeUpdate();
            
            if(update == 1 ){
                JOptionPane.showMessageDialog(null, "Colectivo Modificado");
            }
            
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la Tabla Colectivo");
        }
        
        
    }
    
    public List<Colectivo> listarColectivo(){
        String sql = "SELECT id_colectivo, matricula, marca, modelo, capacidad FROM colectivo WHERE estado = 1 ";
        ArrayList <Colectivo> listaColectivos=new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Colectivo colectivo = new Colectivo();
                colectivo.setId_Colectivo(rs.getInt("id_colectivo"));
                colectivo.setMatricula(rs.getString("matricula"));
                colectivo.setMarca(rs.getString("marca"));
                colectivo.setModelo(rs.getString("modelo"));
                colectivo.setCapacidad(rs.getInt("capacidad"));
                
                listaColectivos.add(colectivo);
            }
            
            ps.close();
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la Tabla Colectivo");
        }
        
        return listaColectivos;
        
    }
    
    public Colectivo buscarColectivo(int id) {
    
    String sql = "SELECT id_colectivo, matricula, marca, modelo, capacidad "
                     + "FROM colectivo "
                     + "WHERE id_colectivo = ? AND estado = 1";
    
    Colectivo colectivo = null;
    
   try {
       
       PreparedStatement ps = con.prepareStatement(sql);
       
       ps.setInt(1, id);
       ResultSet rs = ps.executeQuery();
       
       if (rs.next()) {
           
           colectivo = new Colectivo();
           
           colectivo.setId_Colectivo(id);
           colectivo.setMatricula(rs.getString("matricula"));
           colectivo.setMarca(rs.getString("marca"));
           colectivo.setModelo(rs.getString("modelo"));
           colectivo.setCapacidad(rs.getInt("capacidad"));
           colectivo.setEstado(true);
           
       } else {
           
           JOptionPane.showMessageDialog(null, "El colectivo que busca no existe.");
       }
       
        ps.close();
        rs.close();

   } catch (SQLException ex) {
       
       JOptionPane.showMessageDialog(null, "Error al acceder a la tabla colectivo.");
   }

    return colectivo;
}
    
}
