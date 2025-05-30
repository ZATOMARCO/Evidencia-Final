package consultorio;

public class Administrador {
    private String identificador;
    private String contrasena;

    public Administrador(String identificador, String contrasena) {
        this.identificador = identificador;
        this.contrasena = contrasena;
    }

    public boolean verificarCredenciales(String id, String clave) {
        return identificador.equals(id) && contrasena.equals(clave);
    }
}
