package consultorio;

import java.util.ArrayList;
import java.util.List;

public class Doctor extends Persona {
    private String especialidad;
    private List<Cita> citas = new ArrayList<>();

    public Doctor(String id, String nombre, String especialidad) {
        super(id, nombre);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void agregarCita(Cita cita) {
        citas.add(cita);
    }

    @Override
    public String toString() {
        return "Doctor ID: " + id + ", Nombre: " + nombre + ", Especialidad: " + especialidad;
    }
}
