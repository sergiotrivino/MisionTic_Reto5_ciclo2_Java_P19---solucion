package model.dao;

//Estructura de datos
import java.util.ArrayList;

//Librerías para SQL y Base de Datos
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Clase para conexión
import util.JDBCUtilities;

//Encapsulamiento de los datos
import model.vo.*;

public class Consulta2_19Dao {
    public ArrayList<Consulta2VO_19> consulta2DAO() throws SQLException {

        ArrayList<Consulta2VO_19> lista = new ArrayList<>();
        String sql = "select id_proyecto, area_max " + 
                        "from Proyecto p inner join Tipo pf on p.id_tipo = pf.id_tipo " + 
                        "where p.Numero_Habitaciones = 2;";

        Connection conn = JDBCUtilities.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Consulta2VO_19 fila = new Consulta2VO_19();
            fila.setId_proyecto(rs.getString("id_proyecto"));
            fila.setArea_max(rs.getString("area_max")); 

            lista.add(fila); 
        }

        return lista;
        
    }  
}
