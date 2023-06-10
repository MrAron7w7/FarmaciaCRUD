package farmaciacrud.DAO;

import farmaciacrud.MetodosTrabajos.Cliente;

public interface DaoCliente {
    public void registrar(Cliente cliente);
    public void eliminar(Cliente cliente);
    public void buscar(Cliente cliente);
    public void actualizar(Cliente cliente);
}
