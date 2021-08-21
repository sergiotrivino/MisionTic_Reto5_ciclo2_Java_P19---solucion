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

public class Consulta1_19Dao {
    public ArrayList<Consulta1VO_19> consulta1DAO() throws SQLException {

        ArrayList<Consulta1VO_19> lista = new ArrayList<>();
        String sql = "Select id_proyecto, Fecha_Inicio, Constructora, Serial " + 
                        "From Proyecto " +
                        "Where id_proyecto < 15;";

        Connection conn = JDBCUtilities.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Consulta1VO_19 fila = new Consulta1VO_19();
            fila.setId_proyecto(rs.getString("id_proyecto"));
            fila.setFecha_Inicio(rs.getString("Fecha_Inicio"));
            fila.setConstructora(rs.getString("Constructora"));
            fila.setSerial(rs.getString("Serial"));

            lista.add(fila); 
        }

        return lista;
    }  
}



