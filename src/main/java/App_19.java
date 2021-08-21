import view.VentanaRequerimientosReto4;
import java.awt.EventQueue;
//import view.VistaRequerimientosReto4;

/**
 * Persistencia Proyectos Construcción
 *
 * import java.sql.SQLException;
import java.sql.Connection;
import util.JDBCUtilities;
import view.*;
 */
public class App_19 {
    public static void main( String[] args ){        
        /** 
        //Casos de prueba 
        //Consulta 1 d
        VistaRequerimientosReto4.consulta1();
        System.out.println();
        //Consulta 2
        VistaRequerimientosReto4.consulta2();
        System.out.println();
        //Consulta 3
        VistaRequerimientosReto4.consulta3();
        System.out.println();
        //////////Fin de los llamados a los requerimientos
        */
        // Ejecutar Swing en otro hilo
        EventQueue.invokeLater(new Runnable(){
            @Override
            public void run() {
                try{
                    VentanaRequerimientosReto4 vista = new VentanaRequerimientosReto4();
                    vista.setVisible(true);
                } catch(Exception e){
                    e.printStackTrace();
                }
                
            }
            
        });
        
    }
}
