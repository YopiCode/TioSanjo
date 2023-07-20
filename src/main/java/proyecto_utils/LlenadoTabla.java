package proyecto_utils;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class LlenadoTabla {

    public static void LlenarTabla(JTable tabla, String[] cabecera, Object[][] datos){
        tabla.setModel(new DefaultTableModel(datos, cabecera));
    }

}
