package farmaciacrud.DAO;

import farmaciacrud.MetodosTrabajos.Cliente;
import farmaciacrud.MetodosTrabajos.Voucher;
import java.util.List;

public interface DaoVoucher {
    
    public boolean buscar(Voucher voucher);
    
    public boolean eliminar(String eliminarVoucher);
    
    public List<?> mostrar();
    
}
