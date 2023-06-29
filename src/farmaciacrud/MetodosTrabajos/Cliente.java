package farmaciacrud.MetodosTrabajos;

public class Cliente {

    private int id;
    private String nombre;
    private String apellidos;
    private int dni;
    private String busqueda;
    private double precio;

    public Cliente() {

    }

    public Cliente(int id, String nombre, String apellidos, int dni, String busqueda ){
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.busqueda = busqueda;
        
    }

    public Cliente(String nombre, String apellidos, int dni, String busqueda, double precio) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.busqueda = busqueda;
        this.precio = precio;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getBusqueda() {
        return busqueda;
    }

    public void setBusqueda(String busqueda) {
        this.busqueda = busqueda;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    

}
