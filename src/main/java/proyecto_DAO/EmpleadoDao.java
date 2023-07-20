package proyecto_DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyecto_models.Empleado;
import static proyecto_utils.conexion.conectar;

public class EmpleadoDao {

    public boolean verificarCredenciales(Empleado empleado) {
        String query = "select * from empleado where usuario=? and id_tipoempleado=?";

        try (PreparedStatement ps = conectar().prepareCall(query)) {
            ps.setString(1, empleado.getUsuario());
            ps.setInt(2, empleado.getId_tipo());
            ResultSet res = ps.executeQuery();
            while(res.next()){
                String clave = res.getString("clave");
                if (empleado.getClave().equals(clave)) {
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    
    public List<Empleado> listaMozos(){
        List<Empleado> lista = new ArrayList<>();
        
        String query = "select * from empleado where id_tipoempleado=1";
        
        try (PreparedStatement ps = conectar().prepareCall(query)) {
            ResultSet res = ps.executeQuery();
            while(res.next()){
                Empleado empleado = new Empleado();
                empleado.setId_empleado(res.getInt("id_empleado"));
                empleado.setId_tipo(res.getInt("id_tipoempleado"));
                empleado.setUsuario(res.getString("usuario"));
                lista.add(empleado);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lista;
    }
   
    

}
