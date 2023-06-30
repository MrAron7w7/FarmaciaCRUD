package farmaciacrud.DAO;

import farmaciacrud.MetodosTrabajos.Cliente;

public interface DaoCliente {
    public void registrar(Cliente cliente,String fila);
    public void eliminar(Cliente cliente);
    public void buscar(Cliente cliente);
    
    public boolean actualizar(int columnaNombre, String filaNombre);
    
    public boolean upda(String con);
}
