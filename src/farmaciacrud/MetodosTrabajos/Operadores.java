package farmaciacrud.MetodosTrabajos;

public class Operadores {
    
    private int id;
    private String nombreOperadores;
    private String hora;
    
    
    public Operadores(){
        
    }
    public Operadores(String nombreOperadores, String hora) {
        this.nombreOperadores = nombreOperadores;
        this.hora = hora;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreOperadores() {
        return nombreOperadores;
    }

    public void setNombreOperadores(String nombreOperadores) {
        this.nombreOperadores = nombreOperadores;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
    
    
    
}
