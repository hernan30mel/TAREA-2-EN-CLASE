public class Cliente {

    public String nombres;

    public String apellidos;

    public Integer dni;

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Cliente(String nombres, String apellidos, Integer dni) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
    }
}
