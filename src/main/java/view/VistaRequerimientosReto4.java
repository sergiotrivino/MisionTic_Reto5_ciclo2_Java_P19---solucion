package view;

import controller.ControladorRequerimientosReto4;
import model.vo.*;

import java.sql.SQLException;
import java.util.ArrayList;

public class VistaRequerimientosReto4 {
    
    public static final ControladorRequerimientosReto4 controlador = new ControladorRequerimientosReto4();


    public static void consulta1(){
        System.out.println("-----Consulta 1-------"); 
        try{

            ArrayList<Consulta1VO_19> lista = controlador.realizarConsulta1();

            //Encabezado del resultadoo 
            System.out.println("id_proyecto, Fecha_Inicio , Constructora , serial");
            
            //Cada VO cargado, mostrarlo en la vista
            for (Consulta1VO_19 r : lista) {
                System.out.printf("%s %s %s %s %n", r.getId_proyecto(), r.getFecha_Inicio(), r.getConstructora(), r.getSerial());
            }
        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }      
    }

    public static void consulta2(){
        System.out.println("-----Consulta 2-------"); 
        try{

            ArrayList<Consulta2VO_19> lista = controlador.realizarConsulta2();

            //Encabezado del resultado
            System.out.println("id_proyecto, area_max");
            
            //Cada VO cargado, mostrarlo en la vista
            for (Consulta2VO_19 r : lista) {
                System.out.printf("%s %s %n", r.getId_proyecto(), r.getArea_max());
            }
        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }      
    }


    public static void consulta3(){
        System.out.println("-----Consulta 3-------"); 
        try{

            ArrayList<Consulta3VO_19> lista = controlador.realizarConsulta3();

            //Encabezado del resultado
            System.out.println("id_proyecto, nombreapellido");
            //Cada VO cargado, mostrarlo en la vista
            for (Consulta3VO_19 r : lista) {
                System.out.printf("%s %s %n", r.getId_proyecto(), r.getNombreapellido());
            }
        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }      
    }
}
