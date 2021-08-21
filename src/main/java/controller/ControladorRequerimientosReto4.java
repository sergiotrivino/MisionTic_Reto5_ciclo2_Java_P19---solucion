package controller;

//Estructuras de datos (colecciones)
import java.util.ArrayList;

//Modeloos (acceso y objetos contenedores)
import model.dao.*;
import model.vo.*;

//Librerías para bases de datos
import java.sql.SQLException;

public class ControladorRequerimientosReto4 {       

    public ArrayList<Consulta1VO_19> realizarConsulta1() throws SQLException {
        Consulta1_19Dao r1 = new Consulta1_19Dao();
        return r1.consulta1DAO();
    }

    public ArrayList<Consulta2VO_19> realizarConsulta2() throws SQLException {
        Consulta2_19Dao r2 = new Consulta2_19Dao();
        return r2.consulta2DAO();
    }

    public ArrayList<Consulta3VO_19> realizarConsulta3() throws SQLException {
        Consulta3_19Dao r3 = new Consulta3_19Dao();
        return r3.consulta3DAO();
    }
    
}
