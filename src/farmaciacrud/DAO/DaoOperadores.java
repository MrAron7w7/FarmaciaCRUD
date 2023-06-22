package farmaciacrud.DAO;

//import farmaciacrud.MetodosTrabajos.Operadores;
import java.util.List;


public interface DaoOperadores {
    
    //public void registrarOperadores(Operadores operadores);
    
    public boolean registrarOperadores(Object operadors);
    
    public List<?> seleccionar();
    
}
