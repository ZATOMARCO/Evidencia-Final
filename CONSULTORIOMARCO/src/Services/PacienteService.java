package Services;

import models.Paciente;
import java.util.ArrayList;
import java.util.List;

public class PacienteService {
    private List<Paciente> pacientes;

    public PacienteService() {
        this.pacientes = new ArrayList<>();
    }

    // Método para agregar un paciente
    public void agregarPaciente(Paciente paciente) {
        pacientes.add(paciente);
        System.out.println("Paciente agregado correctamente.");
    }

    // Método para listar todos los pacientes
    public void listarPacientes() {
        if (pacientes.isEmpty()) {
            System.out.println("No hay pacientes registrados.");
        } else {
            System.out.println("Lista de pacientes:");
            for (Paciente p : pacientes) {
                System.out.println(p);
            }
        }
    }
}
