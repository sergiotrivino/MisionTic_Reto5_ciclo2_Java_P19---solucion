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

public class Consulta3_19Dao {
    public ArrayList<Consulta3VO_19> consulta3DAO() throws SQLException {

        ArrayList<Consulta3VO_19> lista = new ArrayList<>();
        String sql = "select ID_proyecto , r.nombre || ' ' || r.primer_apellido as nombreapellido " +
                        "from Proyecto p inner join Lider r on r.ID_Lider = p.ID_Lider " + 
                        "where Banco_Vinculado = 'Bancolombia';";

        Connection conn = JDBCUtilities.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Consulta3VO_19 fila = new Consulta3VO_19();
            fila.setId_proyecto(rs.getString("ID_proyecto")); 
            fila.setNombreapellido(rs.getString("nombreapellido"));

            lista.add(fila); 
        }

        return lista;

    }  
}
