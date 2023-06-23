package farmaciacrud.DAO;

//import farmaciacrud.MetodosTrabajos.Operadores;
import java.util.List;


public interface DaoOperadores {
    
    //public void registrarOperadores(Operadores operadores);
    
    public boolean registrarOperadores(Object operadores);
    
    public List<?> seleccionar();
    
    public boolean eliminar(String filaELiminar);
    
}
