package farmaciacrud.Consultas;

import farmaciacrud.DAO.DaoOperadoresImpl;
import farmaciacrud.MetodosTrabajos.Operadores;
import farmaciacrud.Ventanas.ventanaPanelHorario;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



public class ConsultaOperadores {
    
    public static void consulta(String nombre, String hora) throws ClassNotFoundException {
        DaoOperadoresImpl operadores_dao = new DaoOperadoresImpl();
        Operadores operadores = new Operadores();
        ventanaPanelHorario datos = new ventanaPanelHorario();
        
        try {
            operadores.setNombreOperadores(nombre.trim());
            operadores.setHora(hora.trim());

            if (operadores.getNombreOperadores().length() > 0 && operadores.getHora().length() > 0) {
                operadores_dao.registrarOperadores(operadores);
                datos.mostrar("operadores");
                Icon check = new ImageIcon("check.png");
                JOptionPane.showMessageDialog(null, "Guardado con exito", "Valido", JOptionPane.WARNING_MESSAGE, check);
            } else {
                Icon wrong = new ImageIcon("wrong.png");
                JOptionPane.showMessageDialog(null, "Los datos no fueron guardados", "invalido", JOptionPane.WARNING_MESSAGE, wrong);
            }
        } catch (Exception e) {
            Icon wrong = new ImageIcon("wrong.png");
            JOptionPane.showMessageDialog(null, "Falta rellenar campos", "Invalido", JOptionPane.WARNING_MESSAGE, wrong);
        }
    }
    
    
    
}
