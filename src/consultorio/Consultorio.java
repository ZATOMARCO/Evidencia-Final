package consultorio;

import java.util.HashMap;
import java.util.Map;

public class Consultorio {
    private Map<String, Doctor> doctores = new HashMap<>();
    private Map<String, Paciente> pacientes = new HashMap<>();
    private Map<String, Cita> citas = new HashMap<>();
    private Map<String, Administrador> administradores = new HashMap<>();

    public Consultorio() {
        administradores.put("Zato", new Administrador("Zato", "2177"));
    }

    public boolean autenticarAdministrador(String id, String clave) {
        Administrador admin = administradores.get(id);
        return admin != null && admin.verificarCredenciales(id, clave);
    }

    public Doctor darDeAltaDoctor(String id, String nombre, String especialidad) {
        Doctor d = new Doctor(id, nombre, especialidad);
        doctores.put(id, d);
        return d;
    }

    public Paciente darDeAltaPaciente(String id, String nombre) {
        Paciente p = new Paciente(id, nombre);
        pacientes.put(id, p);
        return p;
    }

    public Cita crearCita(String id, String fechaHora, String motivo, String idDoctor, String idPaciente) {
        Cita c = new Cita(id, fechaHora, motivo);
        if (doctores.containsKey(idDoctor)) c.asignarDoctor(doctores.get(idDoctor));
        if (pacientes.containsKey(idPaciente)) c.asignarPaciente(pacientes.get(idPaciente));
        citas.put(id, c);
        return c;
    }

    public void listarDoctores() {
        System.out.println("\n--- Doctores ---");
        doctores.values().forEach(System.out::println);
    }

    public void listarPacientes() {
        System.out.println("\n--- Pacientes ---");
        pacientes.values().forEach(System.out::println);
    }

    public void listarCitas() {
        System.out.println("\n--- Citas ---");
        citas.values().forEach(System.out::println);
    }
}
