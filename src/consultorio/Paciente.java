package consultorio;

import java.util.ArrayList;
import java.util.List;

public class Paciente extends Persona {
    private List<Cita> citas = new ArrayList<>();

    public Paciente(String id, String nombre) {
        super(id, nombre);
    }

    public void agregarCita(Cita cita) {
        citas.add(cita);
    }

    @Override
    public String toString() {
        return "Paciente ID: " + id + ", Nombre: " + nombre;
    }
}
