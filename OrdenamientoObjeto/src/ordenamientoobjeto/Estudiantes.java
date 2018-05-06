package ordenamientoobjeto;

/**
 *
 * @author carlos diaz
 */
public class Estudiantes {
    
    private String nombre;
    private String apellido;
    private String identificacion;
    private int puesto;
    private double nota;
    
    public Estudiantes (String nombre, String apellido, String identificacion, int puesto, double nota){
      setNombre(nombre);
      setApellido(apellido);
      setIdentificacion(identificacion);
      setPuesto(puesto);
      setNota(nota);
      
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setIdentificacion(String identifiacion) {
        this.identificacion = identifiacion;
    }

    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    
    public String imprimir () {
        String mensaje;
        mensaje = getNombre() + "" + getApellido() + "" + getNota()+ "" + getPuesto();
        return mensaje;
        
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getIdentifiacion() {
        return identificacion;
    }

    public int getPuesto() {
        return puesto;
    }

    public double getNota() {
        return nota;
    }
    
    
}
    
    